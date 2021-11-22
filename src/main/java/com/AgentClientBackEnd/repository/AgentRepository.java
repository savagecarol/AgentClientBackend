package com.AgentClientBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgentClientBackEnd.entity.Agent;


public interface AgentRepository extends JpaRepository<Agent, Integer>
{

}

