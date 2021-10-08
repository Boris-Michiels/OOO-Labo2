package domain;

public class CaesarCoding implements CodingStrategy{
    private int caesarNumber = 1;
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    @Override
    public String encode(String text) {
        String encoded = "";
        for (char c : text.toLowerCase().toCharArray()) {
            if (alphabet.contains(Character.toString(c))) {
                encoded += alphabet.charAt((alphabet.indexOf(c) + caesarNumber) % 26);
            } else encoded += c;
        }
        return encoded;
    }

    @Override
    public String decode(String text) {
        String decoded = "";
        for (char c : text.toLowerCase().toCharArray()) {
            if (alphabet.contains(Character.toString(c))) {
                decoded += alphabet.charAt((alphabet.indexOf(c) - caesarNumber) % 26);
            } else decoded += c;
        }
        return decoded;
    }

    public void setCaesarNumber(int caesarNumber){
        this.caesarNumber = caesarNumber;
    }

    public int getCaesarNumber() {
        return this.caesarNumber;
    }
}
