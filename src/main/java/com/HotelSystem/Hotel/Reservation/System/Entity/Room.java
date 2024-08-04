package com.HotelSystem.Hotel.Reservation.System.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Room
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String roomType;
    private String availability;
    public Room()
    {

    }
    public Room(String RoomType, String availability)
    {
        this.roomType =RoomType;
        this.availability=availability;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        Id = Id;
    }

    public String getroomtype(){return roomType;}
    public void setroomtype(String RoomType){this.roomType =RoomType;}

    public String getavailability(){return availability;}
    public void setavailability(String availability){this.availability=availability;}


}
