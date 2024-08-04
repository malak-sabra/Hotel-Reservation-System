package com.HotelSystem.Hotel.Reservation.System.Service;

import com.HotelSystem.Hotel.Reservation.System.Entity.Reservation;
import com.HotelSystem.Hotel.Reservation.System.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService
{

    private ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository)
    {
        this.reservationRepository = reservationRepository;
    }

    public Reservation newreservation(Reservation reservation)
    {
        return reservationRepository.save(reservation);
    }

    public List<Reservation> existingreservation()
    {
        return reservationRepository.findByavailabile("Occupied");
    }

    public Reservation updatedetails(Reservation reservation)
    {
        return reservationRepository.save(reservation);
    }

    public Reservation cancelreservation(Long roomId)
    {
        return reservationRepository.deleteByRoomId(roomId);
    }
}
