package main;

import java.awt.Color;
import java.awt.Graphics;

public class EventDrawable implements IDrawable {
	
	protected String event;

	public EventDrawable(String eventName) {
		this.event = eventName;
	}

	public void draw(Graphics g) {
		if(event.contains("customer_arrives")) {
			g.setColor(Color.red);
			g.fillOval(40, 190, 15, 15);
			g.drawString(event, 55, 200);
		}
		if(event.contains("table1_orders") || event.contains("table1_pays")) {
			g.setColor(Color.red);
			g.fillOval(100, 70, 15, 15);
			g.drawString(event, 115, 80);
		}
		if(event.contains("table2_orders") || event.contains("table2_pays") || event.contains("table2_arrives") || event.contains("table2_orders")) {
			g.setColor(Color.red);
			g.fillOval(275, 70, 15, 15);
			g.drawString(event, 300, 80);
		}
		if(event.contains("order_ready1") || event.contains("order_ready2") ) {
			g.setColor(Color.red);
			g.fillOval(450, 300, 15, 15);
			g.drawString(event, 465, 310);
		}
	}
}
