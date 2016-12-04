package com.epam.training.webapp.page;

import org.apache.wicket.markup.html.WebPage;

import com.epam.training.webapp.component.MenuForAnonymUser;
import com.epam.training.webapp.component.MenuForLoggedUserPanel;
import com.epam.training.webapp.page.home.HomePage;

public class AbstractPage extends WebPage {

	@Override
	protected void onInitialize() {

		super.onInitialize();
		/*
		 * WebMarkupContainer bodyContainer = new
		 * WebMarkupContainer("body-container"); add(bodyContainer);
		 * 
		 * bodyContainer.add(AttributeModifier.append("style",
		 * "background-color:green")); bodyContainer.add(new
		 * AjaxEventBehavior("click") {
		 * 
		 * @Override protected void onEvent(AjaxRequestTarget target) {
		 * setResponsePage(new UsersPage()); } });
		 */
		if (getPageClass().equals(HomePage.class)) {
			add(new MenuForAnonymUser("menu-panel"));
		} else {
			add(new MenuForLoggedUserPanel("menu-panel"));
		}

	}

}
