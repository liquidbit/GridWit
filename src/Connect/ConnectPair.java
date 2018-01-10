package Connect;

import Vehicle.Vehicle;

/**
 * 
 * @author cjgra
 * The ConnectPair class will
 * connect two vehicles together to 
 * be later evaluated by the protocol
 */
public class ConnectPair {

	private Vehicle vehicle1;
	private Vehicle vehicle2;
	
	public ConnectPair(Vehicle one, Vehicle two) {
		this.vehicle1 = one;
		this.vehicle2 = two;
	}
}
