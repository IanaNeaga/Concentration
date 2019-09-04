public class Arbitru {

    Board b;
    Playable player;
    int size;

    public Arbitru(int size, Playable player) {
        b = new Board(size);
        this.player = player;
    }

    public void play() {
        while (b.isGameOver()==false) {
            System.out.println(b);
            int[] coord;
            while (true) {
                coord = player.getCoord();
                if (b.isHidden(coord)) {
                    b.reveal(coord[0], coord[1]);
                    break;
                }
            }
            System.out.println(b);
            int[] secondCoord;
            while (true) {
                secondCoord = player.getCoord();
                if (b.isHidden(secondCoord)) {
                    b.reveal(secondCoord[0], secondCoord[1]);
                    break;
                }
            }
            System.out.println(b);
            if (b.isMatch(coord, secondCoord) == false) {
                b.hide(coord[0], coord[1]);
                b.hide(secondCoord[0], secondCoord[1]);
            }
        }
    }
}
