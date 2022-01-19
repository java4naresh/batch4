package hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Student;

public class HibernateClient {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config = config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Student s = new Student();
		s.setSid(4);
		s.setSname("Naresh");
		s.setScourse("Java");
		Transaction tx = session.beginTransaction();
		//int sid = (int) session.save(s);
		//System.out.println(sid);
		session.persist(s);
		tx.commit();
		session.close();
	}

}
