package com.turbo.az.turboAzInJPA.dao.entity;

import com.turbo.az.turboAzInJPA.model.CarState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "car_id", nullable = false)
    private Long id;

    @Column(name = "plate")
    private String plate;

    @Column(name = "price")
    private double price;

    @Column(name = "model_year")
    private String year;

    @Column(name = "colour")
    private String colour;

    @Column(name = "state")
    private Integer carState;  //1 - Available 2 - Sold

    @Column(name = "additional_inform")
    private String additionalInformation;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date informAddDate;

    @Column()
    private Date informUpdateDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "model_id", nullable = false)
    Model model;

    public CarState getCarState() {
        return Arrays.stream(CarState.values())
                .filter(status -> Objects.equals(status.getId(), this.carState))
                .findFirst()
                .orElse(CarState.UNSUPPORTED);

    }

    public void setCarState(CarState carState) {
        if (carState != null) {
            this.carState = carState.getId();
        }

    }

}
