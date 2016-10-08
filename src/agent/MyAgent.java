package agent;

import agent.actuator.*;
import agent.sensor.*;

/**
 * @author krooly
 */

public class MyAgent {
	
	public static void main(String[] arg){
		
		MyActuator actuator = new MyActuator();
		MySensor sensor = new MySensor();
		
		actuator.doAction();
		sensor.doSensoring();
	}
	
}
