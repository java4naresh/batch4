package hibernate.entity;

public class Student {
	
	private Integer sid;
	
	private String sname;
	
	private String scourse;

	public Integer getSid() {
		System.out.println("getSid");
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScourse() {
		return scourse;
	}

	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	
	

}
