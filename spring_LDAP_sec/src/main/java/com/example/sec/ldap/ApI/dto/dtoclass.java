package com.example.sec.ldap.ApI.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class dtoclass {
	
	@Id
	  	private String email;
	    private String name;
	    private String contactNumber;
	    private String profession;
	    private double latitude;
	    private double longitude;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getProfession() {
			return profession;
		}
		public void setProfession(String profession) {
			this.profession = profession;
		}
		public double getLatitude() {
			return latitude;
		}
		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}
		public double getLongitude() {
			return longitude;
		}
		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}
		@Override
		public String toString() {
			return "dtoclass [name=" + name + ", email=" + email + ", contactNumber=" + contactNumber + ", profession="
					+ profession + ", latitude=" + latitude + ", longitude=" + longitude + "]";
		}
	    
}
