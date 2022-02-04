package com;

import java.io.File;

public interface DefaultDemo {
	
	public void m1();
	public void m2();
	
	default void m3() {
		
//		File f = new File("abc.txt");
//		try {
//		f.createNewFile();
//		System.out.println("file is created");
//		}catch(Exception e) {}
		
		m4();
		
	}
	private void m4() {
		File f = new File("xyz.txt");
		
		try {
			f.createNewFile();
			System.out.println("file is created");
			}catch(Exception e) {}
			
	}
	
}
