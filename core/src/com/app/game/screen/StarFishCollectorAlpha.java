package com.app.game.screen;

import com.app.game.MainGame;
import com.app.game.actor.ActorBeta;
import com.app.game.actor.Turtle;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class StarFishCollectorAlpha extends BaseScreen{


    private Turtle turtle;
    private ActorBeta starfish;
    private ActorBeta ocean;
    private ActorBeta winMessage;


    private Stage mainStage;


    private boolean win;


    public StarFishCollectorAlpha(MainGame game) {
        super(game);

    }



    @Override
    public void show() {

        mainStage = new Stage();

        ocean = new ActorBeta();
        ocean.setTexture( new Texture(Gdx.files.internal("ocean.jpeg")));
        mainStage.addActor(ocean);


        starfish = new ActorBeta();
        starfish.setTexture(new Texture(Gdx.files.internal("starfish.png")));
        starfish.setPosition(380, 380);
        mainStage.addActor(starfish);



        /*turtle = new Turtle();
        turtle.setTexture(new Texture(Gdx.files.internal("turtle-1.png")));
        turtle.setPosition(20, 20);
        mainStage.addActor(turtle);*/



        winMessage = new ActorBeta();
        winMessage.setTexture(new Texture(Gdx.files.internal("you-win.jpg")));
        winMessage.setPosition(180, 180);
        winMessage.setVisible(false);
        mainStage.addActor(winMessage);

        win = false;

    }

    @Override
    public void render(float delta) {

        // check user input
        mainStage.act();


        // check win condition: turtle must be overlapping starfish

        /*if(turtle.overlaps(starfish)){
            starfish.remove();
            winMessage.setVisible(true);
        }*/

        // clear screen
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        // draw graphics
        mainStage.draw();

    }





/*
    //TODO cambiar a Stage para los actores
    private SpriteBatch batch;

    private Texture turtleTexture;

    private float turtleX;
    private float turtleY;

    private Rectangle turtleRectangle;


    private Texture starfishTexture;
    private float starfishX;
    private float starfishY;
    private Rectangle starfishRectangle;


    private Texture oceanTecture;
    private Texture winMessageTexture;
    private boolean win;




    public StarFishCollectorAlpha(MainGame game) {
        super(game);
    }





    @Override
    public void show() {

        batch = new SpriteBatch();

        turtleTexture = new Texture("turtle-1.png");
        turtleX = 20;
        turtleY = 20;
        turtleRectangle = new Rectangle(turtleX, turtleY, turtleTexture.getWidth(), turtleTexture.getHeight());


        starfishTexture = new Texture("starfish.png");
        starfishX = 380;
        starfishY = 380;
        starfishRectangle = new Rectangle(starfishX, starfishY, starfishTexture.getWidth(), starfishTexture.getHeight());



        oceanTecture = new Texture("ocean.jpeg");
        winMessageTexture = new Texture("you-win.jpg");


        win = false;

    }




    @Override
    public void render(float delta) {


        // check user input
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
            turtleX--;
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            turtleX++;
        if (Gdx.input.isKeyPressed(Input.Keys.UP))
            turtleY++;
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN))
            turtleY--;



        //update turtle rectangle location
        turtleRectangle.setPosition(turtleX, turtleY);

        //check win condition; turtle must be overlapping starfish
        if(turtleRectangle.overlaps(starfishRectangle))
            win = true;


        // clear screen
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);




        // draw graphics
        batch.begin();

        batch.draw(oceanTecture, 0, 0);

        if(!win)
            batch.draw(turtleTexture, turtleX, turtleY);

        batch.draw(starfishTexture, starfishX, starfishY);

        if(win)
            batch.draw(winMessageTexture, 180, 180);

        batch.end();

    }




    @Override
    public void dispose() {
        turtleTexture.dispose();
    }

*/
}
