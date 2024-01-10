package com.parmar.validation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private int bagsCount;

    private String arrivalDate;
    private String departureDate;

    private int roomNumber;
    private double price;
    private String extras;
    private String note;
    private int userId;
}
