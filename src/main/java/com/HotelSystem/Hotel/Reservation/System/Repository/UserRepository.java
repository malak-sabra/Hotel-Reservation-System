package com.HotelSystem.Hotel.Reservation.System.Repository;

import com.HotelSystem.Hotel.Reservation.System.Entity.Room;
import com.HotelSystem.Hotel.Reservation.System.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String>
{
}
