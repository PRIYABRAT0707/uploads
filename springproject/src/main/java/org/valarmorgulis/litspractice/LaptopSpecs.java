package org.valarmorgulis.litspractice;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class LaptopSpecs {
	
	@Id
	
	private int lid;
	@ElementCollection(fetch = FetchType.LAZY)
	
	private List<String> connectedhardwares;
	@ElementCollection

	private Set<String> kerneldetails;
	@ElementCollection

	private Map<Integer,String> inbuiltapps;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public List<String> getConnectedhardwares() {
		return connectedhardwares;
	}
	public void setConnectedhardwares(List<String> connectedhardwares) {
		this.connectedhardwares = connectedhardwares;
	}
	public Set<String> getKerneldetails() {
		return kerneldetails;
	}
	public void setKerneldetails(Set<String> kerneldetails) {
		this.kerneldetails = kerneldetails;
	}
	public Map<Integer, String> getInbuiltapps() {
		return inbuiltapps;
	}
	public void setInbuiltapps(Map<Integer, String> inbuiltapps) {
		this.inbuiltapps = inbuiltapps;
	}
	@Override
	public String toString() {
		return "LaptopSpecs [lid=" + lid + ", connectedhardwares=" + connectedhardwares + ", kerneldetails="
				+ kerneldetails + ", inbuiltapps=" + inbuiltapps + "]";
	}
	
	

}
