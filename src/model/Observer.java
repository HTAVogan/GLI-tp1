package model;

public interface Observer {
	public void update();
	public void attach(Observable o);
	public void detach(Observable o);
}
