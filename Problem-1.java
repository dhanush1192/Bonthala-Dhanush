class Calculator {

    double calculate(double a, double b, String operation) {

        switch (operation.toLowerCase()) {
            case "add":
                return a + b;

            case "subtract":
                return a - b;

            case "multiply":
                return a * b;

            case "divide":
                if (b == 0) {
                    System.out.println("Division by zero is not allowed");
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double a = 10.5;
        double b = 2.5;
        String operation = "add";

        double result = calc.calculate(a, b, operation);
        System.out.println("Result: " + result);
    }
}
