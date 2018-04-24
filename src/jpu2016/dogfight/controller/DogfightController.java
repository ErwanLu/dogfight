package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {

	private int TIME_SLEEP = 30;
	private IDogfightModel dogfightModel;

	public DogfightController(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}

	public void orderPerfrom(UserOrder userOrder) {

	}

	public void play() {

	}

	public void setViewSystem(IViewSystem viewSystem) {

	}

	private void lauchMissile(int player) {
		/*
		 * IMobile weapon = getMobileByPlayer(player); addMobile(weapon);
		 */

	}

	private void gameLoop() {

	}

}
