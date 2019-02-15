package com.training.day2.poly;

public class Client2 {
	public static void main(String[] args) {

		Vehicle[] vhs = new Vehicle[5];
		vhs[0] = new Toyota(100, 4);
		vhs[1] = new Toyota(120, 2);
		vhs[2] = new ManTruck(4000);
		vhs[3] = new Toyota(60, 4);
		vhs[4] = new ManTruck(8000);

		for (int i = 0; i < vhs.length; i++) {
			System.out.println("------------------------------------------------------");
			vhs[i].move();
			vhs[i].stop();

			if (vhs[i] instanceof Toyota) {
				((Toyota) vhs[i]).noOfDoors();
				((Toyota) vhs[i]).fuelCapacity();
			} else if (vhs[i] instanceof ManTruck) {
				((ManTruck) vhs[i]).printCapacity();
			}
		}
	}
}
