package agent.actuator;

/**
 * @author krooly
 */
public class MyActuator {
	
	private String agentName;
	private MyAction action;
	
	public MyActuator(String agentName, MyAction action){
		this.agentName = agentName;
		setAction(action);
	}
	
	public void setAction(MyAction action){
		this.action = action;
	}
	
	public void doAction(){
		System.out.println(agentName + " "
							+ action.getName()
							+ " in process...");
		if (!action.run()) {
			System.out.println("WARNING *** "
								+ agentName + ": "
								+ action.getName() + " :: "
								+ "runingExeption!");
		} else {
		System.out.println(agentName + " "
							+ action.getName() 
							+ " is complete.");
		}
	}
	
	public void fastAction(MyAction action){
		setAction(action);
		doAction();
	}
}
