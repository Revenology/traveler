package com.traveler.travelapp.journey;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value="/journeys")
public class JourneyController {

    private final JourneyRepository journeyRepository;
    
    @GetMapping("/journeys")
    List<Journey> journeys(){
        return journeyRepository.findAll();
    }

    @PostMapping("journeys")
    Journey newJourney(@RequestBody Journey journey){
        return journeyRepository.save(journey);
    }
    
}
