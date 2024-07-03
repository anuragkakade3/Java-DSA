//package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        King k = new King();
        k.moves();
    }

}

interface ChessPlayer {
    void moves(); // Consider as a abstract class & compulsory to use this funx in all classes
    // This funx only provides an idea not implementation
}

class Pawn implements ChessPlayer {

    public void moves() {
        System.out.println("Pawn moves");
    }

}

class Queen implements ChessPlayer {

    public void moves() {
        System.out.println("Queen moves");
    }

}

class King implements ChessPlayer {

    public void moves() {
        System.out.println("King moves");
    }

}
