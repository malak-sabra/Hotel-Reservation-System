package com.HotelSystem.Hotel.Reservation.System.Controller;

import com.HotelSystem.Hotel.Reservation.System.Entity.User;
import com.HotelSystem.Hotel.Reservation.System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController
{
    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registeruser(@RequestBody User user)
    {
        return userService.registeruser(user);
    }

}
