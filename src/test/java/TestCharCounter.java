import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TestCharCounter extends CharCounter {

    @Test
    public void Test1_NoDublicates() throws Exception {
        CharCounter charCounter = new CharCounter();
        String text = "abcde";
        System.out.println("Все буквы без повторений: " + text);
        String res = charCounter.parseString(text);
        assertEquals("[]", res);
        System.out.println("\n");
    }

    @Test
    public void Test2_LowCaseLetters() throws Exception {
        CharCounter charCounter = new CharCounter();
        String text = "aabbcde";
        System.out.println("Все буквы маленькие, есть повторения: " + text);
        String res = charCounter.parseString(text);
        assertEquals("[a - 2 times, b - 2 times]", res);
        System.out.println("\n");
    }

    @Test
    public void Test3_DifferentCaseLetters() throws Exception {
        CharCounter charCounter = new CharCounter();
        String text = "aabBcde";
        System.out.println("Буквы разного регистра: " + text);
        String res = charCounter.parseString(text);
        assertEquals("[a - 2 times, b - 2 times]", res);
        System.out.println("\n");

    }

    @Test
    public void Test4_Letter6Times() throws Exception {
        CharCounter charCounter = new CharCounter();
        String text = "indivisibility";
        System.out.println("Одна буква встречается 6 раз: " + text);
        String res = charCounter.parseString(text);
        assertEquals("[i - 6 times]", res);
        System.out.println("\n");

    }

    @Test
    public void Test5_LettersManyTimes() throws Exception {
        CharCounter charCounter = new CharCounter();
        String text = "Indivisibilities";
        System.out.println("Одна буква встречается 6 раз, другая 2 раза, разные регистры: " + text);
        String res = charCounter.parseString(text);
        assertEquals("[s - 2 times, i - 7 times]", res);
        System.out.println("\n");
    }

    @Test
    public void Test6_LettersNumbers() throws Exception {
        CharCounter charCounter = new CharCounter();
        String text = "aA11";
        System.out.println("Повторяющиеся буквы и цифры разного регистра: " + text);
        String res = charCounter.parseString(text);
        assertEquals("[a - 2 times, 1 - 2 times]", res);
        System.out.println("\n");
    }

    @Test
    public void Test7_UpperCase() throws Exception {
        CharCounter charCounter = new CharCounter();
        String text = "ABBAGGG";
        System.out.println("Только заглавные повторяющиесы буквы: " + text);
        String res = charCounter.parseString(text);
        assertEquals("[a - 2 times, b - 2 times, g - 3 times]", res);
        System.out.println("\n");
    }

    @Test
    public void Test8_Cyrillic() throws Exception {
        CharCounter charCounter = new CharCounter();
        String text = "ПТптввоО12Д";
        System.out.println("Кириллица и цифры: " + text);
        String res = charCounter.parseString(text);
        assertEquals("[т - 2 times, в - 2 times, о - 2 times, п - 2 times]", res);
        System.out.println("\n");
    }

    @Test
    public void Test9_Othersymbols() throws Exception {
        CharCounter charCounter = new CharCounter();
        String text = "  Abca_BC%ппР    ";
        System.out.println("Пробелы в начале и конце, другие символы не учитываются: " + text);
        String res = charCounter.parseString(text);
        assertEquals("[a - 2 times, b - 2 times, c - 2 times, п - 2 times]", res);
        System.out.println("\n");
    }
}
