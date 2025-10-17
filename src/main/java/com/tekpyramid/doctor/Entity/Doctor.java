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
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int doctorId;
    private String doctorName;
    private String specialist;
    private long contact;
    private double rating;
    private String email;
    private String password;

    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "doctor")
    private List<LeaveRequest> leaveRequests;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "doctor")
    private  List<Appointment> appointments;

}
