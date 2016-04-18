package com.gmail.lan;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {
	private static final Log log = LogFactory.getLog(Demo.class);

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
			context.start();
		} catch (Exception e) {
			log.error("== DubboProvider context start error:",e);
		}
		synchronized (Demo.class) {
			while (true) {
				try {
					Demo.class.wait();
				} catch (InterruptedException e) {
					log.error("== synchronized error:",e);
				}
			}
		}
	}

}
