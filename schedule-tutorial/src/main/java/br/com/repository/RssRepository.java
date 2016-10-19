package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.Rss;

public interface RssRepository extends JpaRepository<Rss, Long> {

}
