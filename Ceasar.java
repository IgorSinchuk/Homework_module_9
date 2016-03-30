import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ceasar {
   final private int AlphabetLenght = 26;

    public static List<Character> EnglishAlphabet() {
        List<Character> englishAlphabet = new ArrayList<Character>();
            final char[] Punctuation = { ' ' ,',', '.', '<', '>', '?', '|', '/', ':', ';', '[', ']',
                    '=', '-','+','(', ')','&','^','%','$','#','@','!', '{', '}'};
        for (char ch ='A'; ch <='Z'; ch++){
            englishAlphabet.add(ch);
        }
        for (char ch ='a'; ch <='z'; ch++){
            englishAlphabet.add(ch);
        }
        for (char ch ='0'; ch <='9'; ch++){
            englishAlphabet.add(ch);
        }
        for (char ch: Punctuation){
            englishAlphabet.add(ch);
        }

        return englishAlphabet;
    }


    public static String Encription (List<File> myCollection, int k) throws IOException {
        char[] myList = new char[myCollection.toString().length()];
        myCollection.toString().getChars(0, myCollection.toString().length(), myList, 0);
        //System.out.println(myList);
        StringBuilder cryptogram = new StringBuilder();

        List<Character> englishAlphabet = EnglishAlphabet();

        int power = englishAlphabet.size();
        int key = k;
        for (int i = 0; i < myList.length; i++) {
            int index;
            index = englishAlphabet.indexOf(myList[i]);
            index = (index + key) % power;
            cryptogram.append(englishAlphabet.get(index));
        }

        System.out.println(cryptogram);
        return cryptogram.toString();
    }


    public static String Decription (String myString, int k) throws IOException {
        char[] myList = new char[myString.length()];
        myString.getChars(0, myString.length(), myList, 0);
        StringBuilder uncryptogram = new StringBuilder();

        List<Character> englishAlphabet = EnglishAlphabet();

        int power = englishAlphabet.size();
        int key = k;
        if (key <= englishAlphabet.size()) {
            for (int i = 0; i < myList.length; i++) {
                int index;
                index = englishAlphabet.indexOf(myList[i]);
                index = (index - key + power) % power;
                uncryptogram.append(englishAlphabet.get(index));
            }

            System.out.println(uncryptogram);
        } else {
            System.out.println("ERROR: Impossible to crypt or decrypt.");
        }
        return uncryptogram.toString();


    }





}
