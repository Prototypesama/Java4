package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;

public class DogfightView implements Runnable {

	private EventPerformer myEventPerformer;
	private GraphicsBuilder myGraphicsBuilder;
	private GameFrame myGameFrame;

	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {

		this.myEventPerformer = new EventPerformer(orderPerformer);
		this.myGraphicsBuilder = new GraphicsBuilder(dogfightModel);
		this.myGameFrame = new GameFrame(null, myEventPerformer, myGraphicsBuilder, observable); // Remplacer_le_null_par_?

	}

	public void displaMessage(String message) {
	}

	public void closeAll() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
