package model;

import java.util.ArrayList;
import java.util.List;

public class Model implements Observable {
	private String title;
	private List<Item> items;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	private Observer view, controller;
	
	public Model(String title) {
		this.title = title;
		this.items = new ArrayList<Item>();
	}
	
	public Model(String title, List<Item> items) {
		this.title = title;
		this.items = items;
	}

	@Override
	public void updateObservers() {
		// TODO Auto-generated method stub
		view.update();
	}

	@Override
	public List<Item> getData() {
		// TODO Auto-generated method stub
		return items;
	}
}
