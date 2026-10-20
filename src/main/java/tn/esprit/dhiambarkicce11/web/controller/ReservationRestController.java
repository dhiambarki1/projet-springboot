package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Reservation;
import tn.esprit.dhiambarkicce11.service.IReservationServices;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("reservations")
public class ReservationRestController {

    private final IReservationServices reservationServices;

    // CREATE
    @PostMapping("add")
    public Reservation add(@RequestBody Reservation reservation) {
        return reservationServices.create(reservation);
    }

    // READ (one)
    @GetMapping("get/{idReservation}")
    public Reservation get(@PathVariable Long idReservation) {
        return reservationServices.findById(idReservation);
    }

    // READ (all)
    @GetMapping("getAll")
    public List<Reservation> getAll() {
        return reservationServices.findAll();
    }

    // UPDATE
    @PutMapping("update")
    public Reservation update(@RequestBody Reservation reservation) {
        return reservationServices.update(reservation);
    }

    // DELETE
    @DeleteMapping("delete/{idReservation}")
    public void delete(@PathVariable Long idReservation) {
        reservationServices.deleteById(idReservation);
    }
}
