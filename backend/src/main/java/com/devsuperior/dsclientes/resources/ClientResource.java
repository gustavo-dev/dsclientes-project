package com.devsuperior.dsclientes.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclientes.entities.Client;

@RestController
@RequestMapping(value="/clients")
public class ClientResource {
	@GetMapping
	public ResponseEntity<List<Client>>findAll(){
		List<Client> list = new ArrayList<>();
		 list.add(new Client(1L, "João", "123.456.789-00", 2000.0, Instant.parse("1990-01-01T00:00:00Z"), 2));
		 list.add(new Client(2L,"Maria", "987.654.321-00", 3000.0, Instant.parse("1985-01-01T00:00:00Z"), 1));
		 list.add(new Client(3L, "Pedro", "111.222.333-44", 4000.0, Instant.parse("1980-01-01T00:00:00Z"), 0));
		 list.add(new Client(4L,"Ana", "555.666.777-88", 5000.0, Instant.parse("1975-01-01T00:00:00Z"), 3));
		 list.add(new Client(5L,"Carlos", "999.888.777-66", 6000.0, Instant.parse("1970-01-01T00:00:00Z"), 2));
		 list.add(new Client(6L,"Fernanda", "222.333.444-55", 7000.0, Instant.parse("1965-01-01T00:00:00Z"), 1));
		 list.add(new Client(7L,"Rodrigo", "888.777.666-55", 8000.0, Instant.parse("1960-01-01T00:00:00Z"), 0));
		 list.add(new Client(8L,"Julia", "444.333.222-11", 9000.0, Instant.parse("1955-01-01T00:00:00Z"), 2));
		 list.add(new Client(9L,"Lucas", "777.666.555-00", 10000.0, Instant.parse("1950-01-01T00:00:00Z"), 1));
		 list.add(new Client(10L,"Mariana", "333.222.111-00", 11000.0, Instant.parse("1945-01-01T00:00:00Z"), 0));
		return ResponseEntity.ok().body(list);
	}	
}
