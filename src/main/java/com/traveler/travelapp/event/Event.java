package com.traveler.travelapp.event;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {
	private @Column(name = "id") @Id @GeneratedValue Long id;
	private @Column(name = "trip_id") int tripId;
	private @Column(name = "location") String location;
	private @Column(name = "date") Date date;
	private @Column(name = "category") String category;
	private @Column(name = "description") String description;
}
