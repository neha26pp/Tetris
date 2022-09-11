import Views.TetrisBoard;

import wheelsunh.users.Frame;

/**
 * Tetris.java:
 * Main class for tetris, the program starts from here
 *
 * @author Neha Pandit
 * @version 1.0 November 23, 2021
 */
public class Tetris
{
    /**
     * Function main begins with program execution
     *
     * @param args The command line args (not used in this program)
     */
    public static void main( String[] args )
    {
        //create a new frame
        Frame f = new Frame();

        //create a board
        new TetrisBoard( f );
    }
}
