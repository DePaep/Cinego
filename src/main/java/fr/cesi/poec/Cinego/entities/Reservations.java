package fr.cesi.poec.Cinego.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.MapKeyType;
import org.hibernate.annotations.ValueGenerationType;

@Data
@NoArgsConstructor
@AllArgsConstructor
//JPA - DB Mapping
@Entity(name="reservations")
public class Reservations
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idReservation;
	@OneToOne
	private Seances idSeance;
	@OneToOne
	private Movies idMovie;
	@OneToOne
	private Salles salles;
}
