package mx.utm.LearningAD.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTestCapital
{

    //With number and without Capital Letter
    @Test
    public void without_capital_letter_String()
    {
        assertEquals(StringUtils.capitalLetter("hola1"),false);
    }

    //With number and only Capital Letter
    @Test
    public void only_capital_letter_String()
    {
        assertEquals(StringUtils.capitalLetter("HOLA1"),false);
    }


    //Capital_letter and number
    @Test
    public void with_1st_capital_Letter_String() { assertEquals(StringUtils.capitalLetter("Hola1"),true); }

    @Test
    public void with_2nd_capital_Letter_String()
    {
        assertEquals(StringUtils.capitalLetter("hOla1"),true);
    }

    @Test
    public void with_3rd_capital_Letter_String()
    {
        assertEquals(StringUtils.capitalLetter("hoLa1"),true);
    }

    @Test
    public void with_4rt_capital_Letter_String()
    {
        assertEquals(StringUtils.capitalLetter("holA1"),true);
    }

    @Test
    public void with_first_2_capital_Letter_String()
    {
        assertEquals(StringUtils.capitalLetter("HOla1"),true);
    }

    @Test
    public void with_last_capital_Letter_with_number_String()
    {
        assertEquals(StringUtils.capitalLetter("hoLA1"),true);
    }

    @Test
    public void with_2_capital_Letter__without_number_String_2()
    {
        assertEquals(StringUtils.capitalLetter("HoLa1"),true);
    }

    @Test
    public void with_2_capital_Letter_with_number_String()
    {
        assertEquals(StringUtils.capitalLetter("hOlA1"),true);
    }


    //3 Capital letters
    @Test
    public void with_3_capital_Letter_with_number_String_1()
    {
        assertEquals(StringUtils.capitalLetter("HOLa1"),true);
    }

    @Test
    public void with_3_capital_Letter_with_number_String_2()
    {
        assertEquals(StringUtils.capitalLetter("HOlA1"),true);
    }
    @Test
    public void with_3_capital_Letter_with_number_String_3()
    {
        assertEquals(StringUtils.capitalLetter("HoLA1"),true);
    }

    @Test
    public void with_3_capital_Letter_with_number_String()
    {
        assertEquals(StringUtils.capitalLetter("hOLA1"),true);
    }



    //without Capital Letter and without number
    @Test
    public void without_number_and_capital_letter_String()
    {
        assertEquals(StringUtils.capitalLetter("hola"),false);
    }

    //with only Capital Letter and without number
    @Test
    public void only_capital_letter_without_number_String()
    {
        assertEquals(StringUtils.capitalLetter("HOLA"),false);
    }


    //with Capital Letter and without number
    @Test
    public void with_1st_capital_Letter_without_number_String() { assertEquals(StringUtils.capitalLetter("Hola"),false); }

    @Test
    public void with_2nd_capital_Letter_without_number_String()
    {
        assertEquals(StringUtils.capitalLetter("hOla"),false);
    }

    @Test
    public void with_3rd_capital_Letter_without_number_String()
    {
        assertEquals(StringUtils.capitalLetter("hoLa"),false);
    }

    @Test
    public void with_4rt_capital_Letter_without_number_String()
    {
        assertEquals(StringUtils.capitalLetter("holA"),false);
    }

    @Test
    public void with_capital_Letter_without_number_String()
    {
        assertEquals(StringUtils.capitalLetter("HOLa"),false);
    }


    //with 2 Capital letter and without_number

    @Test
    public void with_first_2_capital_Letter_without_number_String()
    {
        assertEquals(StringUtils.capitalLetter("HOla"),false);
    }

    @Test
    public void with_last_capital_Letter_without_number_String()
    {
        assertEquals(StringUtils.capitalLetter("hoLA"),false);
    }

    @Test
    public void with_2_capital_Letter_without_number_String_2()
    {
        assertEquals(StringUtils.capitalLetter("HoLa"),false);
    }

    @Test
    public void with_2_capital_Letter_without_number_String()
    {
        assertEquals(StringUtils.capitalLetter("hOlA"),false);
    }

    //with 3 Capital letter and without number
    @Test
    public void with_3_capital_Letter_without_number_String_1()
    {
        assertEquals(StringUtils.capitalLetter("HOLa"),false);
    }

    @Test
    public void with_3_capital_Letter_without_number_String_2()
    {
        assertEquals(StringUtils.capitalLetter("HOlA"),false);
    }
    @Test
    public void with_3_capital_Letter_without_number_String_3()
    {
        assertEquals(StringUtils.capitalLetter("HoLA"),false);
    }

    @Test
    public void with_3_capital_Letter_without_number_String()
    {
        assertEquals(StringUtils.capitalLetter("hOLA"),false);
    }
   }