package SpringProject.LoanManagement.Service;
import java.util.List;

import SpringProject.LoanManagement.model.LoanUser;

public interface UserService {
	LoanUser saveUser(LoanUser loanUserObj);
	List<LoanUser>fetchUserFromDb();
	LoanUser getUserDetailsById(int userId);
	LoanUser updateUserDetailsById(LoanUser loanUserObj, int userId);
	void deleteUserdetailsById(int userId);
	List<LoanUser> deleteallUserdetails();
	
}





































