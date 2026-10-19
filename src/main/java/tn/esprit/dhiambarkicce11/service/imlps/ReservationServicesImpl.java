package tn.esprit.dhiambarkicce11.service.imlps;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.dhiambarkicce11.domain.Reservation;
import tn.esprit.dhiambarkicce11.repository.IReservationRepository;
import tn.esprit.dhiambarkicce11.service.IReservationServices;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReservationServicesImpl implements IReservationServices {

    private final IReservationRepository reservationRepository;

    @Override
    public Reservation create(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation update(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteById(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation findById(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Reservation not found with id " + id));
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }
}
