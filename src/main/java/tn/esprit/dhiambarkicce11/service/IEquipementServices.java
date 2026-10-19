package tn.esprit.dhiambarkicce11.service;

import tn.esprit.dhiambarkicce11.domain.Equipement;

import java.util.List;

public interface IEquipementServices {
    Equipement create(Equipement equipement);
    Equipement update(Equipement equipement);
    void deleteById(Long id);
    Equipement findById(Long id);
    List<Equipement> findAll();
}
