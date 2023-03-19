package com.devsuperior.dsclientes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsclientes.entities.Client;
import com.devsuperior.dsclientes.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	@Transactional(readOnly= true)
	public List<Client> findAll() {
		return repository.findAll();
	}
}