package com.epam.training.services;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.epam.training.dataaccess.model.User;

public class UserServiceTest extends AbstractSpringTest {

	@Autowired
	private UserService service;

	@Test
	public void salaryPaymentTest() {
		
		//User u = service.get(1l);
		//System.out.println(u.toString());
		
		
		
		List<User> ul = service.getAll();
		for(User u:ul){
			System.out.println(u.toString());
		}
		//service.addServiceToUser(2, 2);
		service.removeServiceFromUser(2, 2);
	}

}
