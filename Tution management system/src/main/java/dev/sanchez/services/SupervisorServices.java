package dev.sanchez.services;

import java.util.List;


import dev.sanchez.models.Reimbursement;

public interface SupervisorServices {
	
	
	public Reimbursement getReimbursement(int reimbursement_id);
	
	public List<Reimbursement> getAllReimbursement();
	

	
	public Reimbursement addReimbursement(Reimbursement reimbursements);
	
	public Reimbursement updateReimbursement(Reimbursement change);
	public Reimbursement deleteReimbursement(int reimbursement_id);
	public Reimbursement approveReimbursement(int reimbursement_id);
	public Reimbursement SupervisorapproveReimbursement(int supervisor_id);
	public Reimbursement DeptHeadapproveReimbursement(int depthead_id);
	public Reimbursement BenefitCoapproveReimbursement(int benefitco_id);
	public Reimbursement denyReimbursement(int reimbursement_id);
	public Reimbursement SupervisordenyReimbursement(int supervisor_id);
	public Reimbursement DeptHeaddenyReimbursement(int depthead_id);
	public Reimbursement BenefitCodenyReimbursement(int benefitco_id);
	//public List<R_attachments> getAttachments(int reimbursement_id);
}
