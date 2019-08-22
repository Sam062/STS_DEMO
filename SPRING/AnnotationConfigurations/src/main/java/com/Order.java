package com;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ordObj")
public class Order {
	@Value("101")
	private int id;
	@Value("#{lsobj}")
	private List<String> items;
	@Value("#{mobj}")
	private Map<String,Double> cost;
	@Override
	public String toString() {
		return "Order [id=" + id + ", items=" + items + ", cost=" + cost + "]";
	}
}
