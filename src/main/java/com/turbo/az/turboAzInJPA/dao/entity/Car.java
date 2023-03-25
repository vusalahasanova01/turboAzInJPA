package com.turbo.az.turboAzInJPA.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.turbo.az.turboAzInJPA.model.CarState;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "cars")
public class Car implements Serializable {

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
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(id, car.id) && Objects.equals(plate, car.plate) && Objects.equals(year, car.year) && Objects.equals(colour, car.colour) && Objects.equals(carState, car.carState) && Objects.equals(additionalInformation, car.additionalInformation) && Objects.equals(informAddDate, car.informAddDate) && Objects.equals(informUpdateDate, car.informUpdateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plate, price, year, colour, carState, additionalInformation, informAddDate, informUpdateDate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", plate='" + plate + '\'' +
                ", price=" + price +
                ", year='" + year + '\'' +
                ", colour='" + colour + '\'' +
                ", carState=" + carState +
                ", additionalInformation='" + additionalInformation + '\'' +
                ", informAddDate=" + informAddDate +
                ", informUpdateDate=" + informUpdateDate +
                '}';
    }

}
