package io.lucasdev.reactivespring.controller;

import io.lucasdev.reactivespring.model.Reservation;
import io.lucasdev.reactivespring.repository.ReservationRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.awt.*;

@RestController
@RequestMapping(ReservationController.ROOM_V_1_RESERVATION)
@CrossOrigin /* Just for development purposes - fix later */
public class ReservationController {

    public static final String ROOM_V_1_RESERVATION = "/room/v1/reservation/";

    private ReservationRepository reservationRepository;

    public ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping(path = "{roomId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Reservation> getReservationById(@PathVariable String roomId) {
        return this.reservationRepository.findById(roomId);
    }
}
