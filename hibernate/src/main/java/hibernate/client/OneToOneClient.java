package hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Address;
import hibernate.entity.User;

public class OneToOneClient {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config = config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		User user = new User();
		user.setUserId(1);
		user.setName("Naresh");
		user.setGender('M');
		user.setAge(30);
		Address add = new Address();
		add.setAddId(1);
		add.setAddress1("KPHB");
		add.setAddress2("kp");
		add.setCity("Hyderabad");
		add.setCountry("India");
		add.setPincode(500072);
		add.setState("TS");
		user.setAdd(add);
		add.setUser(user);
		session.save(add);
		System.out.println("user saved");
		tx.commit();
	}

}
