package com.traveler.travelapp.user;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private @Column(name = "id") @Id @GeneratedValue Long id;
    private @Column(name = "name") String name;
    private @Column(name = "user_name") String userName;
    private @Column(name = "password") String password;
    private @Column(name = "email") String email;
    private @Column(name = "date_of_birth") Date dateOfBirth;
}
