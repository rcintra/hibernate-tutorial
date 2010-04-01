package org.hibernate.tutorials.domain;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5040546687711741269L;
	private Long id;
	private String title;
	private Date date;
	
	public Event(){}
	
	public Long getId(){
		return id;
	}
	
	private void setId(Long id){
		this.id = id;
	}
	
	public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}