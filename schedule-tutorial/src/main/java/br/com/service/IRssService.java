package br.com.service;

import java.util.List;

import br.com.model.Rss;

/**
 * Interface responsável pelo acesso ao serviço de Rss.
 * 
 * @author lucas.araujo - lucas.araujo@ifactory.com.br
 */
public interface IRssService {

	/**
	 * Salva um rss.
	 * 
	 * @param rss
	 * @return Devolve o rss salvo com o seu id.
	 */
	public Rss save(Rss rss);
	
	/**
	 * Recupera todos os Rss.
	 * 
	 * @return Devolve todos os Rss.
	 */
	public List<Rss> findAll();
}
