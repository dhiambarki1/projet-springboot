package tn.esprit.dhiambarkicce11.service;

import tn.esprit.dhiambarkicce11.domain.Client;

import java.util.List;

public interface IClientServices {
    Client create(Client client);
    Client update(Client client);
    void deleteById(Long id);
    Client findById(Long id);
    List<Client> findAll();
}
