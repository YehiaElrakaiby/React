package main;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;
import java.awt.Graphics;

public class JCanvas extends JPanel {

	private List drawables = new LinkedList();
	private List drawablesEvent = new LinkedList();
	
	//Draw the forms
	public void paint(Graphics g) {
		super.paint(g);
		for (Iterator iter = drawables.iterator(); iter.hasNext();) {
			IDrawable d = (IDrawable) iter.next();
			d.draw(g);	
		}
		for (Iterator iter = drawablesEvent.iterator(); iter.hasNext();) {
			IDrawable d = (IDrawable) iter.next();
			d.draw(g);	
		}
	}

	//When called this function add the form to be draw and call paint() for each form
	public void addDrawable(IDrawable d) {
		drawables.add(d);
		repaint();
	}	
	
	public void addPictureDrawable(IDrawable d) {
		if(drawables.size()>0) {
			drawables.remove(0);
		}
		drawables.add(d);
		repaint();
	}
	
	public void addEventDrawable(IDrawable d) {
		if(drawablesEvent.size()>0) {
			drawablesEvent.remove(0);
		}
		drawablesEvent.add(d);
		repaint();
	}

	public void removeEventDrawable() {
		if(drawablesEvent.size()>0) {
			drawablesEvent.remove(0);
		}
	}
}