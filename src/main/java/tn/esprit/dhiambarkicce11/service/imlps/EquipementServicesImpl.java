package tn.esprit.dhiambarkicce11.service.imlps;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhiambarkicce11.domain.Equipement;
import tn.esprit.dhiambarkicce11.repository.IEquipementRepository;
import tn.esprit.dhiambarkicce11.service.IEquipementServices;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EquipementServicesImpl implements IEquipementServices {

    private final IEquipementRepository equipementRepository;

    @Override
    public Equipement create(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement update(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void deleteById(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public Equipement findById(Long id) {
        return equipementRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Equipement not found with id " + id));
    }

    @Override
    public List<Equipement> findAll() {
        return equipementRepository.findAll();
    }
}
