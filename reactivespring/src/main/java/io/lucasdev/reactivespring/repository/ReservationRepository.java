package io.lucasdev.reactivespring.repository;

import io.lucasdev.reactivespring.model.Reservation;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends ReactiveMongoRepository<Reservation, String> {
}
