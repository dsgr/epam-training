package com.epam.training.webapp.component;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.authorization.Action;
import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeAction;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;

import com.epam.training.webapp.app.CustomSession;
import com.epam.training.webapp.page.ajax.AjaxSamplePage;
import com.epam.training.webapp.page.home.HomePage;
import com.epam.training.webapp.page.user.list.UsersPage;

public class MenuForAnonymUser extends Panel {

	public MenuForAnonymUser(String id) {
		super(id);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();
		boolean isUsersVisible = false;

		BookmarkablePageLink<Void> usersPageLink = new BookmarkablePageLink<Void>(
				"link-users", UsersPage.class);
		String userslabel = "Users!!!";
		usersPageLink.add(new Label("label", userslabel));

		usersPageLink.add(AttributeModifier.append("title", userslabel));

		// usersPageLink.setVisible(isUsersVisible);
		add(usersPageLink);

		BookmarkablePageLink<Void> bookmarkablePageLink = new HomePageLink("link-home",
				HomePage.class);
		add(bookmarkablePageLink);

		add(new BookmarkablePageLink<Void>("link-ajax", AjaxSamplePage.class));

		add(new Label("loggedUser", CustomSession.get().getCurrentuserid()));

	}

	@AuthorizeAction(roles = { "admin" }, action = Action.ENABLE)
	private class HomePageLink extends BookmarkablePageLink {

		public HomePageLink(String id, Class pageClass) {
			super(id, pageClass);
		}

	}

}
