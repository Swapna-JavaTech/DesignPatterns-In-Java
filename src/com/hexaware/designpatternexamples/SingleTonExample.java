package com.hexaware.designpatternexamples;

//import java.util.Scanner;

//Sington pattern can be used in accessing File System,Data Base connections etc.,
public class SingleTonExample {
	private static final SingleTonExample instance = new SingleTonExample();
	
	private SingleTonExample() {
		
	}
	
	public static SingleTonExample getInstance() {
		return instance;
	}

}
