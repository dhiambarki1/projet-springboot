package tn.esprit.dhiambarkicce11.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;
    private BigDecimal tarifJournalier;
    @Enumerated(EnumType.STRING)
    private StatutsVehicule statut;


}
