package com.company;

import java.util.ArrayList;

public class Roman implements IRoman{
    @Override
    public String CyrillicToLatin(String text) {
        String [] cyr = {"А","Б","В","Г","Д","Е","Ё", "Ж", "З","И","Й","К","Л","М","Н","О","П","Р","С","Т","У","Ф","Х","Ч", "Ц","Ш", "Щ", "Э","Ю", "Я", "Ы","Ъ", "Ь", "а","б","в","г","д","е","ё", "ж", "з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х","ч", "ц","ш", "щ", "э","ю", "я", "ы","ъ","ь"};
        String [] lat = {"A","B","V","G","D","E","Jo","Zh","Z","I","J","K","L","M","N","O","P","R","S","T","U","F","H","Ch","C","Sh","Csh","E","Ju","Ja","Y","`", "'", "a","b","v","g","d","e","jo","zh","z","i","j","k","l","m","n","o","p","r","s","t","u","f","h","ch","c","sh","csh","e","ju","ja","y","`","'"};
        String res = "";

        for (int i = 0; i < text.length(); ++i) {
            String add = text.substring(i, i + 1);  //вырезан i-й элемент из всего текста
            for (int j = 0; j < cyr.length; j++) {
                if (cyr[j].equals(add)) {
                    add = lat[j];
                    break;
                }
            }
            res += add;
        }

        return res;
    }

    @Override
    public String LatinToCyrillic(String text) {
        String [] f = {"А","Б","В","Г","Д","Е","Ё","Ж","З","И","Й","К","Л","М","Н","О","П","Р","С","Т","У","Ф","Х","Ц","Ч","Ш","Щ","Ъ","Ы","Ь","Э","Ю","Я","а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х","ц","ч","ш","щ","ъ","ы","ь","э","ю","я",""};
        String [] t = {"A","B","V","G","D","E","Yo","Zh","Z","I","J","K","L","M","N","O","P","R","S","T","U","F","X","Cz","Ch","Sh","Shh","``","Y`","`","E`","Yu","Ya","a","b","v","g","d","e","yo","zh","z","i","j","k","l","m","n","o","p","r","s","t","u","f","x","cz","ch","sh","shh","``","y`","`","e`","yu","ya",""};
        String res = "";
        for (int i = 0; i < text.length(); ++i) {
            String add = text.substring(i, i + 1); //вырезан i-й элемент из всего текста
            for (int j = 0; j < f.length; j++) {
                if (t[j].equals(add)) {
                    add = f[j];
                    break;
                }
            }
            res += add;
        }
        return res;
    }
}
