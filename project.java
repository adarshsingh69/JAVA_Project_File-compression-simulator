import java.util.Scanner;

class Compressor {

    // Method to Compress String
    public String compress(String input) {
        StringBuilder compressed = new StringBuilder();

        int count = 1;

        for (int i = 0; i < input.length(); i++) {

            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        return compressed.toString();
    }

    // Method to Decompress String
    public String decompress(String input) {
        StringBuilder decompressed = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            char character = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                decompressed.append(character);
            }
        }

        return decompressed.toString();
    }
}


// Main Class
public class CompressionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sc.nextLine();

        Compressor compressor = new Compressor();

        String compressed = compressor.compress(input);
        String decompressed = compressor.decompress(compressed);

        System.out.println("\nOriginal String: " + input);
        System.out.println("Compressed String: " + compressed);
        System.out.println("Decompressed String: " + decompressed);

        // Validation
        if (input.equals(decompressed)) {
            System.out.println("Compression & Decompression Successful");
        } else {
            System.out.println("Error in Compression/Decompression");
        }

        sc.close();
    }
}
