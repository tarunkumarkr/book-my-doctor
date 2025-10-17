package com.tekpyramid.doctor.Dto;

import com.tekpyramid.doctor.Entity.Role;
import lombok.Data;

@Data
public class DoctorDto {


    private String doctorName;
    private String specialist;
    private long contact;
    private double rating;
    private String email;
    private String password;

    private Role role;
}
