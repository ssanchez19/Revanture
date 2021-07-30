package dev.sanchez.services;

import java.util.ArrayList;
import java.util.List;




import dev.sanchez.models.Reimbursement;
import dev.sanchez.repositories.BenefitCoRepo;
import dev.sanchez.repositories.DeptHeadRepo;
import dev.sanchez.repositories.ReimbursementRepo;
import dev.sanchez.repositories.SupervisorRepo;

public class BenCoServicesImpl implements BenefitCoServices {
	public BenefitCoRepo dhdao;
	
	public BenCoServicesImpl(BenefitCoRepo dhdao) {
		this.dhdao = dhdao;
	}
	
	public Reimbursement getReimbursement(int reimbursement_id) {
		return dhdao.getReimbursement(reimbursement_id);
	}

	public List<Reimbursement> getAllReimbursement() {
		return dhdao.getAllReimbursement();
	}

	public Reimbursement addReimbursement(Reimbursement reimbursements) {
		return dhdao.addReimbursement(reimbursements);
	}

	

	@Override
	public Reimbursement updateReimbursement(Reimbursement change) {
		return dhdao.updateReimbursement(change);
	}

	@Override
	public Reimbursement deleteReimbursement(int reimbursement_id) {
		return dhdao.deleteReimbursement(reimbursement_id);
	}

	@Override
	public Reimbursement approveReimbursement(int reimbursement_id) {
		return dhdao.approveReimbursement(reimbursement_id);
	}

	@Override
	public Reimbursement SupervisorapproveReimbursement(int supervisor_id) {
		return dhdao.SupervisorapproveReimbursement(supervisor_id);
	}

	@Override
	public Reimbursement DeptHeadapproveReimbursement(int depthead_id) {
		return dhdao.DeptHeadapproveReimbursement(depthead_id);
	}

	@Override
	public Reimbursement BenefitCoapproveReimbursement(int benefitco_id) {
		return dhdao.BenefitCoapproveReimbursement(benefitco_id);
	}
	@Override
	public Reimbursement denyReimbursement(int reimbursement_id) {
		return dhdao.denyReimbursement(reimbursement_id);
	}

	@Override
	public Reimbursement SupervisordenyReimbursement(int supervisor_id) {
		return dhdao.SupervisordenyReimbursement(supervisor_id);
	}

	@Override
	public Reimbursement DeptHeaddenyReimbursement(int depthead_id) {
		return dhdao.DeptHeaddenyReimbursement(depthead_id);
	}

	@Override
	public Reimbursement BenefitCodenyReimbursement(int benefitco_id) {
		return dhdao.BenefitCodenyReimbursement(benefitco_id);
	}

	

	/*
	 * public List<R_attachments> getAttachments(int reimbursement_id) {
	 * List<R_attachments> attachments = dhdao.getAllAttachments();
	 * List<R_attachments> result = new ArrayList<R_attachments>();
	 * 
	 * for(R_attachments a : attachments) {
	 * if(a.getReimbursements().getReimbursement_id() == reimbursement_id) {
	 * result.add(a); } }
	 * 
	 * return result; }
	 */

	
	
}
