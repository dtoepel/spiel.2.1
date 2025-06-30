public class PlayerCharacter {

    static int x = 0;
    static int y = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int[] move(String dir) {
        if("W".equals(dir)) y++;
        if("S".equals(dir)) y--;
        if("A".equals(dir)) x--;
        if("D".equals(dir)) x++;
        return new int[]{x,y};
    }
}
