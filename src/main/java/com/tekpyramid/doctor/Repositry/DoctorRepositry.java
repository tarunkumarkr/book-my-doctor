package com.tekpyramid.doctor.Repositry;

import com.tekpyramid.doctor.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorRepositry extends JpaRepository<Doctor,Integer> {
    Optional<Doctor> findByEmail(String email);
}
