package com.AgentClientBackEnd.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AgentClientBackEnd.entity.Agent;
import com.AgentClientBackEnd.repository.AgentRepository;

@RestController
@RequestMapping("/agent")
public class AgentController
{
	
	@Autowired
	private AgentRepository agentRepository;
	
	@CrossOrigin
	@GetMapping("/home")
	public String home() 
	{
			return "home";
	}
	
	@CrossOrigin
	@GetMapping("")
	public List<Agent> getAll()
	{
		return agentRepository.findAll();
	}

	@CrossOrigin
	@GetMapping("/{agentId}")
	public Agent getByAgentId(@PathVariable int agentId) 
	{
		return agentRepository.findById(agentId).orElse(null);
	}
	
	@CrossOrigin
	@PutMapping("/{agentId}")
	public Agent putByAgentId(@PathVariable int agentId , @RequestBody Agent agent) 
	{
		Agent a = agentRepository.findById(agentId).orElse(null);
		if(a!=null)
		{
			return agentRepository.save(agent);		
		}
		return a;
	}
	

	@CrossOrigin
	@PostMapping("")
	@Transactional
	public Agent addAgent(@RequestBody Agent agent) 
	{
		return agentRepository.save(agent);	
	}
	
}
