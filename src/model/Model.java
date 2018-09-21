package model;

import java.util.ArrayList;
import java.util.List;

public class Model implements Observable {
	private String title;
	private List<Item> items;

	private List<Observer> observers;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		updateObservers();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
		updateObservers();
	}
	
	public void addItem(Item i) {
		this.items.add(i);
		updateObservers();
	}
	
	public Model(String title) {
		this.title = title;
		this.items = new ArrayList<Item>();
		this.observers = new ArrayList<Observer>();
	}
	
	public Model(String title, List<Item> items) {
		this.title = title;
		this.items = items;
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void updateObservers() {
		// TODO Auto-generated method stub
		for(Observer o : observers) {
			o.update();
		}
	}

	@Override
	public List<Item> getData() {
		// TODO Auto-generated method stub
		return items;
	}

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if(observers.contains(o)) {
			observers.remove(o);
		}else {
			System.err.println("No observer to remove !");
		}
	}
}
