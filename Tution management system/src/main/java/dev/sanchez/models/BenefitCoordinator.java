package dev.sanchez.models;

/**
 * @author sammy
 *
reimbursement_id int unique not null primary key,
name varchar(50),
date_submitted varchar,
descriptionription varchar(50),
location varchar(50),
grade_format varchar(50),
events_type varchar(50),
aprroval_message varchar(50)
 */
public class BenefitCoordinator {
	private int benefitco_id;
	private String name;
	private String description;
	private long date_submitted;
	private String location;
	private String event_type;
	private String approval_message;
	private double claim;
	private String grade_format;

	public BenefitCoordinator() {
		super();
	}

	public BenefitCoordinator(int benefitco_id, String name, String description, long date_submitted, String location,
			String event_type, String approval_message, double claim,String grade_format) {
		super();
		this.benefitco_id = benefitco_id;
		this.name = name;
		this.description = description;
		this.date_submitted = date_submitted;
		this.location = location;
		this.event_type = event_type;
		this.approval_message = approval_message;
		this.claim = claim;
		this.grade_format =grade_format;
	}

	public BenefitCoordinator(String name, String description, long date_submitted, String location, String event_type,
			String approval_message, double claim,String grade_format) {
		super();
		this.name = name;
		this.description = description;
		this.date_submitted = date_submitted;
		this.location = location;
		this.event_type = event_type;
		this.approval_message = approval_message;
		this.claim = claim;
		this.grade_format =grade_format;
	}



	public int getBenefitco_id() {
		return benefitco_id;
	}

	public void setBenefitco_id(int benefitco_id) {
		this.benefitco_id = benefitco_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public long getDate_submitted() {
		return date_submitted;
	}

	public void setDate_submitted(long date_submitted) {
		this.date_submitted = date_submitted;
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
		return "BenefitCoordinator [benefitco_id=" + benefitco_id + ", name=" + name + ", description=" + description
				+ ", date_submitted=" + date_submitted + ", location=" + location + ", event_type=" + event_type
				+ ", approval_message=" + approval_message + ", claim=" + claim + ", grade_format=" + grade_format
				+ "]";
	}


	

	

}