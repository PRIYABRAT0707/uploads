package org.valarmorgulis.SPRINGORM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ORMXecution {

	public static void main(String[] args) {
	
		ApplicationContext ff=new ClassPathXmlApplicationContext("org/valarmorgulis/SPRINGORM/SPRINGORM.xml");
		GrinderDao gd=ff.getBean("gdao",GrinderDao.class);
		
		
		/*
		 * Grinder hh=new Grinder(101,"prestige",1500,4000,4,"white",750);
		 * 
		 * int k=gd.insertGrinderInfo(hh);
		 * System.out.println("you have update a list "+k+" time");
		 */
		  Grinder hk=gd.getGrinder(100);
		  System.out.println(hk);
		/*
		 * List<Grinder> hh=new ArrayList<Grinder>(); hh.addAll(Arrays.asList( new
		 * Grinder(100,"prestige",1500,4000,4,"white",750), new
		 * Grinder(200,"butterfly",2000,5000,5,"whiteblack",1000), new
		 * Grinder(300,"bosch",4000,4500,6,"grey",800), new
		 * Grinder(400,"havells",6600,5000,3,"pink",750), new
		 * Grinder(500,"imax",7800,40000,8,"red",1200), new
		 * Grinder(600,"amazon basics",8900,8000,10,"green",550), new
		 * Grinder(700,"flipkart smart buy",9000,78000,3,"lavender",500), new
		 * Grinder(800,"marq",78600,7000,4,"yellow",750), new
		 * Grinder(900,"bajaj",8700,9000,4,"violet",750), new
		 * Grinder(1000,"usha",4500,8000,4,"maroon",750)
		 * 
		 * ));
		 * 
		 * int k=gd.insertGrinderInfo(hh);
		 * System.out.println("you have update a list "+k+" time");
		 */
		
		
		
		
		
	}

}
