package ec.edu.itsqmet.aves.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "bird-category")
public class AvesDTO {
	@Id
	private Integer id;
	private String name;

}
