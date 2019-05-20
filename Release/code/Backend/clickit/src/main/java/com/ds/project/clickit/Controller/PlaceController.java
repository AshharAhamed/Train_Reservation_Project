package com.ds.project.clickit.Controller;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ds.project.clickit.Entity.Place;
import com.ds.project.clickit.Entity.Train;
import com.ds.project.clickit.Repository.PlaceRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(path = "/place")
public class PlaceController {

	@Autowired
	PlaceRepository repo;
	
	
	
	@GetMapping("/hello")
    public String index() {
		System.out.println("Greetings from Spring Boot!");
		return "HI";	
	}
	
	@GetMapping(path = "/add")
    @ResponseBody
	public Place addPlace(@RequestParam String name) {

		Place plc = new Place();
		plc.setName(name);
		 plc = repo.save(plc);
		 repo.flush();
		String ret = "place has been added, place name = " + name;
		ObjectMapper Obj = new ObjectMapper();
		try {

			// get Oraganisation object as a json string
			String jsonStr = Obj.writeValueAsString(plc);

			// Displaying JSON String
			System.out.println(jsonStr);

		} catch (IOException e) {
			e.printStackTrace();
		}
//        System.out.println(jsonStr);
		return plc;
	}
	
	@PostMapping("/createPlace")
	public ResponseEntity<Object> createStudent(@RequestBody Place place) {
		Place savedPlace = repo.save(place);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedPlace.getPlace_id()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@GetMapping("/allPlace")
	 public List<Place> findAll(){
		
		List<Place> places;
		
		places = repo.findAll();
			if(places!=null) {
				for(Place place : places) {
					System.out.println(place.toString());
				}
			}else {
				System.out.println("Fail");
			}
		
		
		
	   return places;
	 }
}
