package com.ds.project.clickit.Service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.project.clickit.Entity.Ticket;
import com.ds.project.clickit.Repository.TicketRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TicketService {

	@Autowired
	TicketRepository repository;
	
	
	public Ticket addTicket(Ticket ticket) {
		
		Ticket ticket1 = new Ticket();
		ticket1=ticket;
		System.out.println(ticket.getMessage());
		System.out.println("This is from servc addTicket");
		
		ticket = repository.save(ticket);
		repository.flush();
		ObjectMapper Obj = new ObjectMapper();
		try {
			// get Oraganisation object as a json string
			String jsonStr = Obj.writeValueAsString(ticket1);
			// Displaying JSON String
			System.out.println(jsonStr);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return ticket;
	}
}
