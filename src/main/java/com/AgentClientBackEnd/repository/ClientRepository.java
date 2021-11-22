package com.AgentClientBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgentClientBackEnd.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>
{

}

