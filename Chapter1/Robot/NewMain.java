public class NewMain {
    public static void main(String[] args) {
	NewRobot robot = new NewRobot("Andrew");
	robot.order(NewRobot.COMMAND_WALK);
	robot.order(NewRobot.COMMAND_JUMP);
	robot.order(NewRobot.COMMAND_STOP);
    }
}
