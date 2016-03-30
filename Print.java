import java.io.IOException;
import java.util.*;


public class Print {private static HashSet<String> audiofile = new HashSet<>();
    private static HashSet<String> imagefile = new HashSet<>();
    private static HashSet<String> textfile = new HashSet<>();


    public static HashSet<String> getAudiofile() {
        return audiofile;
    }

    public static HashSet<String> getImagefile() {
        return imagefile;
    }

    public static HashSet<String> getTextfile() {
        return textfile;
    }


    @Override
    public String toString() {
        return "Print{" +
                "audiofile=" + audiofile +
                ", imagefile =" + imagefile +
                ", textfile=" + textfile +
                +
                '}';
    }

    public static void main(String[] args) throws IOException {
        final List<File> myFiles = new ArrayList<>();
        myFiles.add(new AudioFile("Marcus Miller`s songs in album", 10));
        myFiles.add(new TextFile("Shantaram book", 1));
        myFiles.add(new ImageFile("Photos from Santa Monica", 83));

        int i=0;
        System.out.printf("%6s  %30s  %10s\n","number", "name", "amount");
        for (File file: myFiles) {
            System.out.printf("%6d  %30s  %10d\n",i, file.getName().toString(), file.getAmount());
            i++;
        }


        Ceasar some = new Ceasar();
        String newCrupt = null;
        System.out.printf("Input key value from 1 to %3d", some.EnglishAlphabet().size());
        Scanner in = new Scanner(System.in);
        boolean correctValue = false;
        int k=0;
        while (correctValue == false) {
            try {
                correctValue = true;
                k = in.nextInt();
            } catch (InputMismatchException e) {
                correctValue = false;
                System.out.println("ERROR: Input correct value. It must be INTEGER");
                break;
            }
        }

        if (k>0) {
            try {
                newCrupt = some.Encription(myFiles, k);
            } catch (IOException e) {
                e.printStackTrace();
            }



            some.Decription(newCrupt, k);
        } else {
            System.out.println("ERROR: Impossible to crypt or decrypt.");
        }

    }


}
