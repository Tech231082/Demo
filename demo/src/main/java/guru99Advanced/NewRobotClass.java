package guru99Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.omg.SendingContext.RunTime;

public class NewRobotClass {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		String command="Notepad.exe";
		Runtime run=Runtime.getRuntime();
		((Runtime) run).exec(command);
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		

	}

}
