public class CharacterPatt {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        // outer loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop ( How many contents are print )
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }

}
