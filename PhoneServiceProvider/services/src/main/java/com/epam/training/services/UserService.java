package com.epam.training.services;

import java.util.List;

import com.epam.training.dataaccess.model.User;

public interface UserService {

	void insertOrUpdate(User user);

	User get(Long id);

	List<User> getAll();

	void addServiceToUser(long userId, long serviceId);

	void removeServiceFromUser(long userId, long serviceId);

}
