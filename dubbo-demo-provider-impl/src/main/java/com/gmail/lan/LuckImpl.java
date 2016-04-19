package com.gmail.lan;

import org.springframework.stereotype.Service;


@Service("luck")
public class LuckImpl implements Luck{

	public void service(String str) {
		System.out.println(str + ":------dubbo demo provider impl luckimpl service()---------");
	}

}
