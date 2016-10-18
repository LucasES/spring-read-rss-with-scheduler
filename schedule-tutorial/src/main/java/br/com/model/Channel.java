package br.com.model;

public class Channel {
	private String title;

	private String description;

	private String link;

	private Item[] item;

	private Image image;

	private String language;

	private String copyright;

	private String webMaster;

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

	public Item[] getItem() {
		return item;
	}

	public void setItem(Item[] item) {
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
