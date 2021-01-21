////////////////////////////////////////////////////////////////////////////////
//-----------------------------------------------------------------
//   Namespace:      evalProblemsUsingOOLcs
//   Class:          evalProblemsClass
//   Description:    Class for the creation and testing of simple algorithms
//   Author:         @alexpujols                    Date: 1/17/21
//   Notes:          TBD
//   Revision History:
//   Name:           Date:        Description:
//   @alexpujols     1/18/21      Complete final testing
///-----------------------------------------------------------------
using System;
// Class for the creation and testing of PrimeFinder and OverlapFinder algorithms
namespace evalProblemsUsingOOLcs
{
  class evalProblemsClass
  {
    // Declare variables

    // Start main
    static void Main(string[] args)
    {
      PrimeFinder();
      OverlapFinder();
    }

    // Function/Method definitions

    // Method to test if a number is prime or not
    private static void PrimeFinder()
    {
      // Take in initial value for testing
      Console.WriteLine("\n** Welcome to the PrimeFinder! **");
      Console.WriteLine("Enter the number you would you like to test: ");
      string text = Console.ReadLine();
      int testnumber = Convert.ToInt32(text);

      // Determine if prime via algorithm
      var count = 0;
      // Cycle through each modulus test condition
      for (int i = 2; i < testnumber; i++)
      {
        if (testnumber%i == 0)
          count++;
        if (count == 2)
          break;
      }
      // Make final determination
      if (count == 2)
        Console.WriteLine("The number {0} is NOT a prime number", testnumber);
      else
        Console.WriteLine("The number {0} is a prime number", testnumber);
    }
    // Method to test if two rectangles intersect
    private static void OverlapFinder()
    {
      // Receive inputs and define rectangles
      Console.WriteLine("\n** Welcome to the OverlapFinder! **");
      Console.WriteLine("Enter the X and Y coordinates for both corners of rectangle 1 (ie. X1 Y1 X2 Y2): ");
      var rec1_line = Console.ReadLine();
      var rec1_data = rec1_line.Split(' ');
      var rec1_cord_x1 = int.Parse(rec1_data[0]);
      var rec1_cord_y1 = int.Parse(rec1_data[1]);
      var rec1_cord_x2 = int.Parse(rec1_data[2]);
      var rec1_cord_y2 = int.Parse(rec1_data[3]);
      Console.WriteLine("Enter the X and Y coordinates for both corners of rectangle 2 (ie. X1 Y1 X2 Y2): ");
      var rec2_line = Console.ReadLine();
      var rec2_data = rec2_line.Split(' ');
      var rec2_cord_x1 = int.Parse(rec2_data[0]);
      var rec2_cord_y1 = int.Parse(rec2_data[1]);
      var rec2_cord_x2 = int.Parse(rec2_data[2]);
      var rec2_cord_y2 = int.Parse(rec2_data[3]);
      // Compare rectangles via algorithm
      bool x_overlap = false;
      bool y_overlap = false;
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
        Console.WriteLine("\nThe rectangles overlap in a 2D plane");
      else
        Console.WriteLine("\nThe rectangles DO NOT overlap in a 2D plane");
    }
  }
}
