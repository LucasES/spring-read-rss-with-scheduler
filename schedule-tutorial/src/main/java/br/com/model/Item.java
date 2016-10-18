package br.com.model;

public class Item {
	private String pubDate;

	private String title;

	private String urlImage;

	private String description;

	private String link;

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
