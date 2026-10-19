package tn.esprit.dhiambarkicce11.service;

import tn.esprit.dhiambarkicce11.domain.Paiement;

import java.util.List;

public interface IPaiementServices {
    Paiement findById(Long id);
    List<Paiement> findAll();
}
