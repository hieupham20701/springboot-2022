package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.converter.NewConverter;
import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.responsitory.CategoryResponsitory;
import com.laptrinhjavaweb.responsitory.NewResponsitory;
import com.laptrinhjavaweb.service.INewService;

@Service
public class NewService  implements INewService{
	
	@Autowired
	private NewResponsitory newResponsitory;
	
	@Autowired
	private CategoryResponsitory categoryResponsitory;
	
	@Autowired
	private NewConverter newConverter;
	public NewService(NewResponsitory newResponsitory) {
		// TODO Auto-generated constructor stub
		this.newResponsitory = newResponsitory;
	}

	@Override
	public NewDTO save(NewDTO newDTO) {
		
		CategoryEntity categoryEntity = categoryResponsitory.findOneByCode(newDTO.getCategoryCode());
		NewEntity newEntity = newConverter.toEntity(newDTO);
		newEntity.setCategory(categoryEntity);
		newEntity = newResponsitory.save(newEntity);
		
		return newConverter.toEntity(newEntity);
	}
	
}
