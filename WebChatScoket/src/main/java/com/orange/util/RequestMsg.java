package com.orange.util;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RequestMsg implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty(value = "ROUTE")  
	public Route route;
	@JsonProperty(value = "ROOT")  
	public Object root;
	
	public RequestMsg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestMsg(Route route, Object root) {
		this.route = route;
		this.root = root;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Object getRoot() {
		return root;
	}

	public void setRoot(Object root) {
		this.root = root;
	}
	
}
