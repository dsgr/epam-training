package com.epam.training.webapp.page.ajax;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

import com.epam.training.webapp.page.AbstractPage;

public class AjaxSamplePage extends AbstractPage {

	@Override
	protected void onInitialize() {
		super.onInitialize();

		final Model<Integer> model = new Model<Integer>(1);
		final Label label = new Label("label", model);
		label.setOutputMarkupId(true);
		add(label);

		add(new AjaxLink("incr-link") {

			@Override
			public void onClick(AjaxRequestTarget target) {
				Integer current = model.getObject();
				model.setObject(current + 1);
				/*
				 * label.add(AttributeModifier.replace("style", "font-size:" +
				 * model.getObject() + "px"));
				 */

				// /////////////////
				target.add(label);
			}
		});

		label.add(new AjaxEventBehavior("mouseover") {

			@Override
			protected void onEvent(AjaxRequestTarget target) {
				label.add(AttributeModifier
						.replace("style", "color:red; font-size:100px"));
				target.add(label);
			}
		});

		label.add(new AjaxEventBehavior("mouseout") {

			@Override
			protected void onEvent(AjaxRequestTarget target) {

				label.add(AttributeModifier.replace("style",
						"color:black; font-size:100px"));

				target.add(label);
			}
		});
	};
}
