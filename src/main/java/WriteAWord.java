import java.util.Scanner;

/**
 * Created by adrianmaryniewski on 21.01.2017.
 */
public class WriteAWord {

    public static void main(String[] args) {

        String word;
        String martianWord;
        boolean isTrue = true;

        while (isTrue) {

            Scanner input = new Scanner(System.in);

            word = input.nextLine();
            martianWord = new StringBuilder(word).reverse().toString();

            System.out.println(martianWord);
        }


    }

}