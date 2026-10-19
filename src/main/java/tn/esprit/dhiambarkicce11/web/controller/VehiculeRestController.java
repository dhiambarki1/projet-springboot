package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Vehicule;
import tn.esprit.dhiambarkicce11.service.IVehiculeServices;

@RequiredArgsConstructor
@RestController
@RequestMapping("vehicules")
public class VehiculeRestController {

    private final IVehiculeServices vehiculeServices;

    @PostMapping("add")
    public Vehicule add(@RequestBody Vehicule vehicule) {
        return vehiculeServices.create(vehicule);
    }

    @GetMapping("get/{idVehicule}")
    public Vehicule get(@PathVariable Long idVehicule) {
        return vehiculeServices.findById(idVehicule);
    }
}
