package com.app.game.screen;

import com.app.game.MainGame;
import com.badlogic.gdx.Screen;

public abstract class BaseScreen implements Screen {


    protected MainGame game;


    /**
     * Construct
     */
    public BaseScreen(MainGame game) {
        this.game = game;
    }




    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
