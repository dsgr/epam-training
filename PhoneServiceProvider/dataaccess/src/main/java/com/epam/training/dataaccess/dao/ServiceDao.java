package com.epam.training.dataaccess.dao;

import java.util.List;

import com.epam.training.dataaccess.model.Service;

public interface ServiceDao {
	
	Long insert(Service service);

	void update(Service service);

	Service getById(long id);
	
	List<Service> getUserServices(Long userId);

}
