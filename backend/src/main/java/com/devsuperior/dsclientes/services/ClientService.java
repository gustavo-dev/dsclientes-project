package com.devsuperior.dsclientes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsclientes.entities.Client;
import com.devsuperior.dsclientes.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	public List<Client> findAll() {
		return repository.findAll();

	}

}
