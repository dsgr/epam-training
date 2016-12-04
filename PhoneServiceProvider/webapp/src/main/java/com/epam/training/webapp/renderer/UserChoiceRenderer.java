package com.epam.training.webapp.renderer;

import org.apache.wicket.markup.html.form.ChoiceRenderer;

import com.epam.training.dataaccess.model.User;

public class UserChoiceRenderer extends ChoiceRenderer<User> {

	@Override
	public Object getDisplayValue(User object) {
		return object.getFirstName() + " " + object.getLastName();
	}

	@Override
	public String getIdValue(User object, int index) {
		return String.valueOf(object.getId());
	}
}
