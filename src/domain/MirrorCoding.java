package domain;

public class MirrorCoding implements CodingStrategy {
    @Override
    public String encode(String text) {
        String encoded = "";
        while (text.length() != 0) {
            encoded += text.charAt(text.length() - 1);
            text = text.substring(0, text.length() - 1);
        }
        return encoded;
    }

    @Override
    public String decode(String text) {
        String decoded = "";
        while (text.length() != 0) {
            decoded += text.charAt(text.length() - 1);
            text = text.substring(0, text.length() - 1);
        }
        return decoded;
    }
}
