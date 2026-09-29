public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. Creation and Initialization
        String message = "  Hello, Java Programming!  ";
        System.out.println("Original String: '" + message + "'");

        // 2. Getting Length
        int length = message.length();
        System.out.println("Length of String: " + length);

        // 3. Trimming Whitespace
        String cleanMessage = message.trim();
        System.out.println("Trimmed String: '" + cleanMessage + "'");

        // 4. Changing Case
        System.out.println("Uppercase: " + cleanMessage.toUpperCase());
        System.out.println("Lowercase: " + cleanMessage.toLowerCase());

        // 5. Accessing Characters by Index
        char firstChar = cleanMessage.charAt(0);
        System.out.println("Character at index 0: " + firstChar);

        // 6. Extracting a Substring (Indices 7 to 11 -> "Java")
        String sub = cleanMessage.substring(7, 11);
        System.out.println("Extracted Substring: " + sub);

        // 7. Searching and Checking Content
        boolean hasJava = cleanMessage.contains("Java");
        int indexOfr = cleanMessage.indexOf("r");
        System.out.println("Contains 'Java'?: " + hasJava);
        System.out.println("First occurrence index of 'r': " + indexOfr);

        // 8. Replacing Text
        String replaced = cleanMessage.replace("Java", "Python");
        System.out.println("Replaced String: " + replaced);

        // 9. String Comparison (.equals over ==)
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println("Comparison using ==: " + (str1 == str2)); // Checks memory reference
        System.out.println("Comparison using .equals(): " + str1.equals(str2)); // Checks actual content

        // 10. Splitting a String
        String fruits = "Apple,Banana,Orange";
        String[] fruitArray = fruits.split(",");
        System.out.print("Split Array: ");
        for (String fruit : fruitArray) {
            System.out.print("[" + fruit + "] ");
        }
    }
}

