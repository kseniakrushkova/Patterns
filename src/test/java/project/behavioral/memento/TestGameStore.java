package project.behavioral.memento;

import org.junit.Assert;
import org.junit.Test;

public class TestGameStore {
    @Test
    public void testGame(){
        Game game = new Game();
        game.setVersion("version 1","level 11");
        Assert.assertEquals("Game{version='version 1', state='level 11'}",game.toString());

    }
    @Test
    public void testGame2(){
        Game game = new Game();
        GameStore gameStore = new GameStore();
        game.setVersion("version 1","level 11");
        gameStore.setSave(game.save());
        game.setVersion("version 1.1","level 12");
        Assert.assertEquals("Game{version='version 1.1', state='level 12'}",game.toString());
        game.savedGame(gameStore.getSave());
    }
    @Test
    public void testGame3(){
        Game game = new Game();
        GameStore gameStore = new GameStore();
        game.setVersion("version 1","level 11");
        gameStore.setSave(game.save());
        game.setVersion("version 1.1","level 12");
        game.savedGame(gameStore.getSave());
        Assert.assertEquals("Game{version='version 1', state='level 11'}",game.toString());
    }
}
