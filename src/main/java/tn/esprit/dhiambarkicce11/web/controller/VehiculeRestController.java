package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Vehicule;
import tn.esprit.dhiambarkicce11.service.IVehiculeServices;

import java.util.List;

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

    @GetMapping("getAll")
    public List<Vehicule> getAll() {
        return vehiculeServices.findAll();
    }

    @PutMapping("update")
    public Vehicule update(@RequestBody Vehicule vehicule) {
        return vehiculeServices.update(vehicule);
    }

    @DeleteMapping("delete/{idVehicule}")
    public void delete(@PathVariable Long idVehicule) {
        vehiculeServices.deleteById(idVehicule);
    }
}
