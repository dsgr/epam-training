package com.epam.training.webapp.page.user.register;

import javax.inject.Inject;

import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.SubmitLink;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

import com.epam.training.dataaccess.model.User;
import com.epam.training.services.UserService;
import com.epam.training.webapp.page.AbstractPage;

public class UserRegisterPage1 extends AbstractPage {

	@Inject
	private UserService userService;

	@Override
	protected void onInitialize() {
		super.onInitialize();
		Form<Object> form = new Form<>("form");
		add(form);

		final TextField<String> fNameField = new TextField<String>("firtsName",
				new Model<String>(null));
		form.add(fNameField);

		form.add(new TextField<String>("lastName", new Model<String>("default name")));
		form.add(new TextField<String>("email", new Model<String>(null)));

		final Model<Boolean> isActiveModel = new Model<Boolean>(Boolean.TRUE);
		form.add(new CheckBox("active", isActiveModel));

		form.add(new SubmitLink("submit-button") {
			@Override
			public void onSubmit() {
				User user = new User();
				user.setFirstName(fNameField.getModelObject());
				user.setActive(isActiveModel.getObject());
				// TODO other fields
				userService.registerUser(user);
			}
		});

	}
}
