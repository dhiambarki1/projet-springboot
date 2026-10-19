package tn.esprit.dhiambarkicce11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.dhiambarkicce11.domain.Maintenance;

public interface IMaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
