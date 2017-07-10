package com.ss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ss.beans.Amazon;

public class SSTest {
	public static void main(String[] args) {
		Amazon amazon = new Amazon();
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ss/common/application-context.xml"));
		amazon = factory.getBean("amazon",Amazon.class);
		amazon.tracking(103);
	}
}
