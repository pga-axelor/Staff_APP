package com.staff.service;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.staff.db.Employee;

public class ActiveStaffDetailsImp implements StaffDetailsService{

	@Override
	public void details() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");  
		EntityManager em=emf.createEntityManager();  

		em.getTransaction().begin();   
       /* Employee e=em.find(Employee.class,101);
		System.out.println(e);*/
		Query q= em.createNativeQuery("select e.e_id ,e.e_name,a.e_experience ,a.e_salary from employee e inner join activeemployee a on e.e_id=a.e_id");
		List <Object[]> staff=q.getResultList();
		System.out.println();
		System.out.println("Active Staff Details");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.printf("%10s %20s %20s %20s", "STAFF ID","NAME", "EXPERIENCE","SALARY");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		for(Object [] st: staff){
			System.out.format("%10s %20s %20d %20d",
					st[0], st[1], st[2],st[3]);
			System.out.println();
		}
        /*for(Object [] st: staff)
        {
        	System.out.println(st[0]+" "+st[1]+" "+st[2]+" "+st[3]);
        }*/
        em.getTransaction().commit();
		
	}

}
