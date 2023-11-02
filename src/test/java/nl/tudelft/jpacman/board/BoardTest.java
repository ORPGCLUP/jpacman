package nl.tudelft.jpacman.board;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {
    /***
     * This is the BoardTest method.
     *
     */
    private Board board;

    @BeforeEach
    void setUp() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }
    @Test
    void testGetWidth() {
        assertThat(board.getWidth()).isEqualTo(1);
    }
    @Test
    void testGetHeight() {
        assertThat(board.getHeight()).isEqualTo(1);
    }
    @Test
    void testBasicSquare() {
        assertThat(board).isNotNull();
    }
    @Test
    void testSquareAt() {
        Square square = board.squareAt(0, 0);
        assertThat(square).isInstanceOf(BasicSquare.class);
    }
    @Test
    void testInvariant() {
        assertThat(board.invariant()).isTrue();
    }
    @Test
    void testSquareAtNull() {
        Square[][] grid = new Square[1][1];
        board = new Board(grid);
        Square square = board.squareAt(0,0 );
        assertThat(square).isNull();
    }
}
