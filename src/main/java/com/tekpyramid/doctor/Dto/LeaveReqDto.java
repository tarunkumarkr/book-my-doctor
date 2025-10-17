package com.tekpyramid.doctor.Dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LeaveReqDto {
    private LocalDate fromDate;
    private LocalDate toDate;
    private String reason;
    private String status;

    private int doctorId;
}
