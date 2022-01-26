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
		// save the data into DB
		/*Student s = new Student();
		s.setSid(1);
		s.setSname("Naresh");
		s.setScourse("Java");
		Transaction tx = session.beginTransaction();
		//int sid = (int) session.save(s);
		//System.out.println(sid);
		session.persist(s);
		tx.commit();*/
		
		//retrieve data fromDB
		
		//Student s = (Student) session.get(Student.class, 1);
		//Student s = (Student) session.load(Student.class, 1);
		//System.out.println(s);
		
		// update example 
		/*Transaction tx = session.beginTransaction();
		Student s = new Student();
		s.setSid(1);
		s.setSname("Naresh");
		s.setScourse("Python");
		session.update(s);
		tx.commit();*/
		
		// delete example
		/*Transaction tx = session.beginTransaction();
		Student s = new Student();
		s.setSid(32768);
		session.delete("hibernate.entity.Student", s);
		tx.commit();*/
		
		//level1 cache example
		
		Transaction tx = session.beginTransaction();
		Student s = new Student();//transient state
		s.setSid(5);
		s.setScourse("Java");
		s.setSname("Anil");
		session.save(s); //persistent state 
		tx.commit();
		session.close(); // detached state
		Session session2 = factory.openSession();
		Transaction tx2 = session2.beginTransaction();
		//Student s2 = (Student) session2.get(Student.class, 4);
		s.setScourse("Python");
		session2.update(s);
		tx2.commit();
		
	}

}
