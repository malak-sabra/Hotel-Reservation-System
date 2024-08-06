package com.HotelSystem.Hotel.Reservation.System.DTO;

import java.time.LocalDate;

public class ReservationDTO
{
    private Long Id;
    private Long UserId;
    private Long roomId;
    private LocalDate checkindate;
    private LocalDate checkoutdate;
    private String availabile;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public LocalDate getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(LocalDate checkindate) {
        this.checkindate = checkindate;
    }

    public LocalDate getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(LocalDate checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    public String getAvailabile() {
        return availabile;
    }

    public void setAvailabile(String availabile) {
        this.availabile = availabile;
    }
}
