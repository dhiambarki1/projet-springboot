package tn.esprit.dhiambarkicce11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.dhiambarkicce11.domain.Reservation;

public interface iReservationRepository extends JpaRepository<Reservation, Long> {
}
