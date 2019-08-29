package fr.cesi.poec.Cinego.Controllers;

import fr.cesi.poec.Cinego.entities.Movies;
import fr.cesi.poec.Cinego.entities.Users;
import fr.cesi.poec.Cinego.repositories.MoviesRepository;
import fr.cesi.poec.Cinego.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersControllers
{
    private UsersRepository usersRepository;

    @Autowired
    public UsersControllers(UsersRepository usersRepository)
    {
        this.usersRepository = usersRepository;
    }

    //POST /contacts
   @CrossOrigin()
    @RequestMapping(method = RequestMethod.POST, path = "/register")
    public ResponseEntity<Users> inscription(@RequestBody Users users) {
        users = this.usersRepository.save(users);
        return new ResponseEntity<Users>(users, HttpStatus.CREATED);
    }
    @CrossOrigin()
    @RequestMapping(method = RequestMethod.POST, path = "/connexion")
    public ResponseEntity<Users> connexion(@RequestBody Users users) {
        Users test = usersRepository.selectUsers(users.getEmail());
        return new ResponseEntity<Users>(test, HttpStatus.CREATED);
    }

}
