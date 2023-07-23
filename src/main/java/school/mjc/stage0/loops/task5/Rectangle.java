package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        char[][] carr = new char[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if ( (i != 0 && i != height - 1) && (j != 0 && j != length-1) )
                    carr[i][j] = ' ';
                else
                    carr[i][j] = '8';

            }
        }
        for (char[] c: carr) {
            System.out.println(c);
        }
    }
}
