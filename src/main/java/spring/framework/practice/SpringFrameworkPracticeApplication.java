package spring.framework.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.framework.practice.model.D1;
import spring.framework.practice.model.D2;
import spring.framework.practice.model.Sample;

@SpringBootApplication
public class SpringFrameworkPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkPracticeApplication.class, args);
		springFrameworkTest();
	}

	private static void springFrameworkTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml", "Dependencies.xml");
		Sample sample = (Sample) applicationContext.getBean("sampleObj");
		sample.test();

		Sample sample2 = (Sample) applicationContext.getBean("sampleObj3");
		sample2.testOnDepedencies();

		D1 d1 = (D1) applicationContext.getBean("d1");
		d1.testD1();

		D2 d2 = (D2) applicationContext.getBean("d2");
		d2.testD2();

		Sample sampleTestBean = applicationContext.getBean("sampleObj2", Sample.class);
		sampleTestBean.test();

		sampleTestBean = applicationContext.getBean("sampleObj4", Sample.class);
		sampleTestBean.testOnDepedencies();

		// sampleTestBean = applicationContext.getBean("sampleObj5", Sample.class);
		
	}
}