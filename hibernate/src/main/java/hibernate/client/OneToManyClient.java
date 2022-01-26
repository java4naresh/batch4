package hibernate.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Account;
import hibernate.entity.Customer;

public class OneToManyClient {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config = config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		/*Transaction tx = session.beginTransaction();
		Customer customer = new Customer();
		customer.setAadhar("123456");
		customer.setCustomerId("cust1");
		customer.setCustomerName("Naresh");
		customer.setPan("DYKPK7402R");
		
		Customer customer2 = new Customer();
		customer2.setAadhar("123456");
		customer2.setCustomerId("cust2");
		customer2.setCustomerName("Naresh");
		customer2.setPan("DYKPK7402R");
		
		List<Customer> customers = new ArrayList<>();
		customers.add(customer);
		customers.add(customer2);
		List<Account> accounts = new ArrayList<>();
		Account acc1 = new Account();
		acc1.setAccountId("SBI1");
		acc1.setAccountNumber("SBI123456");
		acc1.setAccountType("Savings");
		acc1.setCustomer(customers);
		Account acc2 = new Account();
		acc2.setAccountId("City");
		acc2.setAccountNumber("City123456");
		acc2.setAccountType("Current");
		acc2.setCustomer(customers);
		
		accounts.add(acc1);
		accounts.add(acc2);
		
		customer.setAccounts(accounts);
		
		session.save(acc1);
		session.save(acc2);
		//session.save(acc2);
		
		tx.commit();*/
		
		Account account = (Account) session.get(Account.class, "SBI1");
		
		System.out.println(account);

	}

}
