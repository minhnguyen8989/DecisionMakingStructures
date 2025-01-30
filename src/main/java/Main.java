public class Main {
    public static void main(String[] args) {

        //if Statement
        int myNumber = 19;
        if (myNumber != 18) {
            System.out.println("You entered wrong number");
        }

        //if-else Statement
        int value = 50;
        if (value >= 50) {
            System.out.println("You are an elder.");
        } else {
            System.out.println("You are still young.");
        }

        //if-else if-else Ladder
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        //Switch Statement
        String day = "Sunday";
        switch (day) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }

        //Ternary Operator
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);


    }
}
