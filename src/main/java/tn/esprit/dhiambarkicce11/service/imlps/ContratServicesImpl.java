package tn.esprit.dhiambarkicce11.service.imlps;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhiambarkicce11.domain.Contrat;
import tn.esprit.dhiambarkicce11.repository.IContratRepository;
import tn.esprit.dhiambarkicce11.service.IContratServices;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ContratServicesImpl implements IContratServices {

    private final IContratRepository contratRepository;

    @Override
    public Contrat create(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat update(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteById(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public Contrat findById(Long id) {
        return contratRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Contrat not found with id " + id));
    }

    @Override
    public List<Contrat> findAll() {
        return contratRepository.findAll();
    }
}
