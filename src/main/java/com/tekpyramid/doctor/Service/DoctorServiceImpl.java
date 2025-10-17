package com.tekpyramid.doctor.Service;

import com.tekpyramid.doctor.Dto.DoctorDto;
import com.tekpyramid.doctor.Dto.DoctorLoginDto;
import com.tekpyramid.doctor.Dto.LeaveReqDto;
import com.tekpyramid.doctor.Entity.Doctor;
import com.tekpyramid.doctor.Exception.DuplicationExceptionHandler;
import com.tekpyramid.doctor.Repositry.DoctorRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    public DoctorRepositry doctorRepositry;

    @Override
    public String save(DoctorDto doctorDto) {

        String email = doctorDto.getEmail();
        Optional<Doctor> optional = doctorRepositry.findByEmail(email);

        if (optional.isPresent()) {
            throw new DuplicationExceptionHandler("Email already Exist");
        }

        Doctor doctor = Doctor.builder().doctorName(doctorDto.getDoctorName())
                .contact(doctorDto.getContact())
                .email(doctorDto.getEmail())
                .password(doctorDto.getPassword())
                .specialist(doctorDto.getSpecialist())
                .rating(doctorDto.getRating())
                .role(doctorDto.getRole())
                .build();


        doctorRepositry.save(doctor);


        return "saved successfully";
    }

    @Override
    public Doctor login(DoctorLoginDto doctorLoginDto) {

        Optional<Doctor> email = doctorRepositry.findByEmail(doctorLoginDto.getEmail());

        if (email.isEmpty()) {
            throw new RuntimeException("Email does not exist");
        }
        Doctor doctor = email.get();

        if (!doctor.getPassword().equals(doctorLoginDto.getPassword())) {
            throw new RuntimeException("Wrong password");
        }
        return doctor;

    }

    @Override
    public String leavereq(LeaveReqDto leaveReqDto) {

      //  if(leaveReqDto.getDoctorId()){

        //}

        return "";
    }


}
