package org.valarmorgulis.consinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NoteBookXecution {

	public static void main(String[] args) {
		
		ApplicationContext aa=new ClassPathXmlApplicationContext("org/valarmorgulis/consinjection/constructor.xml");
        NoteBook nb=(NoteBook) aa.getBean("note");
        System.out.println(nb);
	}

}
