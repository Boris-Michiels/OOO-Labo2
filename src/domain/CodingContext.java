package domain;

public class CodingContext {
    private CodingStrategy codingStrategy;
    private String text;

    public String encode() {
        return codingStrategy.encode(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCaesarNumber() {
        return ((CaesarCoding) codingStrategy).getCaesarNumber();
    }

    public void setCaesarNumber(int caesarNumber) {
        ((CaesarCoding) codingStrategy).setCaesarNumber(caesarNumber);
    }

    public CodingStrategy getCodingStrategy() {
        return codingStrategy;
    }

    public void setCodingStrategy(CodingStrategy codingStrategy) {
        this.codingStrategy = codingStrategy;
    }
}
