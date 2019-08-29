package fr.cesi.poec.Cinego.entities;

import java.security.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//lomboc
@NoArgsConstructor
//cree un constructeur par defaut sans argument en parametre
@AllArgsConstructor
//cree un constructeur avec tous les parametres
@Entity(name="movies")
public class Movies 
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "genre")
	@JsonProperty("genre")
	private String genre;
	@Column(name = "title")
	@JsonProperty("title")
	private String title;
	@Column(name = "yproduction")
	private Integer year;
	@Column(name = "temps")
	private Integer runtime;
	@Column(name = "director")
	@JsonProperty("director")
	private String director;
	@Column(name = "urlimage")
	@JsonProperty("urlimage")
	private String urlImage;	

}
