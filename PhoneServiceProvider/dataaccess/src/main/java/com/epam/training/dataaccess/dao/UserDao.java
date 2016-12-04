package com.epam.training.dataaccess.dao;

import java.util.List;
import com.epam.training.dataaccess.model.User;
import com.epam.training.dataaccess.model.Service;

public interface UserDao {

	Long insert(User user);

	void update(User user);

	User getById(long id);

	List<User> getAll();
	
	void addServiceToUser(long userId, long serviceId);
	
	void removeServiceFromUser(long userId, long serviceId);
	
	//List<Service> getUserServices(Long userId);
	
	boolean exist(long id);
}
