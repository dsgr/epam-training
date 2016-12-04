package com.epam.training.webapp.page.user.register;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.wicket.datetime.StyleDateConverter;
import org.apache.wicket.datetime.markup.html.form.DateTextField;
import org.apache.wicket.extensions.yui.calendar.DatePicker;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.SubmitLink;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.validation.validator.StringValidator;

import com.epam.training.dataaccess.model.User;
import com.epam.training.services.UserService;
import com.epam.training.webapp.page.AbstractPage;
import com.epam.training.webapp.renderer.UserChoiceRenderer;

public class UserEditPage extends AbstractPage {

	@Inject
	private UserService userService;

	private User user;

	public UserEditPage() {
		this(new User());
	}

	public UserEditPage(User user) {
		super();
		this.user = user;
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();

		add(new FeedbackPanel("feedback"));

		Form<User> form = new Form<>("form", new CompoundPropertyModel<>(user));
		add(form);

		form.add(new TextField<String>("firstName"));

		TextField<String> textField = new TextField<String>("lastName");
		form.add(textField);
		TextField<String> emailTextField = new TextField<String>("email");
		emailTextField.setLabel(Model.of("E-mail"));
		emailTextField.setRequired(true);
		emailTextField.add(StringValidator.maximumLength(255));

		form.add(emailTextField);
		form.add(new TextField<Long>("children"));
		form.add(new CheckBox("active"));

		DateTextField dateTextField = new DateTextField("birthDate",
				new StyleDateConverter("S-", true));
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

		dateTextField.setRequired(true);

		final Model<User> childModel = new Model<User>();
		List<User> choices = new ArrayList<User>();
		choices.add(userService.get(2l));
		choices.add(userService.get(12l));
		choices.add(userService.get(13l));
		DropDownChoice<User> dropDownChoice = new DropDownChoice<User>("child",
				childModel, choices, new UserChoiceRenderer());
		dropDownChoice.setRequired(true);
		form.add(dropDownChoice);

		form.add(new SubmitLink("submit-button") {
			@Override
			public void onSubmit() {
				User selectedChild = childModel.getObject();
				user.setChildId(selectedChild.getId());

				boolean isNew = user.getId() == null;
				userService.insertOrUpdate(user);
				UserEditPage pageToResponse = new UserEditPage(user);
				if (isNew) {
					pageToResponse.info("new user created !!!!");
				} else {
					pageToResponse.info("user updated!!!!");
				}
				setResponsePage(pageToResponse);
			}
		});

	}
}
