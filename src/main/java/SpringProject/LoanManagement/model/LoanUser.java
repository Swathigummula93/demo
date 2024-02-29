package SpringProject.LoanManagement.model;

import java.util.Date;
import org.hibernate.annotations.DynamicUpdate;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
@DynamicUpdate
public class LoanUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(length = 100, nullable = false)
	private String userName;
	
	@Column(length = 20, updatable = true)
	@Size(min = 8, max =20,message = "password must be between 8 to 20 characters long.")
	private String userPassword;
	
	
	@Column(length = 50, updatable = false, unique = true)
	@Email(message = "Email id format is incorrect.")
	private String userEmail;


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	@Override
	public String toString() {
		return "LoanUser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userEmail=" + userEmail + "]";
	}
	
	


	
}
