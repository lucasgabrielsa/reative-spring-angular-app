package io.lucasdev.reactivespring.repository;

import io.lucasdev.reactivespring.model.Reservation;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReservationRepository extends ReactiveCrudRepository<Reservation, String> {

}
