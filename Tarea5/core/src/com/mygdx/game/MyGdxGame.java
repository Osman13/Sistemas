package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture img2;
	Texture img3;
	Texture img4;
	Texture img5;
	int pos_x3;
	int pos_x4;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("background.png");
		img2 = new Texture("yoshi.jpg");
		img3 = new Texture("koopa.png");
		img4 = new Texture("cloud.png");
		img5 = new Texture("block.png");
		pos_x3 = 400;
		pos_x4 = 0;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 2, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(img2, 0, 60);
		batch.draw(img3, pos_x3, 70);
		batch.draw(img4, pos_x4, 350);
		batch.draw(img5, 300, 250);
		batch.end();
		pos_x3 +=2;
		while(pos_x3 >= 550)
			pos_x3 -= 300;
		pos_x4 +=5;
		if(pos_x4>=500)
			pos_x4=0;
	}
}
