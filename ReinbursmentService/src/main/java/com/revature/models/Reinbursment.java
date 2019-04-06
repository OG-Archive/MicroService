package com.revature.models;

import com.revature.enums.ReinbursmentTypes;
import com.revature.enums.Status;

public class Reinbursment {
	
	private int id;
	private Status stats = Status.PENDING;
	private ReinbursmentTypes type;
	private int cost;
	private String description;
	
	public Reinbursment() {
		super();
	}
	
	public Reinbursment(int id, ReinbursmentTypes type, int cost, String description) {
		super();
		this.id = id;
		this.type = type;
		this.cost = cost;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ReinbursmentTypes getType() {
		return type;
	}

	public void setType(ReinbursmentTypes type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getStats() {
		return stats;
	}

	public void setStats(Status stats) {
		this.stats = stats;
	}

	@Override
	public String toString() {
		return "Reinbursment [id=" + id + ", type=" + type + ", cost=" + cost + ", description=" + description + "]";
	}
	
	
	
}
