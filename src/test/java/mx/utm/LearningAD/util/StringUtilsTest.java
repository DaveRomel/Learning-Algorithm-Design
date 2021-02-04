package mx.utm.LearningAD.util;

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


    //withSpace(con espacios)
    @Test
    public void withSpace_1_character_space_String()
    {
        assertEquals(StringUtils.withSpace("h "),true);
    }

    @Test
    public void withoutSpace_1_space_betwen_character_String()
    {
        assertEquals(StringUtils.withSpace("h o"),true);
    }

    @Test
    public void withSpace_2_character_1_space_String()
    {
        assertEquals(StringUtils.withSpace("ho "),true);
    }

    @Test
    public void withSpace_3_character_space_String()
    {
        assertEquals(StringUtils.withSpace("hol "),true);
    }

    @Test
    public void withoutSpace_2_character_1_space_String()
    {
        assertEquals(StringUtils.withSpace("ho l"),true);
    }

    @Test
    public void withoutSpace_1_space_character_String()
    {
        assertEquals(StringUtils.withSpace(" h"),true);
    }

    @Test
    public void withSpace_4_character_space_String()
    {
        assertEquals(StringUtils.withSpace("hola "),true);
    }

    @Test
    public void withoutSpace_1_character_space_String()
    {
        assertEquals(StringUtils.withSpace("hol a"),true);
    }

    @Test
    public void withSpace_String()
    {
        assertEquals(StringUtils.withSpace("hola hola"),true);
    }

    @Test
    public void withoutSpace_String()
    {
        assertEquals(StringUtils.withSpace("holahola"),false);
    }


}