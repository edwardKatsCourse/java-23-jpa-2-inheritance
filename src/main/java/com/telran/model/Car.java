package com.telran.model;

import lombok.*;
import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Car extends BaseEntity {
    //private long id;
    //private LocalDate createdBy;

    private String brand;
    private String model;

}
