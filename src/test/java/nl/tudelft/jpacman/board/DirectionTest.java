package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 *
 * @author Arie van Deursen
 */
/***
 * This is DirectionTest method.
 *
 */
public class DirectionTest {
    /**
     * Do we get the correct delta when moving north?
     */
    /***
     * This is testNorth1 method.
     *
     */
    @Test
    void testNorth1() {
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaY()).isEqualTo(-1);
    }
    /***
     * This is testNorth2 method.
     *
     */
    @Test
    void testNorth2() {
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaX()).isEqualTo(0);
    }
    /***
     * This is testSouth1 method.
     *
     */
    @Test
    void testSouth1() {
        Direction south = Direction.valueOf("SOUTH");
        assertThat(south.getDeltaY()).isEqualTo(1);
    }
    /***
     * This is testSouth2 method.
     *
     */
    @Test
    void testSouth2() {
        Direction south = Direction.valueOf("SOUTH");
        assertThat(south.getDeltaX()).isEqualTo(0);
    }
    /***
     * This is testEast1 method.
     *
     */
    @Test
    void testEast1() {
        Direction east = Direction.valueOf("EAST");
        assertThat(east.getDeltaX()).isEqualTo(1);
    }
    /***
     * This is testEast2 method.
     *
     */
    @Test
    void testEast2() {
        Direction east = Direction.valueOf("EAST");
        assertThat(east.getDeltaY()).isEqualTo(0);
    }
    /***
     * This is testWest1 method.
     *
     */
    @Test
    void testWest1() {
        Direction west = Direction.valueOf("WEST");
        assertThat(west.getDeltaX()).isEqualTo(-1);
    }
    /***
     * This is testWest2 method.
     *
     */
    @Test
    void testWest2() {
        Direction west = Direction.valueOf("WEST");
        assertThat(west.getDeltaY()).isEqualTo(0);
    }
}
