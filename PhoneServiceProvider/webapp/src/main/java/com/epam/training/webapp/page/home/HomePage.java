package com.epam.training.webapp.page.home;

import javax.inject.Inject;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.html.link.Link;

import com.epam.training.services.UserService;
import com.epam.training.webapp.page.AbstractPage;
import com.epam.training.webapp.page.user.list.UsersDataViewPage;
import com.epam.training.webapp.page.user.list.UsersListViewPage;

@AuthorizeInstantiation(value = { "admin" })
public class HomePage extends AbstractPage {

	@Inject
	private UserService userService;

	@Override
	protected void onInitialize() {
		super.onInitialize();

		add(new Link("users-list") {
			@Override
			public void onClick() {
				setResponsePage(new UsersListViewPage());
			}
		});

		add(new Link("users-dataview") {
			@Override
			public void onClick() {
				setResponsePage(new UsersDataViewPage());
			}
		});

	};
}
