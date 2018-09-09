package com.sony.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cricketer {

	@Value("Russle")
	private String batsman;
	@Value("78")
	private int run;
	@Autowired
	private Bat bat;

	public String getBatsman() {
		return batsman;
	}

	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public Bat getBat() {
		return bat;
	}

	public void setBat(Bat bat) {
		this.bat = bat;
	}

	@Override
	public String toString() {
		return "Cricketer [batsman=" + batsman + ", run=" + run + ", bat=" + bat + "]";
	}
	

}
