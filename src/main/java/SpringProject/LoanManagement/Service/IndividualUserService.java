package SpringProject.LoanManagement.Service;
import java.util.List;
import java.util.Optional;

import SpringProject.LoanManagement.model.IndividualUser;

public interface IndividualUserService {
	List<IndividualUser> getAllUsers();

    Optional<IndividualUser> getUserById(int userId);

    IndividualUser createUser(IndividualUser user);

    IndividualUser updateUser(int userId, IndividualUser userDetails);

    static void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
	}

}