package com.kodnest.bot;

public class Application {
	public static void main(String[] args)
	{
		TrainerBot t=new TrainerBot();
		t.read();
		t.write();
		t.teach();
		
		StudentBot s=new StudentBot();
		s.read();
		s.write();
		s.apply();
	}

}
