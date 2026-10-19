package tn.esprit.dhiambarkicce11.service.imlps;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhiambarkicce11.domain.Paiement;
import tn.esprit.dhiambarkicce11.repository.IPaiementRepository;
import tn.esprit.dhiambarkicce11.service.IPaiementServices;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PaiementServicesImpl implements IPaiementServices {

    private final IPaiementRepository paiementRepository;

    @Override
    public Paiement findById(Long id) {
        return paiementRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Paiement not found with id " + id));
    }

    @Override
    public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }
}
