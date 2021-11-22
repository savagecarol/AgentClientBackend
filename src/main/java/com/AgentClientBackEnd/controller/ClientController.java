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

import com.AgentClientBackEnd.entity.Client;

import com.AgentClientBackEnd.repository.ClientRepository;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientRepository clientRepository;

	@CrossOrigin
	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@CrossOrigin
	@GetMapping("")
	public List<Client> getAll() {
		return clientRepository.findAll();
	}

	@CrossOrigin
	@GetMapping("/{clientId}")
	public Client getByClientId(@PathVariable int clientId) {
		return clientRepository.findById(clientId).orElse(null);
	}

	@CrossOrigin
	@PutMapping("/{clientId}")
	public Client putByClientId(@PathVariable int clientId, @RequestBody Client client) {
		Client a = clientRepository.findById(clientId).orElse(null);
		if (a != null) {
			return clientRepository.save(client);
		}
		return a;
	}

	@CrossOrigin
	@PostMapping("")
	@Transactional
	public Client addClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}

}