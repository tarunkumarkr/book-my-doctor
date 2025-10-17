package com.tekpyramid.doctor.Service;

import com.tekpyramid.doctor.Entity.Admin;
import com.tekpyramid.doctor.Entity.Doctor;

import java.util.List;

public interface AdminService {
    List<Doctor> save(Admin admin);
}
