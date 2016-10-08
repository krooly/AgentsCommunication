package agent.actuator;

public class MyActuator {
	
	private String myAction = "My action";
	
	public MyActuator(/*MyAction action*/){
		//setAction(action)
	}
	
	public void setAction(String action/*MyAction action*/){
		myAction = action;
		//action.getName();
	}
	
	public void doAction(/*MyAction action*/){
		System.out.println("Agent@host: " + myAction + " in process...");
		//action.run()
		System.out.println("Agent@host: " + myAction + " is complete.");
	}
	
	public void fastAction(String action/*MyAction action*/){
		setAction(action);
		doAction();
	}
}
