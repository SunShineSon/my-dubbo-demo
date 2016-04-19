package com.gmail.lan;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerDemo {
	private static final Log log = LogFactory.getLog(ConsumerDemo.class);

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
			context.start();
			Luck luck = (Luck) context.getBean("luck");
			luck.service("comsumer str");
		} catch (Exception e) {
			log.error("== DubboProvider context start error:", e);
		}
		synchronized (ConsumerDemo.class) {
			while (true) {
				try {
					ConsumerDemo.class.wait();
				} catch (InterruptedException e) {
					log.error("== synchronized error:", e);
				}
			}
		}
	}

}
