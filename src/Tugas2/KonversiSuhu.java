package Tugas2;

/**
 * KonversiSuhu
 */
public class KonversiSuhu {
    void celciusToFahrenheit(float celcius) {
        float fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println(celcius + "°C = " + fahrenheit + "°F");
    }

    void celciusToReamur(float celcius) {
        float reamur = celcius * 4 / 5;
        System.out.println(celcius + "°C = " + reamur + "°R");
    }
    
}