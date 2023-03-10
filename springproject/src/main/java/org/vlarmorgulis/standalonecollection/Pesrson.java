package org.vlarmorgulis.standalonecollection;

import java.util.List;

public class Pesrson {

	private List<String> worker;

	public List<String> getWorker() {
		return worker;
	}

	public void setWorker(List<String> worker) {
		this.worker = worker;
	}

	@Override
	public String toString() {
		return "Pesrson [worker=" + worker + "]";
	}
	
}
