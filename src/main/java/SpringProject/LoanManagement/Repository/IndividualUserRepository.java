package SpringProject.LoanManagement.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import SpringProject.LoanManagement.model.IndividualUser;
@Repository
public interface IndividualUserRepository extends JpaRepository<IndividualUser, Integer> {
    Optional<IndividualUser> findByUserId(int userId);
}


