package com.ping.admin.api.policymodel;

import java.util.ArrayList;

public class RootNode{
    public Object action;
    public ArrayList<Object> children;
	public Object getAction() {
		return action;
	}
	public void setAction(Object action) {
		this.action = action;
	}
	public ArrayList<Object> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<Object> children) {
		this.children = children;
	}
	public RootNode(Object action, ArrayList<Object> children) {
		super();
		this.action = action;
		this.children = children;
	}
	public RootNode() {
		super();
	}
    
    
}
