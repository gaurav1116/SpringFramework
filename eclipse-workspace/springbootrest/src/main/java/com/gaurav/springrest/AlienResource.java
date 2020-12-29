package com.gaurav.springrest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource 
{

@RequestMapping("aliens")
public List<Alien> getAliens()

{
	
	List<Alien> aliens = new ArrayList<>();
	
	Alien a1 = new Alien();
	a1.setName("Gaurav");
	a1.setPoints(200);
	
	Alien a2 = new Alien();
	a2.setName("Cranopy");
	a2.setPoints(200);
	
	Alien a3 = new Alien();
	a3.setName("Brussels");
	a3.setPoints(200);
	
	aliens.add(a1);
	aliens.add(a2);
	aliens.add(a3);
	
	return aliens;
	
}
}
