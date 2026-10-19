package tn.esprit.dhiambarkicce11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.dhiambarkicce11.domain.Paiement;

public interface IPaiementRepository extends JpaRepository<Paiement, Long> {
}
