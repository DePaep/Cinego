package fr.cesi.poec.Cinego.entities;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//lomboc
@NoArgsConstructor
//cree un constructeur par defaut sans argument en parametre
@AllArgsConstructor
//cree un constructeur avec tous les parametres
@Entity(name="Movies")



public class Movies 
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMovie;
	
	private String title;
	private String genre;//+--e
	private int year;
	private Timestamp runtime;
	private String director;
	private String urlImage;	

}
