package dev.sanchez.controllers;

import java.util.List;

import com.google.gson.Gson;


import dev.sanchez.models.Reimbursement;

import dev.sanchez.services.*;
import io.javalin.http.Handler;

public class DeptHeadController {
	DeptHeadServices rs;
	/*
	 * EmployeesDAO employdao = new EmplDAOImpl(); EmployeeService es = new
	 * EmployServiceImpl(employdao); EventDAO ev_dao = new EventDAOImpl();
	 * EventService evs = new EventServiceImpl(ev_dao);
	 */
	Gson gson = new Gson();

	public DeptHeadController(DeptHeadServices  rs) {
		this.rs = rs;
	}

	public Handler getAllReimbursements = (ctx) -> {
		List<Reimbursement> reimbursements = rs.getAllReimbursement();

		if (reimbursements != null) {
			ctx.result(gson.toJson(reimbursements));
		} else {
			ctx.result("[]");
		}
	};

	public Handler getReimbursementByReimbursement_Id = (ctx) -> {
		String input = ctx.pathParam("id");
		int reimbursement_id;
		try {
			reimbursement_id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			reimbursement_id = -1;
		}

		Reimbursement r = rs.getReimbursement(reimbursement_id);

		if (r != null) {
			ctx.result(gson.toJson(r));
		} else {
			ctx.result("[]");
		}
	};

	public Handler addReimbursement = (ctx) -> {
		/*
		 * Reimbursement re_id = gson.fromJson(ctx.body(), Reimbursement.class);
		 * 
		 * employees employee = es.getEmployeeByUsername(re_id.getUsername()); Event
		 * event = evs.getByEvent(re_id.getEvent_id());
		 * 
		 * Reimbursements rei = new Reimbursements(re_id.getReimbursement_id(),
		 * employee, event, re_id.getR_desc(), re_id.getDate_submitted(),
		 * re_id.getFinalGrade(), re_id.getClaim());
		 */
		
		Reimbursement r = gson.fromJson(ctx.body(), Reimbursement.class);

        r = rs.addReimbursement(r);
        ctx.result((r != null) ? gson.toJson(r) : "{}");

		/*
		 * rei = rs.addReimbursement(rei);
		 * 
		 * if (rei != null) { ctx.result(gson.toJson(rei)); ctx.status(201); } else {
		 * ctx.status(400); }
		 */
	};
	
	
	public Handler updateReimbursement = (context) -> {
		Reimbursement r = gson.fromJson(context.body(), Reimbursement.class);
		
		r = rs.updateReimbursement(r);
		context.result((r != null) ? gson.toJson(r) : "{}");
	};
	
	public Handler approveReimbursement = (ctx) -> {
		String input = ctx.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}
		Reimbursement r = rs.approveReimbursement(id);
		
		if(r != null) {
			ctx.result(gson.toJson(r));
		} else {
			ctx.status(400);
		}
	};
	
	public Handler SupervisorapproveReimbursement = (ctx) -> {
		String input = ctx.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}
		Reimbursement r = rs.SupervisorapproveReimbursement(id);
		
		if(r != null) {
			ctx.result(gson.toJson(r));
		} else {
			ctx.status(400);
		}
	};
	
	public Handler DeptHeadapproveReimbursement = (ctx) -> {
		String input = ctx.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}
		Reimbursement r = rs.DeptHeadapproveReimbursement(id);
		
		if(r != null) {
			ctx.result(gson.toJson(r));
		} else {
			ctx.status(400);
		}
	};
	
	public Handler BenCoapproveReimbursement = (ctx) -> {
		String input = ctx.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}
		Reimbursement r = rs.BenefitCoapproveReimbursement(id);
		
		if(r != null) {
			ctx.result(gson.toJson(r));
		} else {
			ctx.status(400);
		}
	};
	public Handler denyReimbursement = (ctx) -> {
		String input = ctx.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}
		Reimbursement r = rs.approveReimbursement(id);
		
		if(r != null) {
			ctx.result(gson.toJson(r));
		} else {
			ctx.status(400);
		}
	};
	
	public Handler SupervisordenyReimbursement = (ctx) -> {
		String input = ctx.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}
		Reimbursement r = rs.SupervisorapproveReimbursement(id);
		
		if(r != null) {
			ctx.result(gson.toJson(r));
		} else {
			ctx.status(400);
		}
	};
	
	public Handler DeptHeaddenyReimbursement = (ctx) -> {
		String input = ctx.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}
		Reimbursement r = rs.DeptHeaddenyReimbursement(id);
		
		if(r != null) {
			ctx.result(gson.toJson(r));
		} else {
			ctx.status(400);
		}
	};
	
	public Handler BenCodenyReimbursement = (ctx) -> {
		String input = ctx.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}
		Reimbursement r = rs.BenefitCodenyReimbursement(id);
		
		if(r != null) {
			ctx.result(gson.toJson(r));
		} else {
			ctx.status(400);
		}
	};

	public Handler deleteReimbursement = (context) -> {
		String input = context.pathParam("id");
		int id;
		try {
			id = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			id = -1;
		}
		
		Reimbursement r = rs.deleteReimbursement(id);
		
		context.result((r != null) ? gson.toJson(r) : "{}");
	};

	/*
	 * public Handler getReimbursementAttachments = (ctx) -> { String input =
	 * ctx.pathParam("id"); int reid; try { reid = Integer.parseInt(input); } catch
	 * (NumberFormatException e) { reid = -1; }
	 * 
	 * List<R_attachments> attachments = rs.getAttachments(reid);
	 * 
	 * if (attachments != null) { ctx.result(gson.toJson(attachments)); } else {
	 * ctx.result("[]"); } };
	 */

}
