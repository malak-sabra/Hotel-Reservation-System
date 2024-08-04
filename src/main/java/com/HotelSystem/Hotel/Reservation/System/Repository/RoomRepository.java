package com.HotelSystem.Hotel.Reservation.System.Repository;

import com.HotelSystem.Hotel.Reservation.System.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Long>
{
    List<Room> findByAvailability(String availability);
    List<Room> findByRoomTypeAndAvailability(String roomType, String availability);
}
