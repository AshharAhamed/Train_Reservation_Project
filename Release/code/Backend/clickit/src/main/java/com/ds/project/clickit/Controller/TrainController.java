package com.ds.project.clickit.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ds.project.clickit.Entity.Train;
import com.ds.project.clickit.Repository.TrainRepository;

@RestController
@RequestMapping(path = "/train")
public class TrainController {
	
	@Autowired
	private TrainRepository repository;

	@GetMapping("/hello")
    public String index() {
		System.out.println("Greetings from Spring Boot!");
		return "HI";
	}
	
	
	@GetMapping("/allTrain")
	 public List<Train> findAll(){
		
		List<Train> trains;
		
			trains = repository.findAll();
			if(trains!=null) {
				for(Train train : trains) {
					System.out.println(train.toString());
				}
			}else {
				System.out.println("Fail");
			}
		
		
		
	   return trains;
	 }
	
	@GetMapping("/trainFromtoTo")
	 public List<Train> findAllByFromTo(@RequestParam String from,String to){
		
		List<Train> trains;
		
			trains = repository.findByFromAndTo(from,to);
			if(trains!=null) {
				for(Train train : trains) {
					System.out.println(train.toString());
				}
			}else {
				System.out.println("Fail");
			}
		
		
		
	   return trains;
	 }
}
