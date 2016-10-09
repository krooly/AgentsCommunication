package agent;

import agent.actuator.*;
import agent.sensor.*;

/**
 * @author krooly
 */

public class MyAgent {
		
	public static void main(String[] arg){
		String agentName = "agent@host";
		
		MyAction get = new MyAction("get");
		MySensoring load = new MySensoring("Sensoring load");
		
		MyActuator actuator = new MyActuator(agentName, get);
		MySensor sensor = new MySensor(agentName, load);
		
		actuator.doAction();
		sensor.doSensoring();	
	}
}
