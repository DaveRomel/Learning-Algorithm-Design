package mx.utm.LearningAD.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils
{
    public static boolean isEmpty(String str)
    {
        if (str == null || str.equals("") || str.matches("[ ]+"))
            return true;
        return false;
    }

    public static boolean isNotEmpty(String str)
    {
        if (str == null || str.equals("") || str.matches("[ ]+"))
            return false;
        return true;
    }

    public static boolean rigthSize(String str)
    {
        if(str.length()>=4)
        {
            return true;
        }
        return false;
    }

    public static boolean withSpace(String str)
    {
        if (str.matches(".* .*"))
            return true;
        return false;
    }

    public static boolean withoutSpace(String str)
    {
        if (str.matches(".* .*"))
            return false;
        return true;
    }

    public static boolean capitalLetter(String str)
    {
        if (str.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{4,}$"))
            return true;
        return false;
    }
    /*
    public static boolean prueba(String str)
    {
        Pattern pat = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{4,}$");
        Matcher mat = pat.matcher(str);
        if (mat.matches())
            return true;
        return false;
    }*/
}
