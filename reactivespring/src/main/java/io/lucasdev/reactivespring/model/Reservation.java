package io.lucasdev.reactivespring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Document
public class Reservation {

    @Id
    @Getter
    private String id;

    @Getter @Setter
    private Long roomNumber;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Getter @Setter
    private LocalDate checkIn;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Getter @Setter
    private LocalDate checkOut;
    @Getter @Setter
    private BigDecimal price;

    public Reservation(Long roomNumber, LocalDate checkIn, LocalDate checkOut, BigDecimal price) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.price = price;
    }

}
