package br.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Item implements Serializable{
	
	private static final long serialVersionUID = -8089067957582954881L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	private String pubDate;

	@Lob 
	@Column(name="titulo", length=2048)
	@JsonProperty(value = "titulo")
	private String title;

	@Lob 
	@Column(name="urlImagem", length=2048)
	private String urlImage;

	@Lob 
	@Column(name="descricao", length=2048)
	@JsonProperty(value = "descricao")
	private String description;

	@Lob 
	@Column(name="link", length=2048)
	private String link;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "ClassPojo [pubDate = " + pubDate + ", title = " + title + ", urlImage = " + urlImage
				+ ", description = " + description + ", link = " + link + "]";
	}
}
