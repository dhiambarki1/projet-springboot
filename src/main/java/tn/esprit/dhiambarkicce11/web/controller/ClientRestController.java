package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Client;
import tn.esprit.dhiambarkicce11.service.IClientServices;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("clients")
public class ClientRestController {

    private final IClientServices clientServices;

    // CREATE
    @PostMapping("add")
    public Client add(@RequestBody Client client) {
        return clientServices.create(client);
    }

    // READ (one)
    @GetMapping("get/{idClient}")
    public Client get(@PathVariable Long idClient) {
        return clientServices.findById(idClient);
    }

    // READ (all)
    @GetMapping("getAll")
    public List<Client> getAll() {
        return clientServices.findAll();
    }

    // UPDATE
    @PutMapping("update")
    public Client update(@RequestBody Client client) {
        return clientServices.update(client);
    }

    // DELETE
    @DeleteMapping("delete/{idClient}")
    public void delete(@PathVariable Long idClient) {
        clientServices.deleteById(idClient);
    }
}
