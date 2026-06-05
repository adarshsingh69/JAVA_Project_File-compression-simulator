import java.util.Scanner;

public class Compressor {

    public String compress(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i));
                result.append(count);
                count = 1;
            }
        }

        return result.toString();
    }

    public String decompress(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            char ch = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Compressor obj = new Compressor();

        String compressed = obj.compress(input);
        String decompressed = obj.decompress(compressed);

        System.out.println("\nOriginal String: " + input);
        System.out.println("Compressed String: " + compressed);
        System.out.println("Decompressed String: " + decompressed);

        if (input.equals(decompressed)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }

        sc.close();
    }
}
