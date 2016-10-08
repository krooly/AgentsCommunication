package agent.actuator;

/**
 * @author krooly
 */
public class MyActuator {
	
	private String myAction = "My action";
	//private String agentName;
	
	public MyActuator(/*String agentName, MyAction action*/){
		//this.agentName = agentName;
		//setAction(action);
	}
	
	public void setAction(String action/*MyAction action*/){
		myAction = action;
		//action.getName();
	}
	
	public void doAction(/*MyAction action*/){
		System.out.println("Agent@host: "	//agentName
							+ myAction		//action.getName()
							+ " in process...");
		//action.run();
		System.out.println("Agent@host: "	//agentName
							+ myAction		//action.getName() 
							+ " is complete.");
	}
	
	public void fastAction(String action/*MyAction action*/){
		setAction(action);
		doAction();
	}
}
