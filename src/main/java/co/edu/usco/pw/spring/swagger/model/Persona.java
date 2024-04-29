package co.edu.usco.pw.spring.swagger.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Persona {

	@Schema(accessMode = Schema.AccessMode.READ_ONLY)
	private long id = 0;

	private String name;
	private String lastname;

}
