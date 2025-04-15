
public class FindMax {

    public static <T extends Number> T findMax(T number1, T number2) {
        if (number1 == null || number2 == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        return (number1.doubleValue() > number2.doubleValue()) ? number1 : number2;
    }

    public static void main(String[] args) {
        Integer int1 = 10, int2 = 20;
        Double double1 = 15.5, double2 = 10.5;
        System.out.println("Max of " + int1 + " and " + int2 + " is: " + findMax(int1, int2));
        System.out.println("Max of " + double1 + " and " + double2 + " is: " + findMax(double1, double2));
        Float float1 = 7.3f, float2 = 9.8f;
        System.out.println("Max of " + float1 + " and " + float2 + " is: " + findMax(float1, float2));

    }
}
