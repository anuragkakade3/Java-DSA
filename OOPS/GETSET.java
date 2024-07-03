//package OOPS;

public class GETSET {
    public static void main(String[] args) {
        // Classes & Objects:

        pen p1 = new pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class pen {
    private String Color;
    private int tip;

    String getColor() {
        return Color;
    }

    int getTip() {
        return tip;
    }

    void setColor(String Color) {
        this.Color = Color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
