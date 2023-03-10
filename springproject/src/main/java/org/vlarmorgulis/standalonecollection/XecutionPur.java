package org.vlarmorgulis.standalonecollection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XecutionPur {

	public static void main(String[] args) {
		
		ApplicationContext acc= new ClassPathXmlApplicationContext("org/vlarmorgulis/standalonecollection/stand.xml");
		
		Pesrson p1=(Pesrson) acc.getBean("po");
		System.out.println(p1);
		practicinghashmap joi=(practicinghashmap) acc.getBean("p2");
		System.out.println(joi);
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1=joi.getMymap();
		for(java.util.Map.Entry<Integer, String > node :m1.entrySet()) {
			System.out.println(node.getKey()+" "+node.getValue());
			
		}

	}

}
