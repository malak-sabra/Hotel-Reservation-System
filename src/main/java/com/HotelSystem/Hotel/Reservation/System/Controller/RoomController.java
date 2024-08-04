package com.HotelSystem.Hotel.Reservation.System.Controller;

import com.HotelSystem.Hotel.Reservation.System.Entity.Room;
import com.HotelSystem.Hotel.Reservation.System.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController
{

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService)
    {
        this.roomService = roomService;
    }

    @PostMapping("/addroom")
    public Room addRoom(@RequestBody Room room) {
        return roomService.addRoom(room);
    }

    @GetMapping("/available")
    public List<Room> availablerooms()
    {
        return roomService.availablerooms();
    }

    @GetMapping("/filter")
    public List<Room> filter(@RequestParam String roomType, @RequestParam String availability)
    {
        return roomService.filter(roomType,availability);
    }

}
