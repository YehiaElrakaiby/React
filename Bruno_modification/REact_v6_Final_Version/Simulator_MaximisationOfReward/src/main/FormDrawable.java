package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.HashMap;

import org.emftext.language.AdaptiveCyberDefense.ActionDescription;

public class FormDrawable implements IDrawable {
	
	protected Rectangle rect ;
	protected Shape circle;
	protected Color color;
	protected String state;
	protected String actionName;
	protected String exoEventName;
	protected boolean isExoEvent;

	public FormDrawable(Color color, Point pos, Dimension dim, String stateName, String action, Boolean isExoEvent, String exoEventName) {
		this.color=color;
		this.actionName = action;
		this.state = stateName.toString();
		this.rect = new Rectangle(pos,dim);
		this.exoEventName = exoEventName;
		this.isExoEvent = isExoEvent;
	}

	public void draw(Graphics g) {
		boolean exoEvent = false;
		//Draw the action name
		if(isExoEvent == true) {
			g.drawString(actionName, 170, rect.y - 65);
			g.setColor(Color.RED);
			g.fillOval(150, (rect.y-50), 20, 20);
			g.drawString(exoEventName, rect.x + 5, rect.y - 30);
			g.drawLine(160, (rect.y-50), 160, rect.y);
		}
		else {
			g.drawString(actionName, 170, rect.y - 15);
		}
		g.setColor(Color.BLACK);
		g.drawRect(rect.x,rect.y,rect.width,rect.height);
		g.drawString(state, rect.x + 5, rect.y + 15);
		g.drawLine(160, rect.y +20, 160, rect.y +50);
	}

}
