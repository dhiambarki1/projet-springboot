package tn.esprit.dhiambarkicce11.service.imlps;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhiambarkicce11.domain.Maintenance;
import tn.esprit.dhiambarkicce11.repository.IMaintenanceRepository;
import tn.esprit.dhiambarkicce11.service.IMaintenanceServices;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MaintenanceServicesImpl implements IMaintenanceServices {

    private final IMaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance create(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance update(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void deleteById(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public Maintenance findById(Long id) {
        return maintenanceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Maintenance not found with id " + id));
    }

    @Override
    public List<Maintenance> findAll() {
        return maintenanceRepository.findAll();
    }
}
