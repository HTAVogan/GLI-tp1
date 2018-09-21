package model;

public interface IAdapter {
	public void NotifyAll();
	
	public void Attach(Observer o);
	public void Detach(Observer o);
}
