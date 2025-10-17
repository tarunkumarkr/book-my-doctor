package com.tekpyramid.doctor.Entity;

import jakarta.persistence.*;
import lombok.*;


import java.util.List;
@Builder
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String roleName;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<Patient> patient;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<Doctor> doctor;

    @OneToOne(mappedBy = "role", cascade = CascadeType.ALL)
    private Admin admin;

}
