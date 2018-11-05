package com.telran.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "USERS")
public class User extends BaseEntity {

    /*PK*/
//    @Id
    /*AI*/
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Column(
            name = "EMAIL",
            unique = true,
            nullable = false,
            length = 50)
    private String email;
    private String firstName;
    private String lastName;
}
