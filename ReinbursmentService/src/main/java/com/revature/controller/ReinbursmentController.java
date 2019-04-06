package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Reinbursment;

@RestController
@RequestMapping("/reinbursment")
public class ReinbursmentController {
	
	private Logger log = Logger.getLogger(ReinbursmentController.class);
	
	private List<Reinbursment> reinburments = new ArrayList<>();
	
	@GetMapping
	public List<Reinbursment> getAllReinbursment() {
		return reinburments;
	}

}
