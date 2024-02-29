package SpringProject.LoanManagement.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import SpringProject.LoanManagement.model.LoanUser;
@Repository
public interface UserRepository extends JpaRepository<LoanUser , Integer> {
	@Query(value = "SELECT * FROM LOAN_USER u WHERE u.user_email = ?1",nativeQuery = true  )
	public Optional<LoanUser> findByuserEmail(String email);
	
	
	@Query(value = "SELECT * FROM LOAN_USER u WHERE u.user_email = ?1 AND u.user_password = ?2 ",nativeQuery = true  )
	public Optional<LoanUser>  findByuserEmailAndPassword(String email, String password);
}