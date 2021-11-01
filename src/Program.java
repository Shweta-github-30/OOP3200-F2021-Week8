public class Program
{
    public static float square(float value)
    {
        return value * value;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, World!");

        float valueToSquare = 5;
        //float squareValue;

        //square(valueToSquare);
        float squareValue = square(valueToSquare);
        System.out.println("The Square value is : " + squareValue);


    }
}
