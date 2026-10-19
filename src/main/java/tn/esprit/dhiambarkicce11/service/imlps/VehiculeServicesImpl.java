package tn.esprit.dhiambarkicce11.service.imlps;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhiambarkicce11.domain.Vehicule;
import tn.esprit.dhiambarkicce11.repository.IVehiculeRepository;
import tn.esprit.dhiambarkicce11.service.IVehiculeServices;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehiculeServicesImpl implements IVehiculeServices {

    private final IVehiculeRepository vehiculeRepository;

    @Override
    public Vehicule create(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule update(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteById(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public Vehicule findById(Long id) {
        return vehiculeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Vehicule not found with id " + id));
    }

    @Override
    public List<Vehicule> findAll() {
        return vehiculeRepository.findAll();
    }
}
