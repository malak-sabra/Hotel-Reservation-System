package com.HotelSystem.Hotel.Reservation.System.Service;

import com.HotelSystem.Hotel.Reservation.System.Entity.Room;
import com.HotelSystem.Hotel.Reservation.System.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService
{
    private RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository)
    {
        this.roomRepository = roomRepository;
    }

    public Room addRoom(Room room) {
        return roomRepository.save(room);
    }

    public List<Room> availablerooms()
    {
        return roomRepository.findByAvailability("Available");
    }

    public List<Room> filter(String roomType, String availability)
    {
        return roomRepository.findByRoomTypeAndAvailability(roomType,availability);
    }
}
