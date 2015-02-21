package com.israelvicars.githubpractice;

public class WhatMan extends Main {
	static String aKindaMan = myWhatMan();
	static int numberOfSimulations = 3;
	
	public static void main (String[] args) {
		
		for (int i = 0; i < numberOfSimulations; i++) {
			System.out.println("What kinda man? A " + aKindaMan + " man.");
		}
	}
}
