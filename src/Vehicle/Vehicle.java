package Vehicle;

import java.util.List;

import Grid.Direction;

public class Vehicle {

	private double speed;
	private List<Direction> directions;
	
	public Vehicle(double speed, List<Direction> directions) {
		this.speed = speed;
		this.directions = directions;
	}

	public void move() {
		
	}
}
