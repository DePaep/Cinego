package fr.cesi.poec.Cinego.repositories;

import fr.cesi.poec.Cinego.entities.Movies;
import fr.cesi.poec.Cinego.entities.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users,Long> {
    @Query(value="SELECT * FROM users WHERE email = ?1", nativeQuery=true)
    public Users selectUsers(String email);
}
