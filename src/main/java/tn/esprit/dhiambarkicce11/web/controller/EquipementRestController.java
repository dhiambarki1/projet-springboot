package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Equipement;
import tn.esprit.dhiambarkicce11.service.IEquipementServices;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("equipements")
public class EquipementRestController {

    private final IEquipementServices equipementServices;

    // CREATE
    @PostMapping("add")
    public Equipement add(@RequestBody Equipement equipement) {
        return equipementServices.create(equipement);
    }

    // READ (one)
    @GetMapping("get/{idEquipement}")
    public Equipement get(@PathVariable Long idEquipement) {
        return equipementServices.findById(idEquipement);
    }

    // READ (all)
    @GetMapping("getAll")
    public List<Equipement> getAll() {
        return equipementServices.findAll();
    }

    // UPDATE
    @PutMapping("update")
    public Equipement update(@RequestBody Equipement equipement) {
        return equipementServices.update(equipement);
    }

    // DELETE
    @DeleteMapping("delete/{idEquipement}")
    public void delete(@PathVariable Long idEquipement) {
        equipementServices.deleteById(idEquipement);
    }
}
