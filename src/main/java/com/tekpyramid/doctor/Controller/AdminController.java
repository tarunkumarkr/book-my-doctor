package com.tekpyramid.doctor.Controller;


import com.tekpyramid.doctor.Entity.Admin;
import com.tekpyramid.doctor.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app/admin")
public class AdminController {

    @Autowired
    public AdminService adminService;

    @PostMapping("/admin-login")
    public String loginAdmin(@RequestBody Admin admin){
        adminService.save(admin);
        return "doctor saved successfully";
    }

}

