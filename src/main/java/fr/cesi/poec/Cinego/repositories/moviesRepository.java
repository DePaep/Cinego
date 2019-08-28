package fr.cesi.poec.Cinego.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.cesi.poec.Cinego.entities.Movies;

@Repository
public interface moviesRepository  extends CrudRepository<Movies,Long>
{
	public Movies findByID(Long id);
	
	@Query (value="Select * from movies where id= ?1",nativeQuery = true)
	public Movies selectViaid(Long id);
	
	

}
