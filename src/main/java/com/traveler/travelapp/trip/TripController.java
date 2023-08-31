package com.traveler.travelapp.trip;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value ="/trips")
public class TripController {
	
	private final TripRepository tripRepository;
	
    @GetMapping("/trips")
    List<Trip> trips(){
        return tripRepository.findAll();
    }

    @PostMapping("/users")
    Trip newTrip(@RequestBody Trip trip){
        return tripRepository.save(trip);
    }
    
}
