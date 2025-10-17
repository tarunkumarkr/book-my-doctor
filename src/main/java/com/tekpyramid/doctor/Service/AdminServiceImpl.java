package com.tekpyramid.doctor.Service;

import com.tekpyramid.doctor.Entity.Admin;
import com.tekpyramid.doctor.Entity.Doctor;
import com.tekpyramid.doctor.Repositry.AdminRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{

@Autowired
public AdminRepositry adminRepositry;

    @Override
    public List<Doctor> save(Admin admin) {

        Optional<Admin> optionalAdmin = adminRepositry.findByUserName(admin.getUserName());

        if (!optionalAdmin.isPresent()) {
            throw new RuntimeException("Admin not found: " + admin.getUserName());

        }


        return null;
    }
}
