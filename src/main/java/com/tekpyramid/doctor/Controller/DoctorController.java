package com.tekpyramid.doctor.Controller;

import com.tekpyramid.doctor.Dto.DoctorDto;
import com.tekpyramid.doctor.Dto.DoctorLoginDto;
import com.tekpyramid.doctor.Dto.LeaveReqDto;
import com.tekpyramid.doctor.Entity.Doctor;
import com.tekpyramid.doctor.Response.SucessResponse;
import com.tekpyramid.doctor.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/app/doctor")
@RestController
public class DoctorController {

    @Autowired
    public DoctorService doctorService;

    @PostMapping("/signup")
    public ResponseEntity<SucessResponse> save(@RequestBody DoctorDto doctorDto) {

        String saved = doctorService.save(doctorDto);
        SucessResponse successResponse = new SucessResponse();

        successResponse.setMessage(saved);
        successResponse.setError(false);
        successResponse.setHttpStatus(HttpStatus.CREATED);
        successResponse.setData(null);

        return ResponseEntity.status(HttpStatus.CREATED).body(successResponse);
    }

    @PostMapping("/login")
    public ResponseEntity<SucessResponse> login(@RequestBody DoctorLoginDto doctorLoginDto) {

        Doctor logindoc = doctorService.login(doctorLoginDto);

        SucessResponse successResponse = new SucessResponse();

        successResponse.setMessage("Login successful");
        successResponse.setError(false);
        successResponse.setHttpStatus(HttpStatus.ACCEPTED);
        successResponse.setData(logindoc);

        return ResponseEntity.status(HttpStatus.ACCEPTED.value()).body(successResponse);
    }

    @PostMapping("/leave")
    public  ResponseEntity<SucessResponse> leave(@RequestBody LeaveReqDto leaveReqDto){

        String saved = doctorService.leavereq(leaveReqDto);
        SucessResponse successResponse = new SucessResponse();

        successResponse.setMessage(saved);
        successResponse.setError(false);
        successResponse.setHttpStatus(HttpStatus.CREATED);
        successResponse.setData(null);

        return ResponseEntity.status(HttpStatus.CREATED).body(successResponse);
    }



}
