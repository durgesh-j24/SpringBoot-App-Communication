package com.example.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cardetails")
public class Cardetails{
	
	@Id
    private int id;
	
	private String bodytype;
   
    private String globalNCapRating;
   
    private String fIN;
    
    private String fuelType;

	public String getBodytype() {
		return bodytype;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}

	public String getGlobalNCapRating() {
		return globalNCapRating;
	}

	public void setGlobalNCapRating(String globalNCapRating) {
		this.globalNCapRating = globalNCapRating;
	}

	public String getfIN() {
		return fIN;
	}

	public void setfIN(String fIN) {
		this.fIN = fIN;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Cardetails [id=" + id + ", bodytype=" + bodytype + ", globalNCapRating=" + globalNCapRating + ", fIN="
				+ fIN + ", fuelType=" + fuelType + "]";
	}

	public Cardetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cardetails(int id, String bodytype, String globalNCapRating, String fIN, String fuelType) {
		super();
		this.id = id;
		this.bodytype = bodytype;
		this.globalNCapRating = globalNCapRating;
		this.fIN = fIN;
		this.fuelType = fuelType;
	}

	

	
   
}
