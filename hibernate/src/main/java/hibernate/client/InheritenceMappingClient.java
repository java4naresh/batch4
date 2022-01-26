package hibernate.client;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.entity.ContractEmployee;
import hibernate.entity.Employee;
import hibernate.entity.PerminentEmployee;

public class InheritenceMappingClient {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config = config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee();
		emp.setCompanyName("IBM");
		emp.setManager("Rahul");
		session.save(emp);
		ContractEmployee ce = new ContractEmployee();
		ce.setCompanyName("IBM");
		ce.setHourlyPay(20);
		ce.setManager("Rahul");
		ce.setTeamLead("Anil");
		session.save(ce);
		PerminentEmployee pe = new PerminentEmployee();
		pe.setManager("Rahul");
		pe.setSalary(1000000);
		pe.setBonus(50000);
		pe.setCompanyName("IBM");
		session.save(pe);
		System.out.println("saved Success");
		tx.commit();
	}

}
