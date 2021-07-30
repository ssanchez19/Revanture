package dev.sanchez.repositories;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dev.sanchez.models.Reimbursement;
import dev.sanchez.util.HibernateUtil;

public class DeptHeadHBImpl implements DeptHeadRepo {
	public Reimbursement getReimbursement(int Reimbursement_id) {
		Session sess = HibernateUtil.getSession();
		Reimbursement reimbursements = null;

		try {
			reimbursements = sess.get(Reimbursement.class, Reimbursement_id);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}

		return reimbursements;
	}

	public List<Reimbursement> getAllReimbursement() {
		Session sess = HibernateUtil.getSession();
		List<Reimbursement> reimbursements = null;
		
		try {
			reimbursements = sess.createQuery("FROM Reimbursement").list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
		
		return reimbursements;
	}

	

	
	public Reimbursement addReimbursement(Reimbursement reimbursements) {
		Session sess = HibernateUtil.getSession();
		
		try {
			sess.beginTransaction();
			reimbursements.setReimbursement_id(Integer.parseInt(sess.save(reimbursements).toString()));
			sess.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			sess.getTransaction().rollback();
			reimbursements = null;
		} finally {
			sess.close();
		}
		
		return reimbursements;
	}

	@Override
	public Reimbursement updateReimbursement(Reimbursement change) {
			Session sess = HibernateUtil.getSession();
			Transaction tx = null;
			
			try {
				tx = sess.beginTransaction();
				sess.update(change);
				tx.commit();
			} catch (HibernateException e) {
				e.printStackTrace();
				tx.rollback();
				return null;
			} finally {
				sess.close();
			}
			
			return change;
		}
	@Override
	public Reimbursement deleteReimbursement(int reimbursement_id) {

			
			Session sess = HibernateUtil.getSession();
			Transaction tx = null;
			Reimbursement r = sess.get(Reimbursement.class, reimbursement_id);
			
			try {
				tx = sess.beginTransaction();
				sess.delete(r);
				tx.commit();
			} catch(HibernateException e) {
				e.printStackTrace();
				tx.rollback();
				return null;
			} finally {
				sess.close();
			}
			
			return r;
		}

	@Override
	public Reimbursement approveReimbursement(int reimbursement_id) {
			Session sess = HibernateUtil.getSession();
			Transaction tx = null;
			Reimbursement r = sess.get(Reimbursement.class, reimbursement_id);
			
			try {
				tx = sess.beginTransaction();
				//Reimbursement r = sess.load(Reimbursement.class, id);
				r.setApproval_message("Approved");
				sess.update(r);
				tx.commit();
			} catch(HibernateException e) {
				e.printStackTrace();
				tx.rollback();
				return null;
			} finally {
				sess.close();
			}
			
			return r;
		}

	@Override
	public Reimbursement SupervisorapproveReimbursement(int supervisor_id) {
			Session sess = HibernateUtil.getSession();
			Transaction tx = null;
			Reimbursement rei = sess.get(Reimbursement.class, supervisor_id);
			
			try {
				tx = sess.beginTransaction();
				//Reimbursement r = sess.load(Reimbursement.class, id);
				rei.setApproval_message("Reimbursement Supervisor Approved and PENDING Department Head and Benefit Coordinator approval");
				sess.update(rei);
				tx.commit();
			} catch(HibernateException e) {
				e.printStackTrace();
				tx.rollback();
				return null;
			} finally {
				sess.close();
			}
			
			return rei;
		}

	@Override
	public Reimbursement DeptHeadapproveReimbursement(int depthead_id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		Reimbursement rei = sess.get(Reimbursement.class, depthead_id);
		
		try {
			tx = sess.beginTransaction();
			//Reimbursement r = sess.load(Reimbursement.class, id);
			rei.setApproval_message("Department Head APPROVED and PENDING Benefit Coordinator approval");
			sess.update(rei);
			tx.commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return rei;
	}

	@Override
	public Reimbursement BenefitCoapproveReimbursement(int benefitco_id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		Reimbursement rei = sess.get(Reimbursement.class, benefitco_id);
		
		try {
			tx = sess.beginTransaction();
			//Reimbursement r = sess.load(Reimbursement.class, id);
			rei.setApproval_message("Reimbursement has been APPROVED. ");
			sess.update(rei);
			tx.commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return rei;
	}


	@Override
	public Reimbursement denyReimbursement(int reimbursement_id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		Reimbursement r = sess.get(Reimbursement.class, reimbursement_id);
		
		try {
			tx = sess.beginTransaction();
			//Reimbursement r = sess.load(Reimbursement.class, id);
			r.setApproval_message("Denied");
			sess.update(r);
			tx.commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return r;
	}

	@Override
	public Reimbursement SupervisordenyReimbursement(int supervisor_id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		Reimbursement rei = sess.get(Reimbursement.class, supervisor_id);
		
		try {
			tx = sess.beginTransaction();
			//Reimbursement r = sess.load(Reimbursement.class, id);
			rei.setApproval_message("Reimbursement DENIED by Supervisor ");
			sess.update(rei);
			tx.commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return rei;
	}
	

	@Override
	public Reimbursement DeptHeaddenyReimbursement(int depthead_id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		Reimbursement rei = sess.get(Reimbursement.class, depthead_id);
		
		try {
			tx = sess.beginTransaction();
			//Reimbursement r = sess.load(Reimbursement.class, id);
			rei.setApproval_message("Department Head DENIED Reimbursement");
			sess.update(rei);
			tx.commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return rei;
	}

	@Override
	public Reimbursement BenefitCodenyReimbursement(int benefitco_id) {
		Session sess = HibernateUtil.getSession();
		Transaction tx = null;
		Reimbursement rei = sess.get(Reimbursement.class, benefitco_id);
		
		try {
			tx = sess.beginTransaction();
			//Reimbursement r = sess.load(Reimbursement.class, id);
			rei.setApproval_message("Reimbursement has been DENIED by benefits coordinator. ");
			sess.update(rei);
			tx.commit();
		} catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
			return null;
		} finally {
			sess.close();
		}
		
		return rei;
	}

	/*
	 * public List<R_attachments> getAllAttachments() { Session sess =
	 * HibernateUtil.getSession(); List<R_attachments> attachments = null;
	 * 
	 * try { attachments = sess.createQuery("FROM r_attachments").list(); } catch
	 * (HibernateException e) { e.printStackTrace(); } finally { sess.close(); }
	 * 
	 * return attachments; }
	 */
}

