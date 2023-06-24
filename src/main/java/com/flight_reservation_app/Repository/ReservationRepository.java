package com.flight_reservation_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app.entity.Passenger;
import com.flight_reservation_app.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {



}
