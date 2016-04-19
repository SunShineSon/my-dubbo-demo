package com.gmail.lan;

import org.springframework.beans.factory.annotation.Autowired;

public class LuckManager {
	
	@Autowired
	private Luck luck;
	
	public void service(String str){
		luck.service(str);
	}

}
