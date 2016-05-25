package jpu2016.gameframe;

import java.awt.event.KeyListener;
import java.util.Observable;
import javax.swing.JFrame;
import javafx.scene.input.KeyEvent;

public class GameFrame extends JFrame implements IEventPerformer, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3235172926427814880L;
	private IEventPerformer eventPerformer;

	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {

		this.eventPerformer = performer;

	}

	void keyPressed(KeyEvent keyEvent) {

	}

	void keyReleased(KeyEvent keyEvent) {

	}

	void keyTyped(KeyEvent keyEvent) {

	}

	@Override
	public void eventPerform(java.awt.event.KeyEvent keyCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
