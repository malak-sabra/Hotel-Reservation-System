package com.HotelSystem.Hotel.Reservation.System.mapper;

import com.HotelSystem.Hotel.Reservation.System.DTO.UserDTO;
import com.HotelSystem.Hotel.Reservation.System.Entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter
{
    public UserDTO toDTO (User user)
    {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setname(user.getname());
        dto.setemail(user.getemail());
        dto.setphone(user.getphone());
        return dto;
    }

    public User toEntity(UserDTO dto)
    {
        User user = new User();
        user.setId(dto.getId());
        user.setname(dto.getname());
        user.setemail(dto.getemail());
        user.setphone(dto.getphone());
        return user;
    }
}
