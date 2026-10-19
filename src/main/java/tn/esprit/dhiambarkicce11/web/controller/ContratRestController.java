package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Contrat;
import tn.esprit.dhiambarkicce11.service.IContratServices;

@RequiredArgsConstructor
@RestController
@RequestMapping("contrats")
public class ContratRestController {

    private final IContratServices contratServices;

    @PostMapping("add")
    public Contrat add(@RequestBody Contrat contrat) {
        return contratServices.create(contrat);
    }

    @GetMapping("get/{idContrat}")
    public Contrat get(@PathVariable Long idContrat) {
        return contratServices.findById(idContrat);
    }
}
