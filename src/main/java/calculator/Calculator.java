package calculator;

public class Calculator {

    // costruttore

    public Calculator() {
    }

    // metodi

    public float add(float num1, float num2) {
       if (Float.isNaN(num1) || Float.isNaN(num2)) {
           throw new IllegalArgumentException("un argomento è NaN");
       }
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            throw new IllegalArgumentException("un argomento è NaN");
        }
        return num1 - num2;
    }

    public float divide(float num1, float num2) throws IllegalArgumentException {
        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            throw new IllegalArgumentException("un argomento è NaN");
        }
        if (num2 == 0.0f) {
            throw new IllegalArgumentException("un qualsiasi numero non può essere divisibile per 0");
        }
        return num1/num2;
    }

    public float multiply(float num1, float num2) {
        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            throw new IllegalArgumentException("un argomento è NaN");
        }
        return num1*num2;
    }


}
