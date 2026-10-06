package tn.esprit.dhiambarkicce11.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    @Enumerated(EnumType.STRING)
    private StatutReservation statut;
}
