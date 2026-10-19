package tn.esprit.dhiambarkicce11.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.dhiambarkicce11.domain.Reservation;
import tn.esprit.dhiambarkicce11.service.IReservationServices;

@RequiredArgsConstructor
@RestController
@RequestMapping("reservations")
public class ReservationRestController {

    private final IReservationServices reservationServices;

    @PostMapping("add")
    public Reservation add(@RequestBody Reservation reservation) {
        return reservationServices.create(reservation);
    }

    @GetMapping("get/{idReservation}")
    public Reservation get(@PathVariable Long idReservation) {
        return reservationServices.findById(idReservation);
    }
}
