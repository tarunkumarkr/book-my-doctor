package com.tekpyramid.doctor.Exception;

public class DuplicationExceptionHandler extends RuntimeException {
    public DuplicationExceptionHandler(String message) {
        super(message);
    }

    public DuplicationExceptionHandler(){
        super("Duplicate record aldready exists");
    }
}
