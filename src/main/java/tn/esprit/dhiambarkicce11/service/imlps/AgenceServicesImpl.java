package tn.esprit.dhiambarkicce11.service.imlps;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhiambarkicce11.domain.Agence;
import tn.esprit.dhiambarkicce11.repository.IAgenceRepository;
import tn.esprit.dhiambarkicce11.service.IAgenceServices;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AgenceServicesImpl implements IAgenceServices {

    private final IAgenceRepository agenceRepository;

    @Override
    public Agence create(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence update(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteById(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public Agence findById(Long id) {
        return agenceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Agence not found with id " + id));
    }

    @Override
    public List<Agence> findAll() {
        return agenceRepository.findAll();
    }
}
