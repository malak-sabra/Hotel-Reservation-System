package com.HotelSystem.Hotel.Reservation.System.Controller;

import com.HotelSystem.Hotel.Reservation.System.Entity.Reservation;
import com.HotelSystem.Hotel.Reservation.System.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController
{
    private ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService)
    {
        this.reservationService = reservationService;
    }

    @PostMapping("/newreservation")
    public Reservation newreservation(@RequestBody Reservation reservation)
    {
        return reservationService.newreservation(reservation);
    }

    @GetMapping("/existingreservation")
    public List<Reservation> existingreservation()
    {
        return reservationService.existingreservation();
    }

    @PostMapping("/updatereservation")
    public Reservation updatedetails(@RequestBody Reservation reservation)
    {
        return reservationService.updatedetails(reservation);
    }

    @DeleteMapping ("/cancelreservation")
    public Reservation cancelreservation(@RequestBody Long roomId)
    {
        return reservationService.cancelreservation(roomId);
    }
}
