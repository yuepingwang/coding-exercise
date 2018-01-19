public interface ElevatorControlSystemBuilder{

	public void pickUp(Integer floor);

	public void destination(Integer elevatorId, Interger floor);
	
	public void step();
}