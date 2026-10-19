package tn.esprit.dhiambarkicce11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.dhiambarkicce11.domain.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {
}
