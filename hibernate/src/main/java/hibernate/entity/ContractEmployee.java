package hibernate.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contract_employee")
@PrimaryKeyJoinColumn(name="id")
public class ContractEmployee extends Employee {

	@Column(name="teamLead")
	private String teamLead;
	
	@Column(name="hourlyPay")
	private int hourlyPay;

	public String getTeamLead() {
		return teamLead;
	}

	public void setTeamLead(String teamLead) {
		this.teamLead = teamLead;
	}

	public int getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	@Override
	public String toString() {
		return "ContractEmployee [teamLead=" + teamLead + ", hourlyPay=" + hourlyPay + "]";
	}
	
	
}
