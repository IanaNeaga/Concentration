public class Piece {
    Symbol s;
    boolean revealed;

    public Piece(Symbol s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s+" ";
    }
}
