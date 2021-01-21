import java.util.*;

public class evalProblemsUsingOOL {
  // Function/Method definitions
  // Method to test if a number is prime or not
  static void PrimeFinder()
  {
    // Take in initial value for testing
    System.out.println("\n** Welcome to the PrimeFinder! **");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number you would you like to test: ");
    int testnumber = scan.nextInt();
    scan.close();

    // Determine if prime via algorithm
    int count = 0;
    // Cycle through each modulus test condition
    for (int i = 2; i < testnumber; i++){
      if (testnumber%i == 0)
        count++;
      if (count == 2)
        break;
    }
    // Make final determination
    if (count == 2)
      System.out.println("The number " + testnumber + " is NOT a prime number");
    else
      System.out.println("The number " + testnumber + " is a prime number");
  }
  // Method to test if two rectangles intersect
  static void OverlapFinder()
  {
    // Receive inputs and define rectangle 1
    System.out.println("\n** Welcome to the OverlapFinder! **");
    Scanner rec1_scan = new Scanner(System.in);
    System.out.println("\nEnter the X and Y coordinates for both corners of rectangle 1 (ie. X1 Y1 X2 Y2): ");
    String rec1_line = rec1_scan.nextLine();
    //Breaks the string into tokens and convert to integers
    String[] rec1_tokens = rec1_line.split(" ");
    int[] r1_inputNumbers = new int[rec1_tokens.length];
    for(int i = 0; i < rec1_tokens.length; i++){
      r1_inputNumbers[i] = Integer.parseInt(rec1_tokens[i]);
    }
    // Assign values to variables in preperation for processing via algorithm
    int rec1_cord_x1 = r1_inputNumbers[0];
    int rec1_cord_y1 = r1_inputNumbers[1];
    int rec1_cord_x2 = r1_inputNumbers[2];
    int rec1_cord_y2 = r1_inputNumbers[3];
    // Receive inputs and define rectangle 1
    Scanner rec2_scan = new Scanner(System.in);
    System.out.println("\nEnter the X and Y coordinates for both corners of rectangle 2 (ie. X1 Y1 X2 Y2): ");
    String rec2_line = rec2_scan.nextLine();
    //Breaks the string into tokens and convert to integers
    String[] rec2_tokens = rec2_line.split(" ");
    int[] r2_inputNumbers = new int[rec2_tokens.length];
    for(int j = 0; j < rec2_tokens.length; j++){
    r2_inputNumbers[j] = Integer.parseInt(rec2_tokens[j]);
  }
    // Assign values to variables in preperation for processing via algorithm
    int rec2_cord_x1 = r2_inputNumbers[0];
    int rec2_cord_y1 = r2_inputNumbers[1];
    int rec2_cord_x2 = r2_inputNumbers[2];
    int rec2_cord_y2 = r2_inputNumbers[3];
    // Compare rectangles via algorithm
    boolean x_overlap = false;
    boolean y_overlap = false;
    for (int x = rec1_cord_x1; x < rec1_cord_x2; x++)
    {
      if (x == rec2_cord_x1)
      {
        x_overlap = true;
        break;
      }
    }
    for (int y = rec1_cord_y1; y < rec1_cord_y2; y++)
    {
      if (y == rec2_cord_y1)
      {
        y_overlap = true;
        break;
      }
    }
    // Make final determination
    if (x_overlap == true && y_overlap == true)
      System.out.println("\nThe rectangles overlap in a 2D plane");
    else
      System.out.println("\nThe rectangles DO NOT overlap in a 2D plane");
  }
    // Start main
  public static void main(String[] args) {
    PrimeFinder();
    OverlapFinder();
  }
}
