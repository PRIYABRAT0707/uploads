package org.valarmorgulis.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImp implements RowMapper<MovieInfo>{

	public MovieInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		MovieInfo mi=new MovieInfo();
		mi.setMoid(rs.getInt(1));
		mi.setMoname(rs.getString(2));
		mi.setLeadActor(rs.getString(3));
		mi.setLeadActress(rs.getString(4));
		mi.setMainNegativeCharcter(rs.getString(5));
		mi.setYearOfRelease(rs.getString(6));
		mi.setLifetimeCollectionInCrore(rs.getInt(7));
		
		return mi;
	}

}
