package com.example.lab2.domain;

import com.example.lab2.dto.AddressDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String zip;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;


}
