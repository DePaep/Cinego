package fr.cesi.poec.Cinego.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity => permet de mapper de la class à une table
//@Entity(name= ...) => preciser le nom de la table
//Regles pour utiliser le @Entity
//Avoir un @Id
//Avoir getters/setters
//Consturectur par défaut / sans argument
//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
//JPA - DB Mapping
@Entity(name="Seances")

public class Seances {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSeance;
	private int horaire;
	private Movies movie;
	
	

}
