package com.in28min.spring.basic.springin5steps.xml;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

public class XmlJdbcConnection {
	public XmlJdbcConnection() {
		System.out.println("XML JDBC Connection");
	}
}