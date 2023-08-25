package com.traveler.travelapp.loginRequest;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
public class LoginRequest {
    private String userName;
    private String password;

}
