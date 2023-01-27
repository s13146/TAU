package tau.game;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tau.game.exceptions.EndOfBoardException;
import tau.game.exceptions.ObstacleException;
import tau.game.model.GamePlaying;
import tau.game.model.Position;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GamePlayingTest {
    private GamePlaying gamePlaying;
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();


    @BeforeEach
    void setUp() {
        gamePlaying = new GamePlaying();
        gamePlaying.startGame(8);
    }
    @Test
    public void shouldGetWinningMessage() {
        //given
        System.setOut(new PrintStream(outStream));
        this.gamePlaying.getGameBoard().setPlayerPosition(gamePlaying.getGameBoard().getFinishPosition().getRow(),
                gamePlaying.getGameBoard().getFinishPosition().getColumn() - 1);
        //when
        gamePlaying.move('d');
        //then
        assertEquals("Wygrałeś! Gratulacje! *_*", outStream.toString().replaceAll("\n", "").replaceAll("\r", ""));
    }


    @Test
    public void shouldThrowEndOfBoarExceptionWhenMowingDownToBorder() {
        //given
        this.gamePlaying.getGameBoard().setPlayerPosition(7, 0);
        //when
        //then
        assertThrows(EndOfBoardException.class, () -> gamePlaying.move('s'));
    }

    @Test
    public void shouldThrowEndOfBoarExceptionWhenMowingLeftToBorder() {
        //given
        //when
        //then
        assertThrows(EndOfBoardException.class, () -> gamePlaying.move('a'));
    }

    @Test
    public void shouldThrowEndOfBoarExceptionWhenMowingRightToBorder() {
        //given
        this.gamePlaying.getGameBoard().setPlayerPosition(0, 7);
        //when

        //then
        assertThrows(EndOfBoardException.class, () -> gamePlaying.move('d'));
    }




}

