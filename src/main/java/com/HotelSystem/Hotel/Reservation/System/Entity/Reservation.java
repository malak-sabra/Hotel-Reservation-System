package com.HotelSystem.Hotel.Reservation.System.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
import java.time.LocalDate;


@Component
@Entity
public class Reservation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long UserId;
    private Long roomId;
    private LocalDate checkindate;
    private LocalDate checkoutdate;
    private String availabile;
    public Reservation()
    {

    }
    public Reservation(Long UserId,Long RoomId,LocalDate checkindate,LocalDate checkoutdate,String availabile)
    {
        this.UserId=UserId;
        this.roomId =RoomId;
        this.checkindate=checkindate;
        this.checkoutdate=checkoutdate;
        this.availabile = availabile;
    }

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

    public LocalDate getcheckindate(){return checkindate;}
    public void getcheckindate(LocalDate checkindate){this.checkindate=checkindate;}

    public LocalDate getcheckoutdate(){return checkoutdate;}
    public void setcheckoutdate(LocalDate checkoutdate){this.checkoutdate=checkoutdate;}

    public String getavailabile(){return availabile;}
    public void setavailabile(String availabile){this.availabile =availabile;}

}
