package com.traveler.travelapp.trip;

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
public class Trip {
	private @Column(name = "id") @Id @GeneratedValue Long id;
	private @Column(name = "creator_id") int creatorId;
	private @Column(name = "journey_id") int journeyId;
	private @Column(name = "origin") String origin;
	private @Column(name = "destination") String destination;
	private @Column(name = "date_start") Date dateStart;
	private @Column(name = "date_end") Date dateEnd;
	private @Column(name = "transportation") int transportation;
	private @Column(name = "experience") String experience;
	private @Column(name = "participants") String participants;
}
