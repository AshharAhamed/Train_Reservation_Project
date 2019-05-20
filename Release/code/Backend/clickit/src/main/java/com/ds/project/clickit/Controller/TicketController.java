package com.ds.project.clickit.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ds.project.clickit.Entity.Ticket;
import com.ds.project.clickit.Entity.Train;
import com.ds.project.clickit.Entity.User;
import com.ds.project.clickit.Repository.TicketRepository;
import com.ds.project.clickit.Service.TicketService;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
@RequestMapping(path = "/ticket")
public class TicketController {

	@Autowired
	TicketRepository repository;
	
	@Autowired
	TicketService ticketService = new TicketService();
	
	@GetMapping("/hello")
    public String index() {
		System.out.println("Greetings from Spring Boot!");
		return "HI";	
	}
	
	@GetMapping("/allTicket")
	public List<Ticket> findAllTickets(){
		
		List<Ticket> tickets;
		
		tickets = repository.findAll();
			if(tickets!=null) {
				for(Ticket train : tickets) {
					
					System.out.println("success in ticket repo");
				}
			}else {
				System.out.println("Fail");
			}
		
			ObjectMapper Obj = new ObjectMapper();
			try {

				// get Oraganisation object as a json string
				String jsonStr = Obj.writeValueAsString(tickets);

				// Displaying JSON String
				System.out.println(jsonStr);

			} catch (IOException e) {
				e.printStackTrace();
			}
		
	   return tickets;
	 }
	
	@PostMapping(path = "/add")
//    @ResponseBody
	public Ticket addTicket( @RequestBody Ticket ticket ) {

		/*
		 * Ticket ticket1 = new Ticket(); Train train = new Train(); User user = new
		 * User();
		 */
//		Ticket ticket = new Ticket();

		/*
		 * ticket.setTrain_id(2); ticket.setUser_id(1); ticket.setAmount(2050);
		 * ticket.setArrival_time("6.30"); ticket.setDepature_time("6.35");
		 * ticket.setMessage("Success fully booked successfully");
		 * ticket.setNo_of_ticket(10); ticket.setTclass(2); // ticket.setTrain(train);
		 * // ticket.setUser(user); ticket.setPaid(0);
		 */

		ObjectMapper Obj = new ObjectMapper();
		try {
			// get Oraganisation object as a json string
			String jsonStr = Obj.writeValueAsString(ticket);
			// Displaying JSON String
			System.out.println(jsonStr);
			System.out.println("this is in t contrllr");
		} catch (IOException e) {
			e.printStackTrace();
		}

		Ticket ret = ticketService.addTicket(ticket);

//        System.out.println(jsonStr);
		return ret;
	}
	
}
