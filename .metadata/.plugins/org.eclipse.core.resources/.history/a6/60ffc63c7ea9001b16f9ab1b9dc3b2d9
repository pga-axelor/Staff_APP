package Staff;
import java.io.Serializable;  

import javax.persistence.*;  

@Entity  
@Table 
@Inheritance(strategy=InheritanceType.JOINED)  
public class Employee implements Serializable {  

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + "]";
	}



	@Id       
	private int e_id;  
	private String e_name;  



	public Employee(int e_id, String e_name) {  
		super();  
		this.e_id = e_id;  
		this.e_name = e_name;  
	}  



	public Employee() {  
		super();  

	}  



	public int getE_id() {  
		return e_id;  
	}  



	public void setE_id(int e_id) {  
		this.e_id = e_id;  
	}  



	public String getE_name() {  
		return e_name;  
	}  



	public void setE_name(String e_name) {  
		this.e_name = e_name;  
	}  


}  