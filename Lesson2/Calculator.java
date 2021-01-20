public class Calculator {
    private boolean incorrectAction;
    int executeCalculation (int a, int b, char action) {
        int result = 1;
        incorrectAction = false;
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
            default: incorrectAction = true ;
                break;
        }
    return result;
    }
    
    boolean getIncorrectAction() {
        return incorrectAction;
    }
        
}