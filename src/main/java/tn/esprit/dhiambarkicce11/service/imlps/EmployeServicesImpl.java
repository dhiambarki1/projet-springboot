package tn.esprit.dhiambarkicce11.service.imlps;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhiambarkicce11.domain.Employe;
import tn.esprit.dhiambarkicce11.repository.IEmployeRepository;
import tn.esprit.dhiambarkicce11.service.IEmployeServices;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeServicesImpl implements IEmployeServices {

    private final IEmployeRepository employeRepository;

    @Override
    public Employe create(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe update(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteById(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public Employe findById(Long id) {
        return employeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employe not found with id " + id));
    }

    @Override
    public List<Employe> findAll() {
        return employeRepository.findAll();
    }
}
