package com.parmar.validation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class HotelReservationController {

    @GetMapping("/info")
    public String test() {
        return "Congratulations you tested your code successfully";
    }
}
