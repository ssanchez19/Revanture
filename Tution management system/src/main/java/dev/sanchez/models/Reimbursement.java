package dev.sanchez.models;

/**
 * @author sammy
 *
reimbursement_id int unique not null primary key,
name varchar(50),
date_submitted varchar,
description varchar(50),
location varchar(50),
grade_format varchar(50),
events_type varchar(50),
approval_message varchar(50)
 */
public class Reimbursement {
	private int reimbursement_id;
	private String name;
	private String description;
	private long date_submitted;
	private String location;
	private String event_type;
	private String approval_message;
	private double claim;
	private String grade_format;
	public Reimbursement() {
		super();
	}

	

	public Reimbursement(String name, String description, long date_submitted, String location, String event_type,
			String approval_message, double claim,String grade_format) {
		super();
		this.name = name;
		this.description = description;
		this.date_submitted = date_submitted;
		this.location = location;
		this.event_type = event_type;
		this.approval_message = approval_message;
		this.claim = claim;
		this.grade_format= grade_format;
	}



	public Reimbursement(int reimbursement_id, String name, String description, long date_submitted, String location,
			String event_type, String approval_message, double claim,String grade_format) {
		super();
		this.reimbursement_id = reimbursement_id;
		this.name = name;
		this.description = description;
		this.date_submitted = date_submitted;
		this.location = location;
		this.event_type = event_type;
		this.approval_message = approval_message;
		this.claim = claim;
		this.grade_format= grade_format;
	}



	/*
	 * public Reimbursement(int reimbursement_id, String r_description, long
	 * date_submitted, String finalgrade, double claim) { super();
	 * 
	 * this.reimbursement_id = reimbursement_id; //this.event_id = event_id;
	 * this.r_description = r_description; this.date_submitted = date_submitted; this.finalgrade =
	 * finalgrade; this.claim = claim; }
	 */

	public int getReimbursement_id() {
		return reimbursement_id;
	}

	public void setReimbursement_id(int reimbursement_id) {
		this.reimbursement_id = reimbursement_id;
	}

	/*
	 * public int getEvent_id() { return event_id; }
	 * 
	 * public void setEvent_id(int event_id) { this.event_id = event_id; }
	 */
	/*
	 * public String getUsername() { return username; }
	 * 
	 * public void setUsername(String username) { this.username = username; }
	 */



	public long getDate_submitted() {
		return date_submitted;
	}

	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public void setDate_submitted(long date_submitted) {
		this.date_submitted = date_submitted;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDesc() {
		return description;
	}



	public void setDesc(String description) {
		this.description = description;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getEvent_type() {
		return event_type;
	}



	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}



	public String getApproval_message() {
		return approval_message;
	}



	public void setApproval_message(String approval_message) {
		this.approval_message = approval_message;
	}



	public double getClaim() {
		return claim;
	}

	public void setClaim(double claim) {
		this.claim = claim;
	}






	public String getGrade_format() {
		return grade_format;
	}



	public void setGrade_format(String grade_format) {
		this.grade_format = grade_format;
	}



	@Override
	public String toString() {
		return "Reimbursement [reimbursement_id=" + reimbursement_id + ", name=" + name + ", description=" + description
				+ ", date_submitted=" + date_submitted + ", location=" + location + ", event_type=" + event_type
				+ ", approval_message=" + approval_message + ", claim=" + claim + ", grade_format=" + grade_format
				+ "]";
	}

	



}
