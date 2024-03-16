package in.satya.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class empData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eId;
	private String eName;
	private String eRole;
	private Double eSalary;
	
	

	public empData(String eName, String eRole, Double eSalary) {
		
		this.eName = eName;
		this.eRole = eRole;
		this.eSalary = eSalary;
	}
	public empData() {
		
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteRole() {
		return eRole;
	}

	public void seteRole(String eRole) {
		this.eRole = eRole;
	}

	public Double geteSalary() {
		return eSalary;
	}

	public void seteSalary(Double eSalary) {
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "empData [eId=" + eId + ", eName=" + eName + ", eRole=" + eRole + ", eSalary=" + eSalary + "]";
	}
	

}
