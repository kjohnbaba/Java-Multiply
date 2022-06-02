public class Multiply {
    public static void main(String[] args)
    {
    StdOut.print("Type an integer to multiply: ");
    int x = StdIn.readInt();
    StdOut.print("Type the second integer: ");
    int y = StdIn.readInt();
    int sum = x * y;
    StdOut.println("Their multiplication is " + sum);
    }
}
