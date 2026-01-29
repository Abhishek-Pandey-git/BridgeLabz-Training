package com.lambdaexpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

//class that contains triggers checking 
class Context{
	boolean motionDetected;
	int time; //0-23
	String voiceCommand;
	
	public Context(boolean motionDetected,int time,String voiceCommand) {
		this.motionDetected=motionDetected;
		this.time=time;
		this.voiceCommand=voiceCommand;
	}
}

//class to contain predicate and consumer logic
class LightRule{
	Predicate<Context> trigger;
	Consumer<Context> action;
	
	public  LightRule(Predicate<Context> trigger,Consumer<Context> action) {
		this.trigger=trigger;
		this.action=action;
	}
	
	
}

//class to implement the light rule and context
public class HomeLighting {
	
	public static void main(String[] args) {
		//simulating the system
		HashMap<String,LightRule> conditions=new HashMap<>();
		
		//adding rules
		conditions.put("motion",new LightRule(ctx->ctx.motionDetected,ctx->System.out.println("Hallway lights on")));
		conditions.put("time", new LightRule(ctx->ctx.time>=18,ctx->System.out.println("Lights on for evening")));
		conditions.put("voiceCommand",new LightRule(ctx->"movie time".equalsIgnoreCase(ctx.voiceCommand),ctx->System.out.println("Light dimming for movie time")));
		
		//making the contect
		Context ctxt=new Context(true,19,"movie time");
		
		//check for motion detection
		if(conditions.get("motion").trigger.test(ctxt)) {
			conditions.get("motion").action.accept(ctxt);
		}
	}
	
	
}
