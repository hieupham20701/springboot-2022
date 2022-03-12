package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;

@Component
public class NewConverter {

	public NewEntity toEntity(NewDTO newDTO) {
		NewEntity newEntity = new NewEntity();
		newEntity.setTitle(newDTO.getTitle());
		newEntity.setThumbnail(newDTO.getThumbnail());
		newEntity.setShortDesciption(newDTO.getShortDescription());
		newEntity.setContent(newDTO.getContent());
		return newEntity;
	}

	public NewDTO toEntity(NewEntity newEntity) {
		NewDTO newDTO = new NewDTO();
		newDTO.setTitle(newEntity.getTitle());
		newDTO.setThumbnail(newEntity.getThumbnail());
		newDTO.setShortDescription(newEntity.getShortDesciption());
		newDTO.setContent(newEntity.getContent());
		
		return newDTO;
	}
}
