package nl.tudelft.jpacman.board;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/***
 * This is the BoardTest method.
 *
 */
public class BoardTest {

    private Board board;
    /***
     * This is set up method beforeEach.
     *
     */
    @BeforeEach
    void setUp() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }
    /***
     * This is testGetWidth method.
     *
     */
    @Test
    void testGetWidth() {
        assertThat(board.getWidth()).isEqualTo(1);
    }
    /***
     * This is testGetHeight method.
     *
     */
    @Test
    void testGetHeight() {
        assertThat(board.getHeight()).isEqualTo(1);
    }
    /***
     * This is testBasicSquare method.
     *
     */
    @Test
    void testBasicSquare() {
        assertThat(board).isNotNull();
    }
    /***
     * This is testSquareAt method.
     *
     */
    @Test
    void testSquareAt() {
        Square square = board.squareAt(0, 0);
        assertThat(square).isInstanceOf(BasicSquare.class);
    }
    /***
     * This is testInvariant method.
     *
     */
    @Test
    void testInvariant() {
        assertThat(board.invariant()).isTrue();
    }
    /***
     * This is testSquareAtNull method.
     *
     */
    @Test
    void testSquareAtNull() {
        Square[][] grid = new Square[1][1];
        board = new Board(grid);
        Square square = board.squareAt(0,0 );
        assertThat(square).isNull();
    }
}
