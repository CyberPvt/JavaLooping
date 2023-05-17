public class LoopingTutorial {
    public static void main(String[] args) {
        String message = "hello world !";

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);

            for (char letter = 'a'; letter <= currentChar; letter++) {//Since the char data type in Java is represented as a numeric value in the ASCII table, the loop will iterate over each character in the ASCII table from 'a' to the current character. This means that if the current character is 'h', for example, the loop will iterate over the characters 'a', 'b', 'c', 'd', 'e', 'f', and 'g', in that order.
                try {
                    // Add a delay of 200 milliseconds (adjust as needed)
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(message.substring(0, i) + letter);
            }
        }
    }
}
