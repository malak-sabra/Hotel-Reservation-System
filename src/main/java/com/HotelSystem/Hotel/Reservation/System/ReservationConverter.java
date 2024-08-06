package com.HotelSystem.Hotel.Reservation.System.mapper;

import com.HotelSystem.Hotel.Reservation.System.DTO.ReservationDTO;
import com.HotelSystem.Hotel.Reservation.System.Entity.Reservation;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ReservationConverter
{
    public ReservationDTO toDTO(Reservation reservation)
    {
        ReservationDTO dto = new ReservationDTO();
        dto.setId(reservation.getId());
        dto.setRoomId(reservation.getRoomId());
        dto.setUserId(reservation.getUserId());
        dto.setCheckindate(reservation.getCheckindate());
        dto.setCheckoutdate(reservation.getcheckoutdate());
        dto.setAvailabile(reservation.getavailabile());
        return dto;
    }

    public Reservation toEntity(ReservationDTO dto)
    {
        Reservation reservation = new Reservation();
        reservation.setId(dto.getId());
        reservation.setUserId(dto.getUserId());
        reservation.setRoomId(dto.getRoomId());
        reservation.setCheckindate(dto.getCheckindate());
        reservation.setcheckoutdate(dto.getCheckoutdate());
        reservation.setavailabile(dto.getAvailabile());
        return reservation;
    }
}
