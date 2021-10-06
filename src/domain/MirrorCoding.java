package domain;

public class MirrorCoding implements CodingStrategy {

    @Override
    public String encode(String passwoord){
        String encoded = "";
        for(char q: passwoord.toCharArray()){
            encoded += passwoord.charAt(passwoord.length()-1);
            passwoord = passwoord.substring(passwoord.length()-1);
        }
        return encoded;

    }
    @Override
    public String decode(String passwoord){
        String decoded = "";
        for(char q: passwoord.toCharArray()){
            decoded += passwoord.charAt(passwoord.length()-1);
            passwoord = passwoord.substring(passwoord.length()-1);
        }
        return decoded;

    }



}
