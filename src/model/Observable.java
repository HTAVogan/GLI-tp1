package model;

import java.util.List;

public interface Observable {
	public void updateObservers();
	public List<Item> getData();
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public String getTitle();
	public String getUnit();
	public String getTitle(int i);
	public String getDescription(int i);
}
