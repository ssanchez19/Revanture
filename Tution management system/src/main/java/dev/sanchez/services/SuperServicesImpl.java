package dev.sanchez.services;

import java.util.ArrayList;
import java.util.List;




import dev.sanchez.models.Reimbursement;
import dev.sanchez.repositories.ReimbursementRepo;
import dev.sanchez.repositories.SupervisorRepo;

public class SuperServicesImpl implements SupervisorServices {
	public SupervisorRepo sdao;
	
	public SuperServicesImpl(SupervisorRepo sdao) {
		this.sdao = sdao;
	}
	
	public Reimbursement getReimbursement(int reimbursement_id) {
		return sdao.getReimbursement(reimbursement_id);
	}

	public List<Reimbursement> getAllReimbursement() {
		return sdao.getAllReimbursement();
	}

	public Reimbursement addReimbursement(Reimbursement reimbursements) {
		return sdao.addReimbursement(reimbursements);
	}

	

	@Override
	public Reimbursement updateReimbursement(Reimbursement change) {
		return sdao.updateReimbursement(change);
	}

	@Override
	public Reimbursement deleteReimbursement(int reimbursement_id) {
		return sdao.deleteReimbursement(reimbursement_id);
	}

	@Override
	public Reimbursement approveReimbursement(int reimbursement_id) {
		return sdao.approveReimbursement(reimbursement_id);
	}

	@Override
	public Reimbursement SupervisorapproveReimbursement(int supervisor_id) {
		return sdao.SupervisorapproveReimbursement(supervisor_id);
	}

	@Override
	public Reimbursement DeptHeadapproveReimbursement(int depthead_id) {
		return sdao.DeptHeadapproveReimbursement(depthead_id);
	}

	@Override
	public Reimbursement BenefitCoapproveReimbursement(int benefitco_id) {
		return sdao.BenefitCoapproveReimbursement(benefitco_id);
	}
	
	@Override
	public Reimbursement denyReimbursement(int reimbursement_id) {
		return sdao.denyReimbursement(reimbursement_id);
	}

	@Override
	public Reimbursement SupervisordenyReimbursement(int supervisor_id) {
		return sdao.SupervisordenyReimbursement(supervisor_id);
	}

	@Override
	public Reimbursement DeptHeaddenyReimbursement(int depthead_id) {
		return sdao.DeptHeaddenyReimbursement(depthead_id);
	}

	@Override
	public Reimbursement BenefitCodenyReimbursement(int benefitco_id) {
		return sdao.BenefitCodenyReimbursement(benefitco_id);
	}

	

	/*
	 * public List<R_attachments> getAttachments(int reimbursement_id) {
	 * List<R_attachments> attachments = sdao.getAllAttachments();
	 * List<R_attachments> result = new ArrayList<R_attachments>();
	 * 
	 * for(R_attachments a : attachments) {
	 * if(a.getReimbursements().getReimbursement_id() == reimbursement_id) {
	 * result.add(a); } }
	 * 
	 * return result; }
	 */

	
	
}
