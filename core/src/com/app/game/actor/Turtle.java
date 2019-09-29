package com.app.game.actor;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Turtle extends BaseActor {


    public Turtle(float x, float y, Stage s) {
        super(x, y, s);

        String[] filenames =
                {"turtle-1.png", "turtle-2.png", "turtle-3.png",
                        "turtle-4.png", "turtle-5.png", "turtle-6.png"};

        loadAnimationFronFiles(filenames, 0.1f, true);
    }

}




    /*public class Turtle extends ActorBeta {

    public Turtle() {
        super();
    }

    @Override
    public void act(float delta) {
        super.act(delta);

        // check user input
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
            this.moveBy(-1, 0);
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            this.moveBy(1, 0);
        if (Gdx.input.isKeyPressed(Input.Keys.UP))
            this.moveBy(0, 1);
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN))
            this.moveBy(0, -1);
    }

}*/
