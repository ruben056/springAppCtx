package be.rd.services;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.rd.services.beans.IEcho;

public class AppCtxAnnotationMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext(
				"app-context-annotation.xml");
		appCtx.getBean("echoBean", IEcho.class).echo();;
	}
}
