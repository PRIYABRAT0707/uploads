package org.valarmorgulis.SPRINGORM;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class GrinderDao {
	
	
	private HibernateTemplate htm;
	
	@Transactional
	public int insertGrinderInfo(Grinder gg) {
		int stat=0;
		
		stat=(Integer) this.htm.save(gg);
		
		return stat;
	}

	public HibernateTemplate getHtm() {
		return htm;
	}

	public void setHtm(HibernateTemplate htm) {
		this.htm = htm;
	}
	
	public Grinder getGrinder(int id) {
		Grinder gd=this.htm.get(Grinder.class, 100);
		return gd;
	}
	

}
