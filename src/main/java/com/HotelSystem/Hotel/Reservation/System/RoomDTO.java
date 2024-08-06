package com.HotelSystem.Hotel.Reservation.System.DTO;


public class RoomDTO
{
    private long Id;
    private String roomType;
    private String availability;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
