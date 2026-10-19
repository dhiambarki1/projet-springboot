package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Employe;
import tn.esprit.dhiambarkicce11.service.IEmployeServices;

@RequiredArgsConstructor
@RestController
@RequestMapping("employes")
public class EmployeRestController {

    private final IEmployeServices employeServices;

    @PostMapping("add")
    public Employe add(@RequestBody Employe employe) {
        return employeServices.create(employe);
    }

    @GetMapping("get/{idEmploye}")
    public Employe get(@PathVariable Long idEmploye) {
        return employeServices.findById(idEmploye);
    }
}
