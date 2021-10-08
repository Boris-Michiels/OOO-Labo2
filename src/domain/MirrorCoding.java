package domain;

public class MirrorCoding implements CodingStrategy {
    @Override
    public String encode(String text) {
        String encoded = "";
        for (char q : text.toCharArray()) {
            encoded += text.charAt(text.length() - 1);
            text = text.substring(text.length() - 1);
        }
        return encoded;
    }

    @Override
    public String decode(String text) {
        String decoded = "";
        for ( char q : text.toCharArray()) {
            decoded += text.charAt(text.length() - 1);
            text = text.substring(text.length() - 1);
        }
        return decoded;
    }
}
