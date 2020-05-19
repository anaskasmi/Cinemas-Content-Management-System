package org.sid.cinema.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String nomClient;
    private double prix;
    @Column(unique = true,nullable = true)
    private Integer codePayement;
    private boolean reserve;
    @ManyToOne
    private Place place;
    @ManyToOne
    private Projection projection;
}
