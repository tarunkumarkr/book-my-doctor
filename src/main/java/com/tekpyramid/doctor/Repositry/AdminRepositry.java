package com.tekpyramid.doctor.Repositry;

import com.tekpyramid.doctor.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepositry extends JpaRepository<Admin,Integer> {

    Optional<Admin> findByUserName(String userName);
}
