package com.app.game.actor;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Wirlpool extends BaseActor {


    public Wirlpool(float x, float y, Stage s) {
        super(x, y, s);
        loadAnimationFromSheet("whirlpool.png", 2, 5, 0.1f, false);
    }


    @Override
    public void act(float dt) {

        super.act(dt);

        if(isAnimationFinished())
            remove();
    }

}
