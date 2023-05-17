public class LoopingTutorial {
    public static void main(String[] args) {
        String message = "hello world !";

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);

            for (char letter = 'a'; letter <= currentChar; letter++) {
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