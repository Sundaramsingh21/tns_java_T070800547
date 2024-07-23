import java.util.Scanner;

abstract class Processor {
    public int data;

    public Processor(int data) {
        this.data = data;
    }

    public void showData() {
        System.out.println("Data: " + data);
    }

    public abstract void process();
}


class Factorial extends Processor {
    public Factorial(int data) {
        super(data);
    }
    public void process() {
        int result = 1;
        for (int i = 1; i <= data; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + data + " is: " + result);
    }
}


class Circle extends Processor {
    public Circle(int data) {
        super(data);
    }
    @Override
    public void process() {
        double area = Math.PI * data * data;
        System.out.println("Area of circle with radius " + data + " is: " + area);
    }
}

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your choice (1 for factorial, 2 for circle area): ");
        int choice = scanner.nextInt();
        
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        
        // Processor processor;
        
        if (choice == 1) {
            // processor = new Factorial(number);
            Factorial f = new Factorial(number);
            f.process();
        } else if (choice == 2) {
            // processor = new Circle(number);
            Circle c = new Circle(number);
            c.process();
        } else {
            System.out.println("Invalid choice");
            scanner.close();
            return;
        }
        
        // processor.showData();
        // processor.process();
        
        scanner.close();
    }
}
