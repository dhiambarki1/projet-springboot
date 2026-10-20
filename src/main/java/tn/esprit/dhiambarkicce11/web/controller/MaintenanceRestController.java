package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Maintenance;
import tn.esprit.dhiambarkicce11.service.IMaintenanceServices;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("maintenances")
public class MaintenanceRestController {

    private final IMaintenanceServices maintenanceServices;

    // CREATE
    @PostMapping("add")
    public Maintenance add(@RequestBody Maintenance maintenance) {
        return maintenanceServices.create(maintenance);
    }

    // READ (one)
    @GetMapping("get/{idMaintenance}")
    public Maintenance get(@PathVariable Long idMaintenance) {
        return maintenanceServices.findById(idMaintenance);
    }

    // READ (all)
    @GetMapping("getAll")
    public List<Maintenance> getAll() {
        return maintenanceServices.findAll();
    }

    // UPDATE
    @PutMapping("update")
    public Maintenance update(@RequestBody Maintenance maintenance) {
        return maintenanceServices.update(maintenance);
    }

    // DELETE
    @DeleteMapping("delete/{idMaintenance}")
    public void delete(@PathVariable Long idMaintenance) {
        maintenanceServices.deleteById(idMaintenance);
    }
}
