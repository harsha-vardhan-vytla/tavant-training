package com.org.SpringAnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public interface Employee {

	void doWork();
	void getSalary();
}
