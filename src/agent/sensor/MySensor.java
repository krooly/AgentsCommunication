package agent.sensor;

/**
 * @author krooly
 */

public class MySensor {

	private MySensoring sensoring;
	private String agentName;
	
	public MySensor(String agentName, MySensoring sensoring){
		this.agentName = agentName;
		setSensoring(sensoring);
	}
	
	public void setSensoring(MySensoring sensoring){
		this.sensoring = sensoring;
	}
	
	public void doSensoring(){
		System.out.println(agentName + " "
							+ sensoring.getName()
							+ " in process...");
		if (!sensoring.run()) {
			System.out.println(	"WARNING *** "
								+ agentName + ": "
								+ sensoring.getName() + " :: "
								+ "runingExeption!");
		} else {
		System.out.println(agentName + " "
							+ sensoring.getName()
							+ " is complete.");
		}
	}
}
