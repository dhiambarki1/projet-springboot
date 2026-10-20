package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Contrat;
import tn.esprit.dhiambarkicce11.service.IContratServices;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("contrats")
public class ContratRestController {

    private final IContratServices contratServices;

    // CREATE
    @PostMapping("add")
    public Contrat add(@RequestBody Contrat contrat) {
        return contratServices.create(contrat);
    }

    // READ (one)
    @GetMapping("get/{idContrat}")
    public Contrat get(@PathVariable Long idContrat) {
        return contratServices.findById(idContrat);
    }

    // READ (all)
    @GetMapping("getAll")
    public List<Contrat> getAll() {
        return contratServices.findAll();
    }

    // UPDATE
    @PutMapping("update")
    public Contrat update(@RequestBody Contrat contrat) {
        return contratServices.update(contrat);
    }

    // DELETE
    @DeleteMapping("delete/{idContrat}")
    public void delete(@PathVariable Long idContrat) {
        contratServices.deleteById(idContrat);
    }
}
