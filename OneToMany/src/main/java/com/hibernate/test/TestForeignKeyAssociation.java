package com.hibernate.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.hibernate.org.AccountEntity;
import com.hibernate.org.EmployeeEntity;
import com.hibernate.org.HibernateUtil;

public class TestForeignKeyAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		AccountEntity account1 = new AccountEntity();
		account1.setAccountnumber("Account Detail 1");
		AccountEntity account2 = new AccountEntity();
		account2.setAccountnumber("Account Detail 2");
		AccountEntity account3 = new AccountEntity();
		account3.setAccountnumber("Account Detail 3");
		EmployeeEntity firstemployee = new EmployeeEntity();
		firstemployee.setEmail("demo.user@gmail.com");
		firstemployee.setFirstname("demo");
		firstemployee.setLastname("user");
		EmployeeEntity secondemployee = new EmployeeEntity();
		secondemployee.setEmail("demo-user-two@gmail.com");
		secondemployee.setFirstname("demo-two");
		secondemployee.setLastname("user-two");
		Set<AccountEntity> accountoffirstemployee = new HashSet<AccountEntity>();
		accountoffirstemployee.add(account1);
		accountoffirstemployee.add(account2);
		Set<AccountEntity> accountofsecemployee = new HashSet<AccountEntity>();
		accountofsecemployee.add(account3);
		firstemployee.setAccount(accountoffirstemployee);
		secondemployee.setAccount(accountofsecemployee);
		session.save(firstemployee);
		session.save(secondemployee);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}

}
