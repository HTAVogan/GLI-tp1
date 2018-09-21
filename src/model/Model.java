package model;

import java.util.ArrayList;
import java.util.List;

public class Model {
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
