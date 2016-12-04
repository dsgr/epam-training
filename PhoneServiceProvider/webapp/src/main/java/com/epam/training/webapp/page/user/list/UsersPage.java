package com.epam.training.webapp.page.user.list;

import org.apache.wicket.markup.html.link.Link;

import com.epam.training.webapp.page.AbstractPage;
import com.epam.training.webapp.page.user.register.UserRegisterPage1;
import com.epam.training.webapp.page.user.register.UserRegisterPage2;
import com.epam.training.webapp.page.user.register.UserEditPage;

public class UsersPage extends AbstractPage {
	@Override
	protected void onInitialize() {
		// TODO Auto-generated method stub
		super.onInitialize();

		add(new Link<Void>("register-link1") {
			@Override
			public void onClick() {
				setResponsePage(new UserRegisterPage1());

			}
		});

		add(new Link<Void>("register-link2") {
			@Override
			public void onClick() {
				setResponsePage(new UserRegisterPage2());

			}
		});

		add(new Link<Void>("register-link3") {
			@Override
			public void onClick() {
				setResponsePage(new UserEditPage());

			}
		});
	}
}
