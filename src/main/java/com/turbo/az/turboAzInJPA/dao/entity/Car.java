package com.turbo.az.turboAzInJPA.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

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
    private String  year;

    @Column(name = "colour")
    private String colour;

    @Column(name = "state")
    private int state;  //1 - Available 2 - Sold

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

}
