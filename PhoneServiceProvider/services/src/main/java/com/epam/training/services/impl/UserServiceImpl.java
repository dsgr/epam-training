package com.epam.training.services.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.training.dataaccess.dao.UserDao;
import com.epam.training.dataaccess.model.User;
import com.epam.training.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDao userDao;

	@PostConstruct
	private void init() {

	}

	@Override
	public void insertOrUpdate(User user) {
		if (user.getId() == null) {
			Long id = userDao.insert(user);
			LOGGER.info("new user created. id: {}", id);
		} else {
			userDao.update(user);
		}
	}

	@Override
	public User get(Long id) {
		return userDao.getById(id);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public void addServiceToUser(long userId, long serviceId) {

		if (userDao.exist(userId)) {
			userDao.addServiceToUser(userId, serviceId);
		}
	}
	
	@Override
	public void removeServiceFromUser(long userId, long serviceId) {

		if (userDao.exist(userId)) {
			userDao.removeServiceFromUser(userId, serviceId);
		}
	}
}
