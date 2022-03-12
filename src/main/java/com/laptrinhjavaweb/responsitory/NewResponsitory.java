package com.laptrinhjavaweb.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.NewEntity;

public interface NewResponsitory extends JpaRepository<NewEntity, Long>// Truyền vào Table (NewEnity đã map với table
																		// database) và kiểu dữ liệu của khóa chính
{	
	
}
