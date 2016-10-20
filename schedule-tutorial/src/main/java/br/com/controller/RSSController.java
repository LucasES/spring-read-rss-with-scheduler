package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.model.Rss;
import br.com.service.IRssService;

@RestController
@RequestMapping(value = "/rss")
public class RSSController {

	@Autowired
	private IRssService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Rss>> findAll() {
		List<Rss> rssList = service.findAll();
		
		return new ResponseEntity<List<Rss>>(rssList, HttpStatus.OK);
	}
	
}
