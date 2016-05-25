package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

public class DogfightView implements Runnable, IViewSystem {

	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicsBuilder;
	private GameFrame gameFrame;

	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {

		this.eventPerformer = new EventPerformer(orderPerformer);
		this.graphicsBuilder = new GraphicsBuilder(dogfightModel);
		this.gameFrame = new GameFrame("Merci David", eventPerformer, graphicsBuilder, observable); // Remplacer_le_null_par_?

	}

	public void closeAll() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public String displayMessage(String message) {
		// TODO Auto-generated method stub
		return null;
	}

}
