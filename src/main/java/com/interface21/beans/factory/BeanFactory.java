package com.interface21.beans.factory;

public interface BeanFactory {

	Object getBean(String name) throws BeansException;
	
}
