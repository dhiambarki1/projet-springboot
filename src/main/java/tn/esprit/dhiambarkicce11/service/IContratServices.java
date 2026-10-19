package tn.esprit.dhiambarkicce11.service;

import tn.esprit.dhiambarkicce11.domain.Contrat;

import java.util.List;

public interface IContratServices {
    Contrat create(Contrat contrat);
    Contrat update(Contrat contrat);
    void deleteById(Long id);
    Contrat findById(Long id);
    List<Contrat> findAll();
}
