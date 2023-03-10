package org.vlarmorgulis.streotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("noob")
@Scope(scopeName = "prototype")
public class SpringExpressionLanguage {
	@Value("jack")
	private String name;
	@Value("#{loop}")
	private List<Double> klist;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Double> getKlist() {
		return klist;
	}
	public void setKlist(List<Double> klist) {
		this.klist = klist;
	}
	@Override
	public String toString() {
		return "SpringExpressionLanguage [name=" + name + ", klist=" + klist + "]";
	}
	

	
}
