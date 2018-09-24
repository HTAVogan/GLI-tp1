package controller;

import java.awt.Component;
import java.util.List;

import model.Item;
import model.Observable;
import model.Observer;

public class Controller implements Observer{

	private Observable model;
	private Observer view;
	private boolean selected = false;
	private int selectedPie;
	
	public Controller(Observable model, Observer view) {
		this.model = model;
		this.view = view;
		selected = false;
	}
	
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

	@Override
	public Observer getView() {
		// TODO Auto-generated method stub
		return view;
	}

	@Override
	public void setSelected(boolean selected) {
		// TODO Auto-generated method stub
		this.selected = selected;
	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return selected;
	}

	@Override
	public int getSelectedPie() {
		// TODO Auto-generated method stub
		return selectedPie;
	}

	@Override
	public void setSelectedPie(int pie) {
		// TODO Auto-generated method stub
		this.selectedPie = pie;
	}
/*
	@Override
	public void deSelect() {
		// TODO Auto-generated method stub
		this.selected = false;
	}

	@Override
	public void nextPie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void previousPie() {
		// TODO Auto-generated method stub
		
	}
*/
}
