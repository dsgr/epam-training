package com.epam.training.webapp.component;

import org.apache.wicket.markup.html.link.Link;

import com.epam.training.webapp.app.CustomSession;
import com.epam.training.webapp.page.login.LoginPage;

public class MenuForLoggedUserPanel extends MenuForAnonymUser {

	public MenuForLoggedUserPanel(String id) {
		super(id);
		add(new Link("logout") {

			@Override
			public void onClick() {
				CustomSession.get().signOut();
				setResponsePage(LoginPage.class);
			}

		});
	}

}
