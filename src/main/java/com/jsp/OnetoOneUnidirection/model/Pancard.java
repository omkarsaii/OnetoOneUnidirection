package com.jsp.OnetoOneUnidirection.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pancard")
public class Pancard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panid;
	private String panName;
	
	public int getPanid() {
		return panid;
	}
	public void setPanid(int panid) {
		this.panid = panid;
	}
	public String getPanName() {
		return panName;
	}
	public void setPanName(String panName) {
		this.panName = panName;
	}
	
	
}
