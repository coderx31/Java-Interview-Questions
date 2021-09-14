public class ArrayCopyDemo {
    public static void main(String[] args) {
        // Shenal Fernando

        String[] letters = { "s", "h", "e", "n", "a", "l", "f", "e", "r", "n", "a", "n", "d", "o"};

        System.arraycopy(letters,6,letters,13,14);
        for(String letter : letters){
            System.out.println(letter);
        }
        // needs to find some more
    }
}
