import java.util.LinkedList;
import java.util.Queue;

public class Elevator implements ElevatorBuilder {

	private Integer curFloor;
	private Queue<Integer> destFloors;

	public Elevator(Interger curFloor){
		this.curFloor = curFloor;
		this.destFloors = new LinkedList<Integer>();
	}
	
}