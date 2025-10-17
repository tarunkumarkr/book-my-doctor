package com.tekpyramid.doctor.Service;

import com.tekpyramid.doctor.Dto.DoctorDto;
import com.tekpyramid.doctor.Dto.DoctorLoginDto;
import com.tekpyramid.doctor.Dto.LeaveReqDto;
import com.tekpyramid.doctor.Entity.Doctor;

public interface DoctorService {
    String save(DoctorDto doctorDto);


    Doctor login(DoctorLoginDto doctorLoginDto);

    String leavereq(LeaveReqDto leaveReqDto);
}

