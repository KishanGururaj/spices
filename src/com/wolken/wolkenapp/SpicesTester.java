package com.wolken.wolkenapp;

import com.wolken.wolkenapp.dto.SpicesDTO;

public class SpicesTester {
	public static void main(String[] args) {
		SpicesDTO spicesDTO =new SpicesDTO();
		spicesDTO.setSpiceId(123);
		spicesDTO.setSpiceName("pepper");
		spicesDTO.setSpiceOrigin("kerala");
		System.out.println(spicesDTO);
		SpicesDTO spicesDTO1 =new SpicesDTO();
		spicesDTO1.setSpiceId(123);
		spicesDTO1.setSpiceName("ginger");
		spicesDTO1.setSpiceOrigin("karnataka");
		System.out.println(spicesDTO1);
		System.out.println(spicesDTO.hashCode());
		System.out.println(spicesDTO1.hashCode());
		System.out.println(spicesDTO.equals(spicesDTO1));
	}
	

}
