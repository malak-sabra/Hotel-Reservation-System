package com.HotelSystem.Hotel.Reservation.System.Repository;

import com.HotelSystem.Hotel.Reservation.System.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long>
{
    List<Reservation> findByavailabile(String availabile);
    Reservation deleteByRoomId(Long roomId);
}
