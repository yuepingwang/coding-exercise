public interface ElevatorControlSystemBuilder{

	public void pickUp(int floor);

	public void dest(int elevatorId, int floor);//destination

	public void step();
}