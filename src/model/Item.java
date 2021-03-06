package model;

public class Item {
	private String intitule;
	private String desc;
	private float value;
	
	public Item(String intitule, String desc, float value) {
		this.intitule = intitule;
		this.desc = desc;
		this.value = value;
	}
	
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
}
