package org.vlarmorgulis.standalonecollection;

import java.util.Map;

public class practicinghashmap {
	private Map<Integer,String> mymap;

	public Map<Integer, String> getMymap() {
		return mymap;
	}

	public void setMymap(Map<Integer, String> mymap) {
		this.mymap = mymap;
	}

	@Override
	public String toString() {
		return "practicinghashmap [mymap=" + mymap + "]";
	}

}
