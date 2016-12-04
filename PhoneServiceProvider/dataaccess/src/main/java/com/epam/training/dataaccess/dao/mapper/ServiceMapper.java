package com.epam.training.dataaccess.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.epam.training.dataaccess.model.Service;

public class ServiceMapper implements RowMapper<Service> {
	@Override
	public Service mapRow(ResultSet rs, int rowNum) throws SQLException {
		Long id = rs.getLong("id");
		String name = rs.getString("name");
		Double price = rs.getDouble("price");		
		String description = rs.getString("description");
		
		Service service = new Service();
		service.setId(id);
		service.setName(name);
		service.setPrice(price);
		service.setDescription(description);
				
		return service;
	}
}
