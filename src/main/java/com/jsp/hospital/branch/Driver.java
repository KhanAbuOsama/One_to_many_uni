package com.jsp.hospital.branch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("osama");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Hospital hospital = new Hospital();
		hospital.setName("Apollo");
		hospital.setGSt_number("Apollo123456");
		
		
		Branch branch1 = new Branch();
		branch1.setName("Apollo-1");
		branch1.setLocation("Panvel");
		
		Branch branch2 = new Branch();
		branch2.setName("Apollo-2");
		branch2.setLocation("Vashi");
		
		Branch branch3 = new Branch();
		branch3.setName("Apollo-3");
		branch3.setLocation("Thane");
		
		List<Branch> branch = new ArrayList<Branch>();
		branch.add(branch1);
		branch.add(branch2);
		branch.add(branch3);
		
		//uni- Direction
		hospital.setBranches(branch);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
		

	}

}
