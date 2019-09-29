package com.app.game.desktop;

import com.app.game.screen.StarfishCollector;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.app.game.MainGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
//		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
//		new LwjglApplication(new MainGame(), config);

		Game myGame = new StarfishCollector();
		LwjglApplication launcher =
				new LwjglApplication( myGame, "Starfish Collector", 800, 600 );
	}
}
