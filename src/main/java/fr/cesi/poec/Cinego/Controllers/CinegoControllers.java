package fr.cesi.poec.Cinego.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fr.cesi.poec.Cinego.entities.Movies;
import fr.cesi.poec.Cinego.repositories.MoviesRepository;


@RestController
@RequestMapping("/movies")
public class CinegoControllers
{
	private MoviesRepository movieRepo;

	@Autowired
	public CinegoControllers(MoviesRepository movieRepo)
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
