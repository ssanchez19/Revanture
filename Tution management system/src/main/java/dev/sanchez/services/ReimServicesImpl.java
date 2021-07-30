package dev.sanchez.services;

import java.util.ArrayList;
import java.util.List;




import dev.sanchez.models.Reimbursement;
import dev.sanchez.repositories.ReimbursementRepo;

public class ReimServicesImpl implements ReimbursementServices {
	public ReimbursementRepo reim_dao;
	
	public ReimServicesImpl(ReimbursementRepo reim_dao) {
		this.reim_dao = reim_dao;
	}
	
	public Reimbursement getReimbursement(int reimbursement_id) {
		return reim_dao.getReimbursement(reimbursement_id);
	}

	public List<Reimbursement> getAllReimbursement() {
		return reim_dao.getAllReimbursement();
	}

	public Reimbursement addReimbursement(Reimbursement reimbursements) {
		return reim_dao.addReimbursement(reimbursements);
	}

	

	@Override
	public Reimbursement updateReimbursement(Reimbursement change) {
		return reim_dao.updateReimbursement(change);
	}

	@Override
	public Reimbursement deleteReimbursement(int reimbursement_id) {
		return reim_dao.deleteReimbursement(reimbursement_id);
	}

	@Override
	public Reimbursement approveReimbursement(int reimbursement_id) {
		return reim_dao.approveReimbursement(reimbursement_id);
	}

	@Override
	public Reimbursement SupervisorapproveReimbursement(int supervisor_id) {
		return reim_dao.SupervisorapproveReimbursement(supervisor_id);
	}

	@Override
	public Reimbursement DeptHeadapproveReimbursement(int depthead_id) {
		return reim_dao.DeptHeadapproveReimbursement(depthead_id);
	}

	@Override
	public Reimbursement BenefitCoapproveReimbursement(int benefitco_id) {
		return reim_dao.BenefitCoapproveReimbursement(benefitco_id);
	}

	@Override
	public Reimbursement denyReimbursement(int reimbursement_id) {
		return reim_dao.denyReimbursement(reimbursement_id);
	}

	@Override
	public Reimbursement SupervisordenyReimbursement(int supervisor_id) {
		return reim_dao.SupervisordenyReimbursement(supervisor_id);
	}

	@Override
	public Reimbursement DeptHeaddenyReimbursement(int depthead_id) {
		return reim_dao.DeptHeaddenyReimbursement(depthead_id);
	}

	@Override
	public Reimbursement BenefitCodenyReimbursement(int benefitco_id) {
		return reim_dao.BenefitCodenyReimbursement(benefitco_id);
	}

	/*
	 * public List<R_attachments> getAttachments(int reimbursement_id) {
	 * List<R_attachments> attachments = reim_dao.getAllAttachments();
	 * List<R_attachments> result = new ArrayList<R_attachments>();
	 * 
	 * for(R_attachments a : attachments) {
	 * if(a.getReimbursements().getReimbursement_id() == reimbursement_id) {
	 * result.add(a); } }
	 * 
	 * return result; }
	 */

	
	
}
