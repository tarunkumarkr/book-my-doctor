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
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String password;
    private String patientName;
    private String gender;
    private int age;
    private long phone;
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "patient")
    //@JoinColumn(name = "role_id")
    private List<Appointment> appointment;

}
