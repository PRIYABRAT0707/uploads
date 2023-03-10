package org.valarmorgulis.jdbcwithoutxml;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class MovieDao {
	private JdbcTemplate jtt;

	public JdbcTemplate getJtt() {
		return jtt;
	}

	public void setJtt(JdbcTemplate jtt) {
		this.jtt = jtt;
	}
	
	public int insert(MovieInfo mbb) {
		String q="insert into movieinfo values(?,?,?,?,?,?,?)";
		return this.jtt.update(q,mbb.getMoid(),mbb.getMoname(),mbb.getLeadActor(),mbb.getLeadActress(),mbb.getMainNegativeCharcter(),mbb.getYearOfRelease(),mbb.getLifetimeCollectionInCrore());
	}
	
	public MovieInfo getinfo(int id) {
		
		
		String q="select * from movieinfo where id=?";
		RowMapper<MovieInfo> rowMapper =(ResultSet rs, int rowNum)->{
			MovieInfo mi=new MovieInfo();
			mi.setMoid(rs.getInt(1));
			mi.setMoname(rs.getString(2));
			mi.setLeadActor(rs.getString(3));
			mi.setLeadActress(rs.getString(4));
			mi.setMainNegativeCharcter(rs.getString(5));
			mi.setYearOfRelease(rs.getString(6));
			mi.setLifetimeCollectionInCrore(rs.getInt(7));
			
			return mi;
		};
		 MovieInfo mii=this.jtt.queryForObject(q, rowMapper,id);
		
		return mii;
		
	}
	
	// this method return a list of movie
	
	public List<MovieInfo> getMoviedetails() {
		List<MovieInfo> ll=new ArrayList<MovieInfo>();
		
		RowMapper<MovieInfo> rowMapper =(ResultSet rs, int rowNum)->{
			
			MovieInfo mi=new MovieInfo();
			mi.setMoid(rs.getInt(1));
			mi.setMoname(rs.getString(2));
			mi.setLeadActor(rs.getString(3));
			mi.setLeadActress(rs.getString(4));
			mi.setMainNegativeCharcter(rs.getString(5));
			mi.setYearOfRelease(rs.getString(6));
			mi.setLifetimeCollectionInCrore(rs.getInt(7));
			return mi;};
		
		String q="select * from movieinfo";
		ll=this.jtt.query(q,rowMapper);
		
		
		
		
		return ll;
	}
	
	

}
