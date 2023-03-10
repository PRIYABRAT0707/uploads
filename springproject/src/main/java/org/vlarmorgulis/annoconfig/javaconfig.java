package org.vlarmorgulis.annoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = " org.vlarmorgulis.annoconfig")
public class javaconfig {
	@Bean(name = "ppanda")
	public MovieData getMovieData() {
		MovieData  md=new MovieData();
		return md;
	}

}
