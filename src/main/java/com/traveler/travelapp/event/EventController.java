package com.traveler.travelapp.event;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/events")
public class EventController {
	
	private final EventRepository eventRepository;
	
	public EventController(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	@GetMapping("/events")
	List<Event> events(){
		return eventRepository.findAll();
	}
	
	@PostMapping("/events")
	Event newEvent(@RequestBody Event event) {
		return eventRepository.save(event);
	}

}
