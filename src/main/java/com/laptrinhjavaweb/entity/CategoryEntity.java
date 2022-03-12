package com.laptrinhjavaweb.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {
	
	@Column(name = "name")
	private String name;
	@Column(name = "code")
	private String code;
	
	@OneToMany(mappedBy = "category")
	private List<NewEntity> newEntities;

	
	

}
