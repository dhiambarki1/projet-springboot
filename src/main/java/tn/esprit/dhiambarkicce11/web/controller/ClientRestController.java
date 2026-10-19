package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Client;
import tn.esprit.dhiambarkicce11.service.IClientServices;

@RequiredArgsConstructor
@RestController
@RequestMapping("clients")
public class ClientRestController {

    private final IClientServices clientServices;

    @PostMapping("add")
    public Client add(@RequestBody Client client) {
        return clientServices.create(client);
    }

    @GetMapping("get/{idClient}")
    public Client get(@PathVariable Long idClient) {
        return clientServices.findById(idClient);
    }
}
