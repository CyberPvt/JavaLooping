public class Looping {
    public static void main(String[] args) {
        String targetString = "hello world";
        int targetLength = targetString.length();
        int currentIndex = 0;

        while (true) {
            char currentChar = (char) ('a' + currentIndex % 26);
            System.out.print(currentChar);

            currentIndex++;
            if (currentIndex % targetLength == 0) {
                System.out.println();
                if (checkTargetString(currentIndex, targetString)) {
                    break;
                }
            }
        }
    }

    private static boolean checkTargetString(int currentIndex, String targetString) {
        int targetLength = targetString.length();
        for (int i = 0; i < targetLength; i++) {
            char expectedChar = targetString.charAt(i);
            char currentChar = (char) ('a' + (currentIndex - targetLength + i) % 26);
            if (currentChar != expectedChar) {
                return false;
            }
        }
        return true;
    }
}