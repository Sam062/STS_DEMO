package com.app;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Product {
	private static final Logger log=Logger.getLogger(Product.class);
	public static void main(String[] args) throws IOException {
		Layout lay=new PatternLayout();
		Appender ap=new FileAppender(lay,"F:\\abc.log");
		log.addAppender(ap);
		
		log.debug("hello");
		log.info("hello");
		log.warn("hello");
		log.error("hello");
		log.fatal("hello");
	}
	
	

}
