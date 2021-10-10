package domain;

public class MirrorCoding implements CodingStrategy {
    @Override
    public String encode(String text) {
        return mirror(text);
    }

    @Override
    public String decode(String text) {
        return mirror(text);
    }

    private String mirror(String text) {
        String mirror = "";
        while (text.length() != 0) {
            mirror += text.charAt(text.length() - 1);
            text = text.substring(0, text.length() - 1);
        }
        return mirror;
    }

    @Override
    public String toString() {
        return "Mirror";
    }
}
