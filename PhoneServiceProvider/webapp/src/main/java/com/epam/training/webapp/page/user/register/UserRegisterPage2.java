package com.epam.training.webapp.page.user.register;

import java.util.Date;

import javax.inject.Inject;

import org.apache.wicket.datetime.StyleDateConverter;
import org.apache.wicket.datetime.markup.html.form.DateTextField;
import org.apache.wicket.extensions.yui.calendar.DatePicker;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.SubmitLink;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

import com.epam.training.dataaccess.model.User;
import com.epam.training.services.UserService;
import com.epam.training.webapp.page.AbstractPage;
import com.epam.training.webapp.page.home.HomePage;

public class UserRegisterPage2 extends AbstractPage {

	@Inject
	private UserService userService;

	@Override
	protected void onInitialize() {
		super.onInitialize();
		Form<Object> form = new Form<>("form");
		add(form);

		final User newUser = new User();
		newUser.setLastName("Тест");

		final TextField<String> fNameField = new TextField<String>("firtsName",
				new PropertyModel<String>(newUser, "firstName"));
		form.add(fNameField);

		form.add(new TextField<String>("lastName", new PropertyModel<String>(newUser,
				"lastName")));
		form.add(new TextField<String>("email", new PropertyModel<String>(newUser,
				"email")));

		form.add(new CheckBox("active", new PropertyModel<Boolean>(newUser, "active")));

		DateTextField dateTextField = new DateTextField("dateTextField",
				new PropertyModel<Date>(newUser, "birthDate"), new StyleDateConverter(
						"S-", true));
		form.add(dateTextField);

		DatePicker datePicker = new DatePicker() {
			@Override
			protected String getAdditionalJavaScript() {
				return "${calendar}.cfg.setProperty(\"navigator\",true,false); ${calendar}.render();";
			}
		};
		datePicker.setShowOnFieldClick(true);
		datePicker.setAutoHide(true);
		dateTextField.add(datePicker);

		form.add(new SubmitLink("submit-button") {
			@Override
			public void onSubmit() {
				userService.registerUser(newUser);
				setResponsePage(new HomePage());
			}
		});

	}
}
