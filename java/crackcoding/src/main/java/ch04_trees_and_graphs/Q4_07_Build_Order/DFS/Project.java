package ch04_trees_and_graphs.Q4_07_Build_Order.DFS;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
	public enum State {COMPLETE, PARTIAL, BLANK};
	private ArrayList<Project> children = new ArrayList<Project>();
	private HashMap<String, Project> map = new HashMap<String, Project>();
	private String name;
	private State state = State.BLANK;
	
	public Project(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
	
	public void addNeighbor(Project node) {
		if (!map.containsKey(node.getName())) {
			children.add(node);
		}
	}
	
	public State getState() { 
		return state;
	}
	
	public void setState(State st) {
		state = st;
	}
	
	public ArrayList<Project> getChildren() {
		return children;
	}
}