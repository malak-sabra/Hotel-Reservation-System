package com.HotelSystem.Hotel.Reservation.System.DTO;

public class UserDTO
{
    private Long Id;
    private String name;
    private String email;
    private String phone;
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
