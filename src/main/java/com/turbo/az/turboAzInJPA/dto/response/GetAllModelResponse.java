package com.turbo.az.turboAzInJPA.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllModelResponse {
    private Long id;
    private String name;
    private String brandName;
}
