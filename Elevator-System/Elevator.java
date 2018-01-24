import java.util.LinkedList;
import java.util.Queue;

public class Elevator implements ElevatorBuilder {

	private int curFloor;
	private Queue<Integer> destFloors;

	public Elevator(int curFloor){
		this.curFloor = curFloor;
		this.destFloors = new LinkedList<Integer>();
	}

	public 
}