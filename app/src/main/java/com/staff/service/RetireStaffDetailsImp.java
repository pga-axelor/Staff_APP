package com.staff.service;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.staff.db.Employee;
public class RetireStaffDetailsImp implements StaffDetailsService{
	@Override
	public void details() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");  
		EntityManager em=emf.createEntityManager();  

		em.getTransaction().begin();   
       /* Employee e=em.find(Employee.class,101);
		System.out.println(e);*/
		Query q= em.createNativeQuery("select e.e_id ,e.e_name,r.e_pension from employee e inner join retiredemployee r on e.e_id=r.e_id ");
		List <Object[]> staff=q.getResultList();
		System.out.println();
		System.out.println("Retrie Staff Details");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%10s %20s %20s", "STAFF ID","NAME", "PENSION");
		System.out.println();
		System.out.println("-----------------------------------------------------");
		for(Object [] st: staff){
			System.out.format("%10s %20s %20d",
					st[0], st[1], st[2]);
			System.out.println();
		}
        /*for(Object [] st: staff)
        {
        	System.out.println(st[0]+" "+st[1]+" "+st[2]);
        }*/
        em.getTransaction().commit();
		
	}


}
