public class Calculator {
    int calculate (int a, int b, char action) {
        int result = 1;
        switch (action) {
            case '+': result = a + b;
                break;
            case '-': result = a - b;
                break;
            case '*': result = a * b;
                break;
            case '/': result = a / b;
                break;
            case '%': result = a % b;
                break;
            case '^': 
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
                break;
            default: System.out.println("Action is incorrect");
                break;
        }
        return result;
    }
}