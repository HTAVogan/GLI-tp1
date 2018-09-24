package model;

import java.awt.Component;

public interface Observer {
	public void update();
	public void attach(Observable o);
	public void detach(Observable o);
	public Observer getView();
	public void setSelected(boolean selected);
	public boolean isSelected();
	public int getSelectedPie();
	public void setSelectedPie(int pie);
	//public void deSelect();
	//public void nextPie();
	//public void previousPie();
}
