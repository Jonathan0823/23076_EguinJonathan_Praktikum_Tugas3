package Tugas2;

public class KonversiSuhu2 extends KonversiSuhu {
    void fahrenheitToReamur(float fahrenheit) {
        float reamur = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F = " + reamur + "°R");
    }
}
