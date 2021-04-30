package com.staff.main;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.lang.*;
import java.util.*;
import com.google.inject.*;
import com.staff.module.Appmodule;
import com.staff.service.ActiveStaffDetailsImp;
import com.staff.service.StaffDetailsService;


public class App {
	private static final String STAFF_REQ ="Staff";
	private static final String STAFF_REQ_R="R_Staff";
	private static void sendReqest(String req) {
			Injector in =Guice.createInjector(new Appmodule());
			StaffRequest request=in.getInstance(StaffRequest.class);
			request.makerequest(req);
	}
	public static void main(String[] args) {  



		/*EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");  
		EntityManager em=emf.createEntityManager();  

		em.getTransaction().begin();  


		ActiveEmployee ae1=new ActiveEmployee(101,"Karun",10000,5);  
		ActiveEmployee ae2=new ActiveEmployee(102,"Rishab",12000,7);  

		RetiredEmployee re1=new RetiredEmployee(103,"Ramesh",5000);  
		RetiredEmployee re2=new RetiredEmployee(104,"Raj",4000);  

		em.persist(ae1);  
		em.persist(ae2);  

		em.persist(re1);  
		em.persist(re2);  

		em.getTransaction().commit();  

		em.close();  
		emf.close();  */
		
		System.out.println("Select" +"\n"+"1.Active Staff Details"+"\n"+ "2.Retire Staff Details");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		if(a==1)
		{
		 sendReqest(STAFF_REQ);
		}
		else
		{
		sendReqest(STAFF_REQ_R);
		}
		
		
		

	}

}  