package pl.samouczekprogramisty.kursjava;

public class Main {
    public static void main(String[] args) {
        String sentenceOne = "Pierwsze zdanie";
        String sentenceTwo = "Drugie zdanie";
        String sentenceThree = "Trzecie zdanie";

        int numberOfChars = sentenceOne.length() + sentenceTwo.length() + sentenceThree.length();
        System.out.println(numberOfChars);
    }
}
