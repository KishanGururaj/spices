package com.wolken.wolkenapp.dto;

public class SpicesDTO {
	private int spiceId;
	public int getSpiceId() {
		return spiceId;
	}
	public void setSpiceId(int spiceId) {
		this.spiceId = spiceId;
	}
	private String spiceName;
	private String spiceOrigin;
	
	public SpicesDTO() {
		System.out.println(this.getClass().getSimpleName()+" Object is Created");
	}
	public void setSpiceName(String spiceName) {
		this.spiceName=spiceName;
	}
	public void setSpiceOrigin(String spiceOrigin) {
		this.spiceOrigin=spiceOrigin;
	}
	public String getSpiceName() {
		return spiceName;
	}
	public String getSpiceOrigin() {
		return spiceOrigin;
	}
	@Override 
	public String toString() {
		return "SpicesDTO -SpicesName:"+this.spiceName+" SpicesOrigin: "+this.spiceOrigin;
	}
	@Override 
	public int hashCode() {
		return this.spiceId;
	}
	public boolean equals(Object obj) {
		SpicesDTO spicesDTO = (SpicesDTO)obj;
		if(obj==null) {
			return false;
		}
		else {
			if (obj !=null) {
				if(obj instanceof SpicesDTO) {
					if(this.hashCode()==spicesDTO.hashCode()) {
						return true;
						
					}
				}
			}
			return false;
		}
	}
}

