

public class Numbers extends Calc {
    private int num1;
    private int num2;

    public int add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2; 
        int result = num1 + num2;
        return result;
    }

        public int multi(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2; 
        int result = num1 * num2;
        return result;
    }

        public int sub(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2; 
        int result = num1 - num2;
        return result;
    }

        public int div(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2; 
        int result = num1 / num2;
        return result;
    }
}