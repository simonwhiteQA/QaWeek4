package com.qa.community.enums;

public enum Directions {
	
	NORTH("Forward"),
    EAST("Right"),
    SOUTH("Backward"),
    WEST("Left");
    
    private final String motion;
    
    Directions(String motion) {
    	this.motion = motion;
    }
    
    public String getMotion() {
    	return motion;
    }
    
    public String directonMotion() {
    	return this + " is the same as " + getMotion();
    }
	
	

}
