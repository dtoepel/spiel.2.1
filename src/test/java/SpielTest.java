import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpielTest {
    @Test
    public void checkX0() {
        assertEquals(0, PlayerCharacter.getX());
    }

    @Test
    public void checkY0() {
        assertEquals(0, PlayerCharacter.getY());
    }

    @Test
    public void checkMoveUp() {
        int oldX = PlayerCharacter.getX();
        int oldY = PlayerCharacter.getY();
        int[] newLocation = PlayerCharacter.move("W");
        assertEquals(oldX, newLocation[0]);
        assertEquals(oldY+1, newLocation[1]);
    }
    @Test
    public void checkMoveDown() {
        int oldX = PlayerCharacter.getX();
        int oldY = PlayerCharacter.getY();
        int[] newLocation = PlayerCharacter.move("S");
        assertEquals(oldX, newLocation[0]);
        assertEquals(oldY-1, newLocation[1]);
    }
    @Test
    public void checkMoveRight() {
        int oldX = PlayerCharacter.getX();
        int oldY = PlayerCharacter.getY();
        int[] newLocation = PlayerCharacter.move("D");
        assertEquals(oldX+1, newLocation[0]);
        assertEquals(oldY, newLocation[1]);
    }
    @Test
    public void checkMoveLeft() {
        int oldX = PlayerCharacter.getX();
        int oldY = PlayerCharacter.getY();
        int[] newLocation = PlayerCharacter.move("A");
        assertEquals(oldX-1, newLocation[0]);
        assertEquals(oldY, newLocation[1]);
    }

    @Test
    public void fibo0() {
        assertEquals(1, Fibo.fibo(0));
    }

    @Test
    public void fibo1() {
        assertEquals(1, Fibo.fibo(1));
    }

    @Test
    public void fibo10() {
        assertEquals(Fibo.fibo(10), Fibo.fibo(9)+Fibo.fibo(8));
    }
}
