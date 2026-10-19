package tn.esprit.dhiambarkicce11.service;

import tn.esprit.dhiambarkicce11.domain.Agence;

import java.util.List;

public interface IAgenceServices {
    Agence create(Agence agence);
    Agence update(Agence agence);
    void deleteById(Long id);
    Agence findById(Long id);
    List<Agence> findAll();
}
