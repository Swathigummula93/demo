package SpringProject.LoanManagement.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import SpringProject.LoanManagement.Service.IndividualUserService;
import SpringProject.LoanManagement.ServiceImplementation.IndividualUserServiceImp;

import SpringProject.LoanManagement.model.IndividualUser;

@RestController
@CrossOrigin
@RequestMapping("/strifin.com")
public class IndividualUserController {
	@Autowired
    private IndividualUserService userService;

    @GetMapping
    public ResponseEntity<List<IndividualUser>> getAllUsers() {
        List<IndividualUser> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<IndividualUser> getUserById(@PathVariable("userId") int userId) {
        Optional<IndividualUser> user = userService.getUserById(userId);
        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<IndividualUser> createUser(@RequestBody IndividualUser user) {
        IndividualUser createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<IndividualUser> updateUser(@PathVariable("userId") int userId, @RequestBody IndividualUser userDetails) {
        IndividualUser updatedUser = userService.updateUser(userId, userDetails);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("userId") int userId) {
        IndividualUserService.deleteUser(userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
	    
	

