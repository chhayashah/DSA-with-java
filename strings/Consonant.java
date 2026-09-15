public class Consonant {
    public static void main(String[] args) {
        String str = "programming";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'
                        && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {

                    count++;
                }
            }
        }
        System.out.println("Consonants: " + count);
    }
}
