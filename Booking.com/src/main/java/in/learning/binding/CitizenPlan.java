package in.learning.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "CITIZENS_PLAN_INFO")
@Entity
public class CitizenPlan {
	
	@Id
	@GeneratedValue
	private Integer cId;
	private String cName;
	private String email;
	private Long phNo;
	private String gender;
	private Long ssn;
	private String planName;
	private String planStatus;
	

}
