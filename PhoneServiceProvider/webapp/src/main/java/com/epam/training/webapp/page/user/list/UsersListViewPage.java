package com.epam.training.webapp.page.user.list;

import java.util.List;

import javax.inject.Inject;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;

import com.epam.training.dataaccess.model.User;
import com.epam.training.services.UserService;
import com.epam.training.webapp.page.AbstractPage;
import com.epam.training.webapp.page.user.register.UserEditPage;

public class UsersListViewPage extends AbstractPage {

	@Inject
	private UserService userService;

	@Override
	protected void onInitialize() {
		super.onInitialize();
		List<User> allUsers = userService.getAll();

		add(new ListView<User>("users-list", allUsers) {
			@Override
			protected void populateItem(ListItem<User> item) {
				final User user = item.getModelObject();
				item.add(new Label("id", user.getId()));
				item.add(new Label("fName", user.getFirstName()));
				item.add(new Label("lName", user.getLastName()));
				item.add(new Label("email", user.getEmail()));

				item.add(new Link("edit-link") {
					@Override
					public void onClick() {
						setResponsePage(new UserEditPage(user));
					}
				});

			}
		});

		add(new Link("create-link") {
			@Override
			public void onClick() {
				setResponsePage(new UserEditPage());
			}
		});
	}
}
