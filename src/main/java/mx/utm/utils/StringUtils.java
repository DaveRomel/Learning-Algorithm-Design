package mx.utm.utils;

public class StringUtils
{
    public static boolean isEmpty(String str)
    {
        if (str == null || str.equals("") || str.matches("[ ]+"))
            return true;
        return false;
    }

    public static boolean rigthSize(String str)
    {
        if(str.length()>=4)
        {
            return true;
        }
        return false;
    }

    public static boolean whithSpace(String str)
    {
        if (str.matches(".* .*"))
            return true;
        return false;
    }
}
