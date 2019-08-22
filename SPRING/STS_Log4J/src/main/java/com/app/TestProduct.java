package com.app;

import org.apache.log4j.Logger;

public class TestProduct {
	private static final Logger log=Logger.getLogger(TestProduct.class);
	public static void main(String[] args) {
		log.debug("hi");
		log.info("hi");
		log.warn("hi");
		log.error("hi");
		log.fatal("hi");
	}

}
