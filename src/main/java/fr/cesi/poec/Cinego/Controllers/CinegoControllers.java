package fr.cesi.poec.Cinego.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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


	@GetMapping("")
	public ResponseEntity<List<Movies>> getAllMovies()
	{
		return 	new ResponseEntity<List<Movies>>((List<Movies>)movieRepo.findAll(), HttpStatus.OK);

	}
}
