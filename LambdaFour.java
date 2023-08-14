import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LambdaFour implements StringFunction {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";

        try {
            String inputFile = "input.txt"; // Replace with the path to your input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = reader.readLine()) != null) {
                printFormatted(line, exclaim);
                printFormatted(line, ask);
            }

            reader.close();
        } catch (IOException e) {
            LOGGER.log;
        }
    }

    private static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    @Override
    public String run(String str) {
        return null;
    }
}


