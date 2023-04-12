package com.example.demo_pbl3.model;

public class Patient extends User {
	private String id;
	private String diseaseSymptoms;
	private String job;
	private String insurance;
	
	public Patient(
			String name, 
			String phoneNumber, 
			String email, 
			int age, 
			String gender) {
		super(name, phoneNumber, email, age, gender);
	}

	public Patient(
			String name, 
			String phoneNumber, 
			String email, 
			int age, 
			String gender, 
			String id,
			String diseaseSymptoms, 
			String job, 
			String insurance) {
		super(name, phoneNumber, email, age, gender);
		this.id = id;
		this.diseaseSymptoms = diseaseSymptoms;
		this.job = job;
		this.insurance = insurance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDiseaseSymptoms() {
		return diseaseSymptoms;
	}

	public void setDiseaseSymptoms(String diseaseSymptoms) {
		this.diseaseSymptoms = diseaseSymptoms;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	
}
