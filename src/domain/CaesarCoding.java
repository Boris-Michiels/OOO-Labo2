package domain;

public class CaesarCoding implements CodingStrategy{

    private int caesarnumber = 0;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";


    @Override
    public String encode(String passwoord){

        String encoded = "";
        for(char c : passwoord.toLowerCase().toCharArray()){
            if(alphabet.contains(Character.toString(c))){
                encoded += alphabet.charAt((alphabet.indexOf(c)+caesarnumber)%26);

            }else encoded+= c;

        }
        return encoded;
    }
    @Override
    public String decode(String passwoord){
        String decoded = "";
        for(char c : passwoord.toLowerCase().toCharArray()){
            if(alphabet.contains(Character.toString(c))){
                decoded += alphabet.charAt((alphabet.indexOf(c)-caesarnumber)%26);
            }else decoded+= c;

        }
        return decoded;

    }
    public void setCaesarnumber(int caesarnummer){
        this.caesarnumber=caesarnummer;

    }

}
