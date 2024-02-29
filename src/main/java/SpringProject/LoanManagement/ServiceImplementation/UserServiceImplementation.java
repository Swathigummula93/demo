package SpringProject.LoanManagement.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.LoanManagement.Repository.UserRepository;
import SpringProject.LoanManagement.model.LoanUser;

@Service

public class UserServiceImplementation {
	@Autowired
	private UserRepository userRepository;
	

	public void addUser( LoanUser user) {
		
		this.userRepository.save(user);
		
	}

	public  Optional<LoanUser> getUserByEmail(String email) {
		
		return this.userRepository.findByuserEmail(email);
		
	}
	public List<LoanUser> getAllUser(){
		return userRepository.findAll();
	}
	public LoanUser viewUser(Integer userId ) {
		Optional<LoanUser> user =  userRepository.findById(userId);  //null , or it can 5tg person rec
		if(user.isPresent()) {
			return user.get();
		}
		else {
			return null;
		}
	}
}