package com.training.day3.interfaces;

public class Mobile implements Comparable<Mobile>{
	private String mobileName; 
	private double cost; 
	private int size;
	
	public Mobile(String mobileName, double cost, int size) {
		super();
		this.mobileName = mobileName;
		this.cost = cost;
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "Mobile [mobileName=" + mobileName + ", cost=" + cost + ", size=" + size + "]";
	}


	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int compareTo(Mobile mobile) {
//		return (int) (this.getCost() - mobile.getCost());
//		return (int) (mobile.getCost() - this.getCost());
		return this.getMobileName().compareTo(mobile.getMobileName()); 
	} 
}








