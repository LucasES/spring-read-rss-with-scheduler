package br.com.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Channel implements Serializable{

	private static final long serialVersionUID = -470973933282521300L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@JsonProperty(value = "titulo")
	private String title;

	@JsonProperty(value = "descricao")
	private String description;

	private String link;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE }, orphanRemoval = true)
	@JoinColumn(name = "lead_id")
	@JsonProperty("brindes")
	private List<Item> item;

	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "imagem_id")
	@JsonProperty("canal")
	private Image image;

	private String language;

	private String copyright;

	private String webMaster;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getWebMaster() {
		return webMaster;
	}

	public void setWebMaster(String webMaster) {
		this.webMaster = webMaster;
	}

	@Override
	public String toString() {
		return "ClassPojo [title = " + title + ", description = " + description + ", link = " + link + ", item = "
				+ item + ", image = " + image + ", language = " + language + ", copyright = " + copyright
				+ ", webMaster = " + webMaster + "]";
	}
}
