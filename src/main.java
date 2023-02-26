import java.util.Scanner;

class Pattern {
	public static void main(String[] arg) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 for Triangle/Pyramid Star Pattern ");
			System.out.println("Press 2 for Triangle/Pyramid Star Pattern");
			System.out.println("Press 3 for Right Triangle");
			System.out.println("Press 4 for Right Triangle 2 Star Pattern");
			System.out.println("Press 5 for Reverse of 4 ");
			System.out.println("Press 6 for Reverse Pyramid ");
			System.out.println("Press 0 to EXIT");
			System.out.println("Make your Choice");
			choice = scanner.nextInt();
			switch (choice)
			{
				case 1:
					for (int i = 1; i <= 5; i++)
				{

					// inner loop to handle number spaces
					// values changing acc. to requirement
					for (int j = 5; j >= i; j--) {
						// printing spaces
						System.out.print(" ");
					}

					//  inner loop to handle number of columns
					//  values changing acc. to outer loop
					for (int k = 1; k <= i; k++) {
						// printing stars
						System.out.print(" "+"*");
					}

					// ending line after each row
					System.out.println();
				}
					break;
				case 2:
					for (int i = 0; i <=5 ; i++)
					{
						for (int j = 5; j >=1 ; j--) {
							if (j>i)
							{
								System.out.print(" ");
							}
							else
							{
								System.out.print(" "+"*");
							}

						}
						System.out.println();
					}
					break;
				case 3:
					for (int i = 1; i <=5; i++)
					{
						for (int j = 5; j >=i ; j--) {
							System.out.print(" ");
						}
						for (int k = 1; k <=i ; k++) {
							System.out.print("*");

						}
						System.out.println();
					}
					break;
				case 4:
					for (int i = 1; i <=5 ; i++)
					{
						for (int j = 1; j <=i ; j++)
						{
							System.out.print("*");
						}
						System.out.println();
					}
					break;
				case 5:
					for (int i = 1; i <=5 ; i++)
					{
						for (int j = 5; j >=i ; j--)
						{
							System.out.print("*");
						}
						System.out.println();
					}
					break;
					case 6:
					for (int i = 1; i <= 5; i++)
				{

					// inner loop to handle number spaces
					// values changing acc. to requirement
					for (int j = 1; j <= i; j++) {
						// printing spaces
						System.out.print(" ");
					}

					//  inner loop to handle number of columns
					//  values changing acc. to outer loop
					for (int k = 5; k >= i; k--) {
						// printing stars
						System.out.print(" "+"*");
					}

					// ending line after each row
					System.out.println();
				}
					break;
				case 0:
					System.exit(0);


				default:
					System.out.println("INVALID CHOICE");
			}
		}
	}
}
