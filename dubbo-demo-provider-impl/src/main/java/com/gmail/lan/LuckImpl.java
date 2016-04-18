package com.gmail.lan;

import org.springframework.stereotype.Service;


@Service("luck")
public class LuckImpl implements Luck{

	public void service() {
		System.out.println("------dubbo demo provider impl luckimpl service()---------");
	}

}
