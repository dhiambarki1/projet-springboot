package tn.esprit.dhiambarkicce11.service.imlps;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhiambarkicce11.domain.Client;
import tn.esprit.dhiambarkicce11.repository.IClientRepository;
import tn.esprit.dhiambarkicce11.service.IClientServices;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientServicesImpl implements IClientServices {

    private final IClientRepository clientRepository;

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client update(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Client not found with id " + id));
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }
}
