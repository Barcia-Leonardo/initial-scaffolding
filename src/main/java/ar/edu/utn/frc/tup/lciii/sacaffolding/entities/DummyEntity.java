package ar.edu.utn.frc.tup.lciii.sacaffolding.entities;

import jakarta.persistence.*;

@Entity
public class DummyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" ,nullable = false)
    private Long id;

    private String dummy;
}
