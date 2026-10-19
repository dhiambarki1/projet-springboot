package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Paiement;
import tn.esprit.dhiambarkicce11.service.IPaiementServices;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("paiements")
public class PaiementRestController {

    private final IPaiementServices paiementServices;

    @GetMapping("get/{idPaiement}")
    public Paiement get(@PathVariable Long idPaiement) {
        return paiementServices.findById(idPaiement);
    }

    @GetMapping("getAll")
    public List<Paiement> getAll() {
        return paiementServices.findAll();
    }
}
