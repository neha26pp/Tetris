package Controllers;

import Models.StraightLine;
import Models.Tetronimo;
import Views.TetrisBoard;

/**
 * TetrisController.java:
 * Class to hold all the game logic for tetris
 *
 * @author Neha Pandit
 * @version 1.0 November 23, 2021
 */
public class TetrisController
{
    private final TetrisBoard TETRIS_BOARD;

    /**
     * Constructor to take in a tetris board so the controller and the board can communicate
     *
     * @param tetrisBoard A tetris board instance
     */
    public TetrisController( TetrisBoard tetrisBoard )
    {
        this.TETRIS_BOARD = tetrisBoard;
    }

    /**
     * Randomly chooses the next tetronimo and returns it (INCOMPLETE)
     *
     * @return The next tetronimo to be played
     */
    public Tetronimo getNextTetromino()
    {
        Tetronimo tetronimo;

        tetronimo = new StraightLine();
        tetronimo.setLocation( 40 + (5 * Tetronimo.SIZE), 0 );

        return tetronimo;
    }

    /**
     * Method to determine if the tetronimo has landed (INCOMPLETE)
     *
     * @param tetronimo The tetronimo to evaluate
     * @return True if the tetronimo has landed (on the bottom of the board or another tetronimo), false if it has not
     */
    public boolean tetronimoLanded( Tetronimo tetronimo )
    {
        int nextY = tetronimo.getYLocation() + tetronimo.getHeight() + Tetronimo.SIZE;
        return nextY <= 480;
    }
}
