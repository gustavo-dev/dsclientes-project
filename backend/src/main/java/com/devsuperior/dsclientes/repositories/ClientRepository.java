package com.devsuperior.dsclientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsclientes.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	

}
