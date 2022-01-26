package hibernate.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="perminent_employee")
@PrimaryKeyJoinColumn(name="id")
public class PerminentEmployee extends Employee {
	
	@Column(name="bonus")
	private int bonus;
	
	@Column(name="salary")
	private long salary;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PerminentEmployee [bonus=" + bonus + ", salary=" + salary + "]";
	}
	
	

}
