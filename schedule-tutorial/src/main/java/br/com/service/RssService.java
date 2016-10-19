package br.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.model.Rss;
import br.com.repository.RssRepository;

@Service
@Transactional
public class RssService implements IRssService{

	@Autowired
	private RssRepository repository;
	
	@Override
	public Rss save(Rss rss) {				
		return repository.save(rss);	
	}

	@Override
	public List<Rss> findAll() {
		return repository.findAll();
	}

}
