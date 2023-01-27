package tau.game;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import tau.game.model.GameBoard;

import java.util.List;

public class GameBoardTest {

    private GameBoard gameBoard;

    @BeforeEach
    void setUp() {
        gameBoard = new GameBoard(8);
        gameBoard.createBoard();
    }

    @Test
    public void shouldCreateGameBoard() {
        //given
        //when
        //then
        assertEquals("-", gameBoard.getFieldCords(4,6));
    }
    @Test
    public void shouldSetPlayerPosition() {
        //given
        //when
        gameBoard.generateGameBoardObjects();
        //then
        assertEquals("I", gameBoard.getFieldCords(gameBoard.getPlayerPosition().getRow(), gameBoard.getPlayerPosition().getColumn()));
    }


    @Test
    public void shouldCreateObjects() {
        //given
        //when
        gameBoard.generateGameBoardObjects();
        //then
        assertTrue(List.of("X", "F", "I", "-").contains(gameBoard.getFieldCords(4,6)));
    }

    @Test
    public void shouldSetFinishPosition() {
        //given
        //when
        gameBoard.generateGameBoardObjects();
        //then
        assertEquals("F", gameBoard.getFieldCords(gameBoard.getFinishPosition().getRow(),gameBoard.getFinishPosition().getColumn()));
    }


}
