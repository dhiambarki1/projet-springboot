package tn.esprit.dhiambarkicce11.service;

import tn.esprit.dhiambarkicce11.domain.Maintenance;

import java.util.List;

public interface IMaintenanceServices {
    Maintenance create(Maintenance maintenance);
    Maintenance update(Maintenance maintenance);
    void deleteById(Long id);
    Maintenance findById(Long id);
    List<Maintenance> findAll();
}
