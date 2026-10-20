package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Agence;
import tn.esprit.dhiambarkicce11.service.IAgenceServices;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("agences")
public class AgenceRestController {

    private final IAgenceServices agenceServices;

    @PostMapping("add")
    public Agence add(@RequestBody Agence agence) {
        return agenceServices.create(agence);
    }

    @GetMapping("get/{idAgence}")
    public Agence get(@PathVariable Long idAgence) {
        return agenceServices.findById(idAgence);
    }

    @GetMapping("getAll")
    public List<Agence> getAll() {
        return agenceServices.findAll();
    }

    @PutMapping("update")
    public Agence update(@RequestBody Agence agence) {
        return agenceServices.update(agence);
    }

    @DeleteMapping("delete/{idAgence}")
    public void delete(@PathVariable Long idAgence) {
        agenceServices.deleteById(idAgence);
    }
}
