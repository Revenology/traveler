package com.traveler.travelapp.journey;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Journey {
	private @Id @GeneratedValue Long id;
	private String origin;
	private int length;
	private Date dateStart;
	private Date dateEnd;
	private String lastDestination;
	
	public Journey(String origin, int length, Date dateStart, Date dateEnd) {
		this.origin = origin;
		this.length = length;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	public String getLastDestination() {
		return lastDestination;
	}
	public void setLastDestination(String lastDestination) {
		this.lastDestination = lastDestination;
	}
	
	
	
}
