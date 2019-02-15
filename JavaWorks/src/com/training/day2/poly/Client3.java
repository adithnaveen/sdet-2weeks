package com.training.day2.poly;

public class Client3 {
	
	public static void display(Vehicle [] vhs) {
		for(Vehicle temp : vhs) {
			
			System.out.println("-----------------------------------------");
			temp.move(); 
			temp.stop(); 
			
			
			if(temp instanceof Toyota) {
				((Toyota) temp).noOfDoors();
				((Toyota) temp).fuelCapacity(); 
			}else if(temp instanceof ManTruck) {
				((ManTruck) temp).printCapacity();
			}
			
			
			
		}
	}
	
	
	public static void main(String[] args) {


		Vehicle[] vhs = new Vehicle[5];
		
		vhs[0] = new Toyota(100, 4);
		vhs[1] = new Toyota(120, 2);
		vhs[2] = new ManTruck(4000);
		vhs[3] = new Toyota(60, 4);
		vhs[4] = new ManTruck(8000);

		display(vhs);
	}
}
