package kk;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kk.model.Word;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Word word = (Word) context.getBean("word");
		System.out.println(word.toString()); 
		context.close();

	}

}
