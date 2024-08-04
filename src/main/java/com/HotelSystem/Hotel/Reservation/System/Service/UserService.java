package com.HotelSystem.Hotel.Reservation.System.Service;

import com.HotelSystem.Hotel.Reservation.System.Entity.User;
import com.HotelSystem.Hotel.Reservation.System.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    private UserRepository userrepository;

    @Autowired
    public UserService(UserRepository userrepository)
    {
        this.userrepository=userrepository;
    }

    public User registeruser(User user)
    {
        return userrepository.save(user);
    }

}
