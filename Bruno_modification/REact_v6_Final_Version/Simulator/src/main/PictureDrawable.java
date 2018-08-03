

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

public class PictureDrawable implements IDrawable {
	
	protected String state;

	public PictureDrawable(String stateName) {
		this.state = stateName;
	}

	public void draw(Graphics g) {
		if(state.contains("location=hallway")) {
			g.setColor(Color.BLUE);
			g.fillOval(500, 175, 15, 15);
		}
		if(state.contains("location=table1")) {
			g.setColor(Color.BLUE);
			g.fillOval(100, 100, 15, 15);
		}
		if(state.contains("location=kitchen")) {
			g.setColor(Color.BLUE);
			g.fillOval(500, 275, 15, 15);
		}
		if(state.contains("location=office")) {
			g.setColor(Color.BLUE);
			g.fillOval(450, 100, 15, 15);
		}
		if(state.contains("location=table3")) {
			g.setColor(Color.BLUE);
			g.fillOval(150, 275, 15, 15);
		}
		if(state.contains("location=table2")) {
			g.setColor(Color.BLUE);
			g.fillOval(275, 100, 15, 15);
		}
		if(state.contains("location=table4")) {
			g.setColor(Color.BLUE);
			g.fillOval(300, 215, 15, 15);
		}
		if(state.contains("location=dining_room")) {
			g.setColor(Color.BLUE);
			g.fillOval(200, 195, 15, 15);
		}
	}
}
