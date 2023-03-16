package com.turbo.az.turboAzInJPA.util;

import com.turbo.az.turboAzInJPA.exception.CarNotFoundException;

public class ExceptionUtil {
    public static CarNotFoundException exCarNotFound(){
        return new CarNotFoundException("car not found");
    }

}
