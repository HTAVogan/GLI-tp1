package model;

import java.util.ArrayList;
import java.util.List;

public class Model {
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

	private String title;
	private List<Item> items;
	
	public Model(String title) {
		this.title = title;
		this.items = new ArrayList<Item>();
	}
	
	public Model(String title, List<Item> items) {
		this.title = title;
		this.items = items;
	}
}
