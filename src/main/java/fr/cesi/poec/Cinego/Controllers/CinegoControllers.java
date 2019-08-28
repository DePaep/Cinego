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

import fr.cesi.poec.Cinego.repositories.moviesRepository;
import fr.cesi.poec.springaddressbook.entities.Contact;
import fr.cesi.poec.springaddressbook.repositories.ContactRepository;

@RestController
@RequestMapping("/movies")
public class CinegoControllers 
{
	private moviesRepository movieRepo;

	@Autowired
	public CinegoControllers(moviesRepository movieRepo)
	{
		this.movieRepo = movieRepo;
	}


	@GetMapping("")
	public ResponseEntity<List<Contact>> getAllContacts()
	{

		return 	new ResponseEntity<List<Contact>>(
				(List<Contact>)contactRepo.findAll(),
				HttpStatus.OK
				);

	}
	
	

	@GetMapping("/{idContact}")
	public ResponseEntity<Contact> getOneContact (@PathVariable("idContact")Long id) 
	{
		//pour recuperer avec findbyid utiliser method get
		Contact contact = contactRepo.findById(id).orElse(null);
		//200
		//400
		if(contact != null)
		{
			return 	new ResponseEntity<Contact>(contact,HttpStatus.OK);
		}
		//ResponseEntity contact code 200
		else
		{
			return 	new ResponseEntity<Contact>(contact,HttpStatus.NOT_FOUND);
			//ResponseEntity contact code 400
		}
	}
	
	@PostMapping("") 
	public ResponseEntity<Contact> createContact(@RequestBody Contact contact)
	{
		contact =this.contactRepo.save(contact);
		return new ResponseEntity<Contact>(contact,HttpStatus.CREATED);
	}
	
	//Delete / conacts/id
	@PostMapping("/{idContact}") 
	public void deleteContact(@PathVariable Long id) 
	{
		Contact contact = contactRepo.findById(id).orElse(null);
		if(contact != null)
		
		contactRepo.deleteById(id);
			
	
	}
	
	// PUT / contacts 
	@PutMapping("/{idContact}")
	public ResponseEntity<Contact> updateContact( @RequestBody Contact newContact,@PathVariable Long id)
			{
			Contact contact = contactRepo.findById(id).orElse(null);
			if(contact != null)
			contact.setFirstname (newContact.getFirstname());
			
			
			
				return null;
		
			}

}






}
