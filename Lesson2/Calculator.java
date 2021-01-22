public class Calculator {
    int calculate(int a, int b, char action) {
        int result = 0;
        switch (action) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            case '^':
                result = 0;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
                break;
            default:
                System.out.println("Action is incorrect");
                break;
        }
        return result;
    }
}