package hibernate.client;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import hibernate.entity.Customer;
import hibernate.entity.User;

public class HQLClient {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config = config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		//Query query = session.createQuery("from hibernate.entity.Customer where customerId=?");
		//query.setString(0, "cust2");
		//List<Customer> customers = query.list();
		//System.out.println(customers);
		Transaction tx = session.beginTransaction();
		/*SQLQuery query = session.createSQLQuery("update customer set customerName=? where customerId=?");
		query.setString(0, "Naresh Kambala");
		query.setString(1, "cust2");
		int count = query.executeUpdate();
		if(count != 0) {
			System.out.println("updated");
		}*/
		
		/*Criteria c = session.createCriteria(Customer.class);
		c.add(Restrictions.eq("customerId", "cust1"));
		List<Customer> customers = c.list();
		System.out.println(customers);*/
		//Customer cust1 = (Customer) session.get(Customer.class, "cust1");
		//System.out.println(cust1);
		SQLQuery query = session.createSQLQuery("CALL getUser(:userId)");
		query.addEntity(User.class);
		query.setInteger("userId", 1);
		List<User> users = query.list();
		System.out.println(users);
		tx.commit();
	}

}
