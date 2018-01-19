public interface ElevatorBuilder{

	public void moveUp();

	public void moveDown();

	public void addNewFloor(Integer floor);

	public ElevatorDirection direction();

	public ElevatorStatus status();
	
}