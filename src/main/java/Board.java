import java.util.Random;

public class Board {

    Piece[][] m;
    int nrSpatiiGoale;

    Board(int size) {
        nrSpatiiGoale=size*size;
        m = new Piece[size][size];
        Symbol[] array = Symbol.values();
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 2; j++) {
                int row;
                int col;
                do {
                    row = r.nextInt(size);
                    col = r.nextInt(size);
                } while (m[row][col] != null);
                m[row][col]=new Piece(array[i]);
            }
        }
    }

    @Override
    public String toString() {
        String acumulator = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(m[i][j].revealed==false){
                    acumulator+="X ";
                }else{
                    acumulator += m[i][j]+"";
                }
            }
            acumulator += "\n";
        }
        return acumulator;
    }

    public void reveal(int row,int col){
        m[row][col].revealed=true;
        nrSpatiiGoale--;
    }

    public void hide(int row,int col){
        m[row][col].revealed=false;
        nrSpatiiGoale++;
    }

    public boolean isMatch(int[] coord,int[] secondCoord){
        Symbol first=m[coord[0]][coord[1]].s;
        Symbol second=m[secondCoord[0]][secondCoord[1]].s;
        return first.equals(second);
    }

    public boolean isHidden(int[] coord){
        return !m[coord[0]][coord[1]].revealed;
    }

    public boolean isGameOver(){
        return nrSpatiiGoale==0;
        //alternativ:
        /*
        for(int i=0;i<m.length;i++){
        for(int j=0;j<m.length;++j){
        if(!m[i][j].revealed){
        return false;
        }
        }}
        return true;
         */
    }

}
