package com.turbo.az.turboAzInJPA.dto.request;

import lombok.Data;

@Data
public class CarRequest {
    private String plate;
    private double price;
    private String year;
    private String colour;
    private String additionalInform;
}
