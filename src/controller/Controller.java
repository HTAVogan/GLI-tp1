package controller;

import java.util.List;

import model.Item;
import model.Observable;
import model.Observer;

public class Controller implements Observer{

	private Observable model;
	private Observer view;
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		if(model != null) {
			List<Item> get_items = model.getData();
			//Do something with Data !
		}
	}

	@Override
	public void attach(Observable o) {
		// TODO Auto-generated method stub
		model = o;
	}

	@Override
	public void detach(Observable o) {
		// TODO Auto-generated method stub
		model = null;
	}

}
