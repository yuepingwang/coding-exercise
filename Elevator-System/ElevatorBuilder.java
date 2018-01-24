public interface ElevatorBuilder{

	public void moveUp();

	public void moveDown();

	public void addNewFloor(int floor);

	public ElevatorDirection direction();

	public ElevatorStatus status();

}