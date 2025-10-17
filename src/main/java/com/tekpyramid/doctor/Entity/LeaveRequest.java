package com.tekpyramid.doctor.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Builder
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String reason;
    private String status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;



}
