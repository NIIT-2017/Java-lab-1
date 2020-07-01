import static org.junit.Assert.*;

public class Replay_Test {

    @org.junit.Test
    public void archive() {
        assertEquals("5,3,1-4,8,9,23-26",Number_queue_replay.replay("5,3,1,2,3,4,8,9,23,24,25,26"));
        assertEquals("3-7,-20--17,33",Number_queue_replay.replay("3,4,5,6,7,-20,-19,-18,-17,33"));
    }
}