package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Employe;
import tn.esprit.dhiambarkicce11.service.IEmployeServices;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("employes")
public class EmployeRestController {

    private final IEmployeServices employeServices;

    // CREATE
    @PostMapping("add")
    public Employe add(@RequestBody Employe employe) {
        return employeServices.create(employe);
    }

    // READ (one)
    @GetMapping("get/{idEmploye}")
    public Employe get(@PathVariable Long idEmploye) {
        return employeServices.findById(idEmploye);
    }

    // READ (all)
    @GetMapping("getAll")
    public List<Employe> getAll() {
        return employeServices.findAll();
    }

    // UPDATE
    @PutMapping("update")
    public Employe update(@RequestBody Employe employe) {
        return employeServices.update(employe);
    }

    // DELETE
    @DeleteMapping("delete/{idEmploye}")
    public void delete(@PathVariable Long idEmploye) {
        employeServices.deleteById(idEmploye);
    }
}
