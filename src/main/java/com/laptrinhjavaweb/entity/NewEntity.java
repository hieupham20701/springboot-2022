package com.laptrinhjavaweb.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class NewEntity extends BaseEntity {

	@Column(name = "title")
	private String title;
	@Column(name = "thumbnail")
	private String thumbnail;
	@Column(name = "shortdescription")
	private String shortDesciption;
	@Column(name = "content")
	private String content;

	@ManyToOne
	@JoinColumn(name = "categoryid")
	private CategoryEntity category;

	public NewEntity() {
		// TODO Auto-generated constructor stub
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getShortDesciption() {
		return shortDesciption;
	}

	public void setShortDesciption(String shortDesciption) {
		this.shortDesciption = shortDesciption;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	
}
