import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        StringBuilder strB  = new StringBuilder("Я узнал, что у меня\n");
        strB.append("И тропинка и лесок").append("\nРечка, небо голубое").append("\nЭто Родина моя,");
        strB.append("\nВсех люблю на свете я!");
        strB.insert(strB.indexOf("\n"), "\nЕсть огромная семья");
        strB.insert(strB.indexOf("Речка"), "В поле каждый колосок\n");
        strB.insert(strB.indexOf("Это Родина"), "Это все мое родное\n");
        System.out.println(strB);


        Pattern longWord = Pattern.compile("\\+*[а-яА-Я]{6,}");
        Matcher matcher = longWord.matcher(strB.toString().toUpperCase());
        System.out.println("\nВывод всех слов из стихотворения размером больше 5 букв:");
        while (matcher.find())
            System.out.println(matcher.group());
    }



}
