package fr.cesi.poec.Cinego.Controllers;

import fr.cesi.poec.Cinego.entities.Movies;
import fr.cesi.poec.Cinego.repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/movies")
public class MoviesController
{
	private MoviesRepository movieRepo;

	@Autowired
	public MoviesController(MoviesRepository movieRepo)
	{
		this.movieRepo = movieRepo;
	}
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, path = "/films")
	public ResponseEntity<List<Movies>> getAllMovies()
	{
		return 	new ResponseEntity<List<Movies>>((List<Movies>)movieRepo.findAll(), HttpStatus.OK);

	}
}
