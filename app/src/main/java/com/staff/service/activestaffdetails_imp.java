package com.staff.service;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Staff.Employee;

public class activestaffdetails_imp implements staffdetails_service{

	@Override
	public void details() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");  
		EntityManager em=emf.createEntityManager();  

		em.getTransaction().begin();   
       /* Employee e=em.find(Employee.class,101);
		System.out.println(e);*/
		Query q= em.createNativeQuery("select e.e_id ,e.e_name,a.e_experience ,a.e_salary from employee e inner join activeemployee a on e.e_id=a.e_id");
		List <Object[]> staff=q.getResultList();
		System.out.println("Active Staff Details");
        for(Object [] st: staff)
        {
        	System.out.println(st[0]+" "+st[1]+" "+st[2]+" "+st[3]);
        }
        em.getTransaction().commit();
		
	}

}
