package com.turbo.az.turboAzInJPA.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CarState {
    AVAILABLE(1),
    SOLD(2),
    UNSUPPORTED(-1);

    @Getter
    private final int id;
}
