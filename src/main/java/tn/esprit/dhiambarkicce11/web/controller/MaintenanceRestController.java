package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Maintenance;
import tn.esprit.dhiambarkicce11.service.IMaintenanceServices;

@RequiredArgsConstructor
@RestController
@RequestMapping("maintenances")
public class MaintenanceRestController {

    private final IMaintenanceServices maintenanceServices;

    @PostMapping("add")
    public Maintenance add(@RequestBody Maintenance maintenance) {
        return maintenanceServices.create(maintenance);
    }

    @GetMapping("get/{idMaintenance}")
    public Maintenance get(@PathVariable Long idMaintenance) {
        return maintenanceServices.findById(idMaintenance);
    }
}
