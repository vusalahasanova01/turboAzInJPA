package com.turbo.az.turboAzInJPA.dto.request;

import com.turbo.az.turboAzInJPA.model.CarState;
import lombok.Data;

@Data
public class CarRequest {

    private Long id;
    private String plate;
    private double price;
    private String year;
    private String colour;
    private CarState carState;
    private String additionalInformation;
}
