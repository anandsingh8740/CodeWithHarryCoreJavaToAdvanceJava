package prepcodingString;
import java.util.*;
public class S_9hortestPathToReachdestination {
    public static float getShortestPath(String path){  // float yaha hai hamara final displacement
        int x =0, y=0;
        for(int i =0;i<path.length();i++){
         char dir = path.charAt(i);
         // South
            if(dir == 'S'){
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // West
            else if (dir == 'W') {
              x--;
            }
            // East
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
       // String path = "WNEENESENNN"; // 5.0
       // String path = "NS"; //OUTPUT  0.0
        //String path = "WS"; //1.4142135
        String path = "EN"; //1.4142135
        System.out.println(getShortestPath(path));

    }
}
// Output
// 5.0