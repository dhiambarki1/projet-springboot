package tn.esprit.dhiambarkicce11.service;

import tn.esprit.dhiambarkicce11.domain.Reservation;

import java.util.List;

public interface IReservationServices {
    Reservation create(Reservation reservation);
    Reservation update(Reservation reservation);
    void deleteById(Long id);
    Reservation findById(Long id);
    List<Reservation> findAll();
}
