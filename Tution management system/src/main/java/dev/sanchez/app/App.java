package dev.sanchez.app;






import dev.sanchez.controllers.BenefitCoController;
import dev.sanchez.controllers.DeptHeadController;

/*import java.lang.reflect.Field;
import java.lang.reflect.Method;*/


import dev.sanchez.controllers.ReimbursementController;
import dev.sanchez.controllers.SupervisorController;
import dev.sanchez.repositories.BenCoHBImpl;
import dev.sanchez.repositories.BenefitCoRepo;
import dev.sanchez.repositories.DeptHeadHBImpl;
import dev.sanchez.repositories.DeptHeadRepo;
import dev.sanchez.repositories.ReimburseRepoHBImpl;
import dev.sanchez.repositories.ReimbursementRepo;
import dev.sanchez.repositories.SuperRepoHBImpl;
import dev.sanchez.repositories.SupervisorRepo;
import dev.sanchez.services.BenCoServicesImpl;
import dev.sanchez.services.BenefitCoServices;
import dev.sanchez.services.DeptHServicesImpl;
import dev.sanchez.services.DeptHeadServices;
import dev.sanchez.services.ReimServicesImpl;
import dev.sanchez.services.ReimbursementServices;
import dev.sanchez.services.SuperServicesImpl;
import dev.sanchez.services.SupervisorServices;
import io.javalin.Javalin;

public class App {
	public static void main(String[] args) {
		
		//Establish our Javalin Object
		Javalin app = Javalin.create(config -> config.enableCorsForAllOrigins());
		
		//Establish the Routes/Endpoints Javalin will manage
		establishRoutes(app);
		
		//Run Javalin
		app.start(7000);
		
	}
	
	
	private static void establishRoutes(Javalin app) {
		
		ReimbursementRepo rdao = new ReimburseRepoHBImpl();
		ReimbursementServices rs = new ReimServicesImpl(rdao);
		ReimbursementController rc = new ReimbursementController(rs);
		
		
		
		app.get("/", (ctx) -> ctx.result("Tuition Reimbursement Management System"));
		

		//app.post("/login", ec.employeeLogin);
		app.get("/reimbursements", rc.getAllReimbursements);
		
		
		
		 // app.post("/messages", cmc.addMessage);
		  
		  app.get("/reimbursements/:id", rc.getReimbursementByReimbursement_Id);
		 
		  app.post("/reimbursements", rc.addReimbursement);
		 
		
			app.put("/reimbursement/:id", rc.updateReimbursement);
		
			app.patch("/reimbursement/:id", rc.approveReimbursement);
			app.patch("/Supervisor/:id", rc.SupervisorapproveReimbursement);
			app.patch("/departmentHead/:id", rc.DeptHeadapproveReimbursement);
			app.patch("/benefitsCoordinator/:id", rc.BenCoapproveReimbursement);
			app.patch("/reimbursements/:id", rc.denyReimbursement);
			app.patch("/Supervisosr/:id", rc.SupervisordenyReimbursement);
			app.patch("/departmentHeads/:id", rc.DeptHeaddenyReimbursement);
			app.patch("/benefitsCoordinators/:id", rc.BenCodenyReimbursement);
			
			app.delete("/reimbursement/:id", rc.deleteReimbursement);
			
			
			
			SupervisorRepo sr = new SuperRepoHBImpl();
			SupervisorServices ss = new SuperServicesImpl(sr);
			SupervisorController sc = new SupervisorController(ss);
			
		
			app.post("/Supervisor", sc.addReimbursement);
			
			
			
			
			
			DeptHeadRepo dhr = new DeptHeadHBImpl();
			DeptHeadServices dhs = new DeptHServicesImpl(dhr);
			DeptHeadController dhc = new DeptHeadController(dhs);
			
			app.post("/departmentHead", dhc.addReimbursement);
			
	
			
			
			
			
			BenefitCoRepo bcr = new BenCoHBImpl();
			BenefitCoServices bcs = new BenCoServicesImpl(bcr);
			BenefitCoController bcc = new BenefitCoController(bcs);
			
			
			app.post("/benefitsCoordinator", bcc.addReimbursement);
			
		
		
	}
}
