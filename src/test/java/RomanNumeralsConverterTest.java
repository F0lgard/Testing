import org.example.RomanNumeralsConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsConverterTest {

    @Test
    void testArabicToRoman_1() {
        assertEquals("I", RomanNumeralsConverter.arabicToRoman(1));
    }

    @Test
    void testArabicToRoman_2() {
        assertEquals("II", RomanNumeralsConverter.arabicToRoman(2));
    }

    @Test
    void testArabicToRoman_3() {
        assertEquals("III", RomanNumeralsConverter.arabicToRoman(3));
    }

    @Test
    void testArabicToRoman_4() {
        assertEquals("IV", RomanNumeralsConverter.arabicToRoman(4));
    }

    @Test
    void testArabicToRoman_5() {
        assertEquals("V", RomanNumeralsConverter.arabicToRoman(5));
    }

    @Test
    void testArabicToRoman_6() {
        assertEquals("VI", RomanNumeralsConverter.arabicToRoman(6));
    }

    @Test
    void testArabicToRoman_7() {
        assertEquals("VII", RomanNumeralsConverter.arabicToRoman(7));
    }

    @Test
    void testArabicToRoman_8() {
        assertEquals("VIII", RomanNumeralsConverter.arabicToRoman(8));
    }

    @Test
    void testArabicToRoman_9() {
        assertEquals("IX", RomanNumeralsConverter.arabicToRoman(9));
    }

    @Test
    void testArabicToRoman_10() {
        assertEquals("X", RomanNumeralsConverter.arabicToRoman(10));
    }

    @Test
    void testArabicToRoman_20() {
        assertEquals("XX", RomanNumeralsConverter.arabicToRoman(20));
    }

    @Test
    void testArabicToRoman_30() {
        assertEquals("XXX", RomanNumeralsConverter.arabicToRoman(30));
    }

    @Test
    void testArabicToRoman_40() {
        assertEquals("XL", RomanNumeralsConverter.arabicToRoman(40));
    }

    @Test
    void testArabicToRoman_50() {
        assertEquals("L", RomanNumeralsConverter.arabicToRoman(50));
    }

    @Test
    void testArabicToRoman_60() {
        assertEquals("LX", RomanNumeralsConverter.arabicToRoman(60));
    }

    @Test
    void testArabicToRoman_70() {
        assertEquals("LXX", RomanNumeralsConverter.arabicToRoman(70));
    }

    @Test
    void testArabicToRoman_80() {
        assertEquals("LXXX", RomanNumeralsConverter.arabicToRoman(80));
    }

    @Test
    void testArabicToRoman_90() {
        assertEquals("XC", RomanNumeralsConverter.arabicToRoman(90));
    }

    @Test
    void testArabicToRoman_100() {
        assertEquals("C", RomanNumeralsConverter.arabicToRoman(100));
    }

    @Test
    void testArabicToRoman_200() {
        assertEquals("CC", RomanNumeralsConverter.arabicToRoman(200));
    }

    @Test
    void testArabicToRoman_300() {
        assertEquals("CCC", RomanNumeralsConverter.arabicToRoman(300));
    }

    @Test
    void testArabicToRoman_400() {
        assertEquals("CD", RomanNumeralsConverter.arabicToRoman(400));
    }

    @Test
    void testArabicToRoman_500() {
        assertEquals("D", RomanNumeralsConverter.arabicToRoman(500));
    }

    @Test
    void testArabicToRoman_600() {
        assertEquals("DC", RomanNumeralsConverter.arabicToRoman(600));
    }

    @Test
    void testArabicToRoman_700() {
        assertEquals("DCC", RomanNumeralsConverter.arabicToRoman(700));
    }

    @Test
    void testArabicToRoman_800() {
        assertEquals("DCCC", RomanNumeralsConverter.arabicToRoman(800));
    }

    @Test
    void testArabicToRoman_900() {
        assertEquals("CM", RomanNumeralsConverter.arabicToRoman(900));
    }

    @Test
    void testArabicToRoman_1000() {
        assertEquals("M", RomanNumeralsConverter.arabicToRoman(1000));
    }

    @Test
    void testArabicToRoman_1500() {
        assertEquals("MD", RomanNumeralsConverter.arabicToRoman(1500));
    }

    @Test
    void testArabicToRoman_1900() {
        assertEquals("MCM", RomanNumeralsConverter.arabicToRoman(1900));
    }

    @Test
    void testArabicToRoman_2000() {
        assertEquals("MM", RomanNumeralsConverter.arabicToRoman(2000));
    }

    @Test
    void testArabicToRoman_2500() {
        assertEquals("MMD", RomanNumeralsConverter.arabicToRoman(2500));
    }

    @Test
    void testArabicToRoman_3000() {
        assertEquals("MMM", RomanNumeralsConverter.arabicToRoman(3000));
    }

    @Test
    void testArabicToRoman_3500() {
        assertEquals("MMMD", RomanNumeralsConverter.arabicToRoman(3500));
    }

    @Test
    void testArabicToRoman_3600() {
        assertEquals("MMMDC", RomanNumeralsConverter.arabicToRoman(3600));
    }

    @Test
    void testArabicToRoman_3700() {
        assertEquals("MMMDCC", RomanNumeralsConverter.arabicToRoman(3700));
    }

    @Test
    void testArabicToRoman_3800() {
        assertEquals("MMMDCCC", RomanNumeralsConverter.arabicToRoman(3800));
    }

    @Test
    void testArabicToRoman_3900() {
        assertEquals("MMMCM", RomanNumeralsConverter.arabicToRoman(3900));
    }

    @Test
    void testArabicToRoman_3999() {
        assertEquals("MMMCMXCIX", RomanNumeralsConverter.arabicToRoman(3999));
    }
    @Test
    public void testArabicToRoman_1987() {
        assertEquals("MCMLXXXVII", RomanNumeralsConverter.arabicToRoman(1987));
    }
}
