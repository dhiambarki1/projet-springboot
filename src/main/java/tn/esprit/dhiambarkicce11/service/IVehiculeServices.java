package tn.esprit.dhiambarkicce11.service;

import tn.esprit.dhiambarkicce11.domain.Vehicule;

import java.util.List;

public interface IVehiculeServices {
    Vehicule create(Vehicule vehicule);
    Vehicule update(Vehicule vehicule);
    void deleteById(Long id);
    Vehicule findById(Long id);
    List<Vehicule> findAll();
}
