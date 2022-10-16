package com.mygdx.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
//import com.mygdx.Monty;


public class Main{
	public static void main(String[] args) {
		Lwjgl3ApplicationConfiguration cfg = new Lwjgl3ApplicationConfiguration();
		
		cfg.setTitle("MontyHall");
		cfg.setWindowedMode(800, 600);
	}
}