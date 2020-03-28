package src.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class ReversedReader extends BufferedReader {
    public ReversedReader(Reader in) {
        super(in);
    }

    public String reverseLine() throws IOException {
        String line = super.readLine();
        if (line == null) {
            return line;
        } else {
            return reverse(line);
        }
    }

    private String reverse(String srcLine) {
        String result = "";
        for (int i = 0; i < srcLine.length(); i++) {
            result = srcLine.charAt(i) + result;
        }
        return result;
    }
}