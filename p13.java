public class TextProcessor {
    public static void main(String[] args) {
        String inputString = "Hello, welcome to Java programming!";

        char specificCharacter = inputString.charAt(7);  
        System.out.println("Character at index 7: " + specificCharacter);

        boolean hasGreeting = inputString.contains("Hello"); 
        System.out.println("Does the string contain 'Hello'? " + hasGreeting);

        String lengthMessage = String.format("The length of the string is: %d", inputString.length());
        System.out.println(lengthMessage);

        int stringLength = inputString.length();  
        System.out.println("Length of the string: " + stringLength);

        String[] splitWords = inputString.split(" ");  
        System.out.println("Words stored in the string:");
        for (String word : splitWords) {
            System.out.println(word);
        }
    }
}
