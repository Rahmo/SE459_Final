import robot.DirtController;
import robot.RobotController;
import sensors.SensorsController;


public class Main 
{
	final static int MAX_POWER = 50;
	final static int MAX_DIRT_CAPACITY = 50;
	final static int START_X = 0;
	final static int START_Y = 0;
	
	public static void main(String[] args) throws Exception 
	{
		String floorPlanLocation = "./resources/floorPlan";
		if(args.length == 1)
			floorPlanLocation = args[0];
		SensorsController sensors = new SensorsController(floorPlanLocation);
		DirtController dirtController = new DirtController(); 
		
		RobotController robot = new RobotController(sensors, dirtController, MAX_POWER, MAX_DIRT_CAPACITY, START_X, START_Y);
		robot.execute();
	}
}
