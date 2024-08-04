package com.HotelSystem.Hotel.Reservation.System.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.lang.reflect.GenericArrayType;

@Component
@Entity
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String email;
    private String phone;
    public User()
    {

    }
    public User(String Id, String name, String email, String phone)
    {
        this.name=name;
        this.email=email;
        this.phone=phone;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getname(){return name;}
    public void setname(String name){this.name=name;}

    public String getemail(){return email;}
    public void setemail(String email){this.email=email;}

    public String getphone(){return phone;}
    public void setphone(String phone){this.phone=phone;}

}
