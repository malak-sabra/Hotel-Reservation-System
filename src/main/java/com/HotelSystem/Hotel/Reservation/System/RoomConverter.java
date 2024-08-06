package com.HotelSystem.Hotel.Reservation.System.mapper;

import com.HotelSystem.Hotel.Reservation.System.DTO.RoomDTO;
import com.HotelSystem.Hotel.Reservation.System.Entity.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomConverter
{
    public RoomDTO toDTO(Room room)
    {
        RoomDTO dto = new RoomDTO();
        dto.setId(room.getId());
        dto.setRoomType(room.getroomtype());
        dto.setAvailability(room.getavailability());
        return dto;
    }

    public Room toEntity(RoomDTO dto)
    {
        Room room = new Room();
        room.setId(dto.getId());
        room.setroomtype(dto.getRoomType());
        room.setavailability(dto.getAvailability());
        return room;
    }


}
