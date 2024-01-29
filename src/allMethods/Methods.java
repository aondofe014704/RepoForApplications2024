package allMethods;

public class Methods {
    private int addition;
    private int subtraction;
    private int multiplication;
    private int division;

    public int getAddition() {
        return addition;
    }
    public void setAddition(int number1, int number2) {

        this.addition = number1 + number2;
    }

    public int getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(int number1, int number2) {
        this.subtraction = number1 - number2;
    }

    public int getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(int number1, int number2) {
        this.multiplication = number1 * number2;
    }

    public void setDivision(int number1, int number2){
      this.division = number1 / number2;

    }

    public int getDivision() {
        return  division;
    }
}
