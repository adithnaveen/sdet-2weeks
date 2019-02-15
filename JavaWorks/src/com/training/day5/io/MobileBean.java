package com.training.day5.io;

import java.io.Serializable;

public class MobileBean implements Comparable<MobileBean>, Serializable{
	private String mobileName; 
	private double cost; 
	private int size;
	
	public MobileBean(String mobileName, double cost, int size) {
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
	public int compareTo(MobileBean mobile) {
//		return (int) (this.getCost() - mobile.getCost());
//		return (int) (mobile.getCost() - this.getCost());
		return this.getMobileName().compareTo(mobile.getMobileName()); 
	} 
}

