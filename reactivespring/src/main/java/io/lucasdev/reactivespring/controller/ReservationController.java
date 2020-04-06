package io.lucasdev.reactivespring.controller;

import io.lucasdev.reactivespring.model.Reservation;
import io.lucasdev.reactivespring.repository.ReservationRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(ReservationController.ROOM_V_1_RESERVATION)
@CrossOrigin /* Just for development purposes - fix later */
public class ReservationController {

    public static final String ROOM_V_1_RESERVATION = "/room/v1/reservation/";

    private ReservationRepository reservationRepository;

    ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping(path = "{roomId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Reservation> getReservationById(@PathVariable String roomId) {
        return this.reservationRepository.findById(roomId);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<String> createReservation(@RequestBody Mono<Reservation> reservation) {
        return this.reservationRepository.save(reservation);
    }


    @PutMapping(path = "{roomId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<String> updateReservation(@RequestBody Mono<Reservation> reservation, @PathVariable String roomId) {
//        return this.reservationRepository.save(reservation);
        return Mono.just("{}");
    }

    @DeleteMapping(path = "{roomId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<String> deleteReservation(@RequestBody Mono<Reservation> reservation, @PathVariable String roomId) {
//        return this.reservationRepository.save(reservation);
        return Mono.just("{}");
    }
}
