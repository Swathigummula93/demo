package SpringProject.LoanManagement.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import SpringProject.LoanManagement.Repository.IndividualUserRepository;
import SpringProject.LoanManagement.Service.IndividualUserService;
import SpringProject.LoanManagement.model.IndividualUser;


@Service
public class IndividualUserServiceImp implements IndividualUserService {

	 @Autowired
	    private IndividualUserRepository userRepository;

	    @Override
	    public List<IndividualUser> getAllUsers() {
	        return userRepository.findAll();
	    }

	    @Override
	    public Optional<IndividualUser> getUserById(int userId) {
	        return userRepository.findById(userId);
	    }

	    @Override
	    public IndividualUser createUser(IndividualUser user) {
	        return userRepository.save(user);
	    }

	    @Override
	    public IndividualUser updateUser(int userId, IndividualUser userDetails) {
	        IndividualUser user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
	        // Update user details
	        user.setUserName(userDetails.getUserName());
	        user.setDob(userDetails.getDob());
	        user.setEmpId(userDetails.getEmpId());
	        user.setMonthlySalary(userDetails.getMonthlySalary());
	        user.setExpensesSheet(userDetails.getExpensesSheet());
	        user.setLoansSummary(userDetails.getLoansSummary());
	        user.setDocumentsToUpload(userDetails.getDocumentsToUpload());
	        return userRepository.save(user);
	    }

	    public void deleteUser(int userId) {
	        userRepository.deleteById(userId);
	    }
	    }