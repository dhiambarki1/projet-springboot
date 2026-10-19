package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Equipement;
import tn.esprit.dhiambarkicce11.service.IEquipementServices;

@RequiredArgsConstructor
@RestController
@RequestMapping("equipements")
public class EquipementRestController {

    private final IEquipementServices equipementServices;

    @PostMapping("add")
    public Equipement add(@RequestBody Equipement equipement) {
        return equipementServices.create(equipement);
    }

    @GetMapping("get/{idEquipement}")
    public Equipement get(@PathVariable Long idEquipement) {
        return equipementServices.findById(idEquipement);
    }
}
