package ostboysnrun.levels;

import ostboysnrun.dialogues.AbstractDialogue;
import ostboysnrun.dialogues.LevelDone;
import ostboysnrun.dialogues.Death;
import ostboysnrun.dialogues.Intro;
import ostboysnrun.entities.objects.blocks.animations.*;
import ostboysnrun.entities.objects.creatures.Creature;
import ostboysnrun.entities.objects.creatures.Goomba;
import ostboysnrun.entities.Position;
import ostboysnrun.Properties;

public class FirstLevel extends AbstractLevel {

    public FirstLevel() {
        setCreatures(new Creature[]{
                new Goomba(3, 12)
        });
    }

    private AbstractDialogue[] dialogues = new AbstractDialogue[]{
            new Death(),
            new LevelDone(),
            new Intro()
    };

    @Override
    public AbstractDialogue getDialogue(Properties.GameState gameState) {
    	if (gameState == Properties.GameState.DEAD) {
            return dialogues[0];
        } else if(gameState == Properties.GameState.FINISHED) {
        	return dialogues[1];
        } else if(gameState == Properties.GameState.READY) {
    	    return dialogues[2];
        }

        return null;
    }

    @Override
    public AbstractAnimation[] getAnimations() {
        return new AbstractAnimation[]{
                WaterAnimation.get(),
                CascadeAnimation.get(),
                BrickAnimation.get(),
                CoinAnimation.get()
        };
    }

    @Override
    public int getLevelId() {
        return 1;
    }

    @Override
    public int[][][] getMap() {
    	return new int[][][]{
    	        {{23},{23},{23},{23},{23},{23},{23},{23},{23},{23},{23},{31},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{15},{15},{15},{15},{15},{15},{15},{15},{15},{15},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}},
    	        {{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{11},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{16},{16},{16},{16},{16},{16},{16},{16},{16},{16},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}},
    	        {{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{16},{16},{16},{16},{16},{16},{16},{16},{16},{16},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{12},{0},{0},{0},{0}},
    	        {{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{17},{17},{17},{17},{17},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{16},{16},{16},{16},{16},{16},{16},{16},{16},{16},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{12},{0},{0},{0},{0}},
    	        {{0},{0},{11},{11},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{16},{16},{16},{16},{16},{16},{16},{16},{16},{16},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{11},{11},{11},{11},{11},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{12},{0},{0},{0},{0}},
    	        {{0},{0},{11},{11},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{11},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{12},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{21},{21},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{16},{16},{16},{16},{16},{16},{16},{16},{16},{16},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{12},{12},{12},{12},{12},{0},{0}},
    	        {{0},{0},{11},{11},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{17},{21},{17},{17},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{16},{16},{16},{16},{16},{16},{16},{16},{16},{16},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{29},{29},{29},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{11},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{12},{12},{12},{0},{0},{0}},
    	        {{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{11},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{29},{29},{29},{29},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{16},{16},{16},{16},{16},{16},{16},{16},{16},{16},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{17},{17},{17},{21},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{11},{12},{11},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{12},{0},{0},{0},{0}},
    	        {{0},{0},{8},{9},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{25},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{16},{16,11},{16,11},{16,11},{16,11},{16,11},{16,11},{16,11},{16,11},{16},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{11},{12},{11},{12},{11},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}},
    	        {{0},{0},{22},{31},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{11},{0},{0},{0},{0},{0},{29},{29},{29},{0},{0},{1},{3},{5},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{12},{0},{0},{0},{0},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{16},{16,11},{16,11},{16,11},{16,11},{16,11},{16,11},{16,11},{16,11},{16},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{29},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0}},
    	        {{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{8},{3},{3},{3},{3},{5},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{2},{4},{6},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{0},{0},{0},{16},{16,29},{16,29},{16,29},{16,29},{16,29},{16,29},{16,29},{16,29},{16},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{29},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}},
    	        {{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{8},{7},{4},{4},{4},{4},{6},{0},{0},{0},{0},{0},{29},{29},{0},{0},{0},{0},{0},{0},{0},{2},{4},{6},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{16},{16},{16},{16},{16},{16},{16},{16},{16},{16},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{17},{17},{21},{17},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{20},{0},{0},{0},{0},{0},{0},{29},{29},{29},{29},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}},
    	        {{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{8},{7},{4},{4},{4},{4},{4},{6},{0},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{2},{4},{6},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{16},{16},{16},{16},{16},{16},{16},{16},{16},{16},{0},{0},{0},{0},{8},{3},{3},{5},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{11},{11},{11},{11},{11},{0},{0},{0},{0},{29},{29},{29},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}},
    	        {{0},{26},{27},{27},{27},{27},{27},{28},{0},{0},{8},{7},{4},{4},{4},{4},{4},{4},{6},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{2},{4},{6},{0},{0},{0},{29},{29},{29},{0},{0},{0},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{29},{29},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{8},{3},{3},{3},{5},{0},{0},{0},{0},{0},{0},{16},{16},{16},{16},{16},{16},{16},{16},{16},{16},{0},{0},{0},{8},{7},{4},{4},{6},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{29},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}},
    	        {{3},{3},{3},{3},{3},{3},{3},{3},{3},{3},{7},{4},{4},{4},{4},{4},{4},{4},{6},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{2},{4},{6},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{11},{0},{0},{0},{8},{7},{4},{4},{4},{6},{0},{0},{0},{0},{0},{0},{16},{16},{16},{16},{16,11},{16},{16},{16},{16},{16},{0},{0},{8},{7},{4},{4},{4},{6},{0},{0},{0},{0},{29},{29},{29},{0},{0},{0},{0},{0},{20},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{29},{29},{29},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{10000},{10000},{10000},{29},{0},{0}},
    	        {{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{6},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{2},{4},{6},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{25},{0},{0},{26},{28},{0},{0},{0},{0},{0},{25},{0},{0},{0},{0},{0},{8},{7},{4},{4},{4},{4},{6},{0},{0},{0},{0},{0},{0},{16},{16,25},{16},{16,11},{16,11},{16,11},{16},{16},{16},{16},{0},{8},{7},{4},{4},{4},{4},{6},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{29},{29},{29},{29},{29},{29},{29},{29},{29},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{29},{29},{29},{29},{29},{29},{29},{0}},
    	        {{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{4},{18,6},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18,2},{4},{19,6},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19},{19,1},{3},{3},{3},{3},{3},{3},{3},{3},{3},{3},{3},{3},{3},{3},{3},{3},{3},{7},{4},{4},{4},{4},{4},{6},{0},{0},{0},{0},{1},{3},{3},{3},{3},{3},{3},{3},{3},{3},{3},{3},{3},{7},{4},{4},{4},{4},{4},{18,6},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18},{18}}
    	};
    }

    @Override
    public int getRows() {
        return Properties.WINDOW.HEIGHT / 16;
    }

    @Override
    public int getColumns() {
        return getMap()[0].length;
    }

    @Override
    public Position getStartPosition() {
        return new Position(100, 75);
    }

	@Override
	public String getAudioFile() {
		return "Audios/Marzahn.wav";
	}

	@Override
	public float getAudioDecibels() {
		return -30.0f;
	}

	@Override
	public AbstractLevel get() {
		return this;
	}
}
