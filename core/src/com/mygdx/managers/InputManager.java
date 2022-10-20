package com.mygdx.managers;

import com.mygdx.gameobjects.Door;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class InputManager {

	public static void handleInput(final OrthographicCamera camera) {
			if(Gdx.input.justTouched()) {
				GameManager.temp.set((float)Gdx.input.getX(), (float)Gdx.input.getY(), 0.0f);
				camera.unproject(GameManager.temp);
				final float touchX = GameManager.temp.x;
				final float touchY = GameManager.temp.y;
				
				for(int i = 0; i < GameManager.doors.size; i++){
					final Door door = (Door)GameManager.doors.get(i);
				}
			}
	}
	
}
