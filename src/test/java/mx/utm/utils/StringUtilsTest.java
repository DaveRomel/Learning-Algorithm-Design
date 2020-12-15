package mx.utm.utils;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StringUtilsTest {

    //isEmpty
    @Test
    public void string_is_not_empty()
    {
        assertEquals(StringUtils.isEmpty("hola"),false);
    }

    @Test
    public void repeat_string_is_not_empty()
    {
        assertEquals(StringUtils.isEmpty(""),true);
    }

    @Test
    public void null_string_is_empty()
    {
        assertEquals(StringUtils.isEmpty(null),true);
    }

    @Test
    public void string_one_space_is_empty()
    {
        assertEquals(StringUtils.isEmpty(" "),true);
    }

    @Test
    public void string_repeat_5_space_is_empty()
    {
        assertEquals(StringUtils.isEmpty("     "),true);
    }

    @Test
    public void string_repeat_17_space_is_empty()
    {
        assertEquals(StringUtils.isEmpty("                 "),true);
    }

    @Test
    public void string_repeat_40_space_is_empty()
    {
        assertEquals(StringUtils.isEmpty("                                        "),true);
    }


    //rigthSize()
    @Test
    public void stringSize_empty()
    {
        assertEquals(StringUtils.rigthSize(""),false);
    }

    @Test
    public void stringSize_1_is_less_to_4()
    {
        assertEquals(StringUtils.rigthSize("h"),false);
    }

    @Test
    public void stringSize_2_is_less_to_4()
    {
        assertEquals(StringUtils.rigthSize("ho"),false);
    }

    @Test
    public void stringSize_3_is_less_to_4()
    {
        assertEquals(StringUtils.rigthSize("hol"),false);
    }

    @Test
    public void stringSize_4_is_same_to_4()
    {
        assertEquals(StringUtils.rigthSize("hola"),true);
    }

    @Test
    public void stringSize_8_is_higher_to_4()
    {
        assertEquals(StringUtils.rigthSize("holahola"),true);
    }

    @Test
    public void stringSize_9_is_higher_to_4()
    {
        assertEquals(StringUtils.rigthSize("hola hola"),true);
    }


    //whitSpace(con espacios)
    @Test
    public void whitSpace_1_character_space_String()
    {
        assertEquals(StringUtils.whithSpace("h "),true);
    }

    @Test
    public void whitoutSpace_1_space_betwen_character_String()
    {
        assertEquals(StringUtils.whithSpace("h o"),true);
    }

    @Test
    public void whitSpace_2_character_1_space_String()
    {
        assertEquals(StringUtils.whithSpace("ho "),true);
    }

    @Test
    public void whitSpace_3_character_space_String()
    {
        assertEquals(StringUtils.whithSpace("hol "),true);
    }

    @Test
    public void whitoutSpace_2_character_1_space_String()
    {
        assertEquals(StringUtils.whithSpace("ho l"),true);
    }

    @Test
    public void whitoutSpace_1_space_character_String()
    {
        assertEquals(StringUtils.whithSpace(" h"),true);
    }

    @Test
    public void whitSpace_4_character_space_String()
    {
        assertEquals(StringUtils.whithSpace("hola "),true);
    }

    @Test
    public void whitoutSpace_1_character_space_String()
    {
        assertEquals(StringUtils.whithSpace("hol a"),true);
    }

    @Test
    public void whitSpace_String()
    {
        assertEquals(StringUtils.whithSpace("hola hola"),true);
    }

    @Test
    public void whitoutSpace_String()
    {
        assertEquals(StringUtils.whithSpace("holahola"),false);
    }


}