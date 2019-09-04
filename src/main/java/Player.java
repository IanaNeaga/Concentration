import java.util.Scanner;

public class Player implements Playable{

    String name;

    public Player(String name) {
        this.name = name;
    }

    public int[] getCoord(){
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        return new int[]{row,col};
    }
}
