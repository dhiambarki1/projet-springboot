package tn.esprit.dhiambarkicce11.service;

import tn.esprit.dhiambarkicce11.domain.Employe;

import java.util.List;

public interface IEmployeServices {
    Employe create(Employe employe);
    Employe update(Employe employe);
    void deleteById(Long id);
    Employe findById(Long id);
    List<Employe> findAll();
}
