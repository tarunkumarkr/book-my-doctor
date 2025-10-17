package com.tekpyramid.doctor.Response;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class FailureResponse {

    private  String message;
    private boolean error;
    private HttpStatus httpStatus;
    private Object data;

}
