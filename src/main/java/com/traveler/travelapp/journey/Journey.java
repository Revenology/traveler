package com.traveler.travelapp.journey;

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
public class Journey {
	private @Column(name = "id") @Id @GeneratedValue Long id;
	private @Column(name = "origin") String origin;
	private @Column(name = "length") int length;
	private @Column(name = "date_start") Date dateStart;
	private @Column(name = "date_end") Date dateEnd;
	private @Column(name = "last_destination") String lastDestination;
}
