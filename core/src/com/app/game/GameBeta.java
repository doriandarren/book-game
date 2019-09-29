package com.app.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;

public abstract class GameBeta extends Game {


    protected Stage mainStage;



    @Override
    public void create () {

        //setScreen(new StarFishCollectorAlpha(this));

        mainStage = new Stage();
        initialize();

    }

    // create method remains the same
    public abstract void initialize();





    @Override
    public void render() {

        float dt = Gdx.graphics.getDeltaTime();

        // act method
        mainStage.act(dt);

        // defined by user
        update(dt);


        //Clear the screen
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        //draw the graphics

        mainStage.draw();
    }

    // render method remains the same
    public abstract void update(float dt);


}
