package com.parmar.validation.requests;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ReservationRequest {
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
