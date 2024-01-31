package com.ds.pattern;

public class Pattern {
	public static void main(String[] args) {

		int n = 5;

		System.out.println("---------pattern1--------");

		pattern1(n);

		System.out.println("---------pattern2--------");

		pattern2(n);

		System.out.println("---------pattern3--------");

		pattern3(n);

		System.out.println("--------pattern4---------");

		pattern4(n);

		System.out.println("-------pattern5----------");

		pattern5(n);

		System.out.println("-------pattern6----------");

		pattern6(n);

		System.out.println("-------pattern7----------");

		pattern7(n);

		System.out.println("-------pattern8----------");

		pattern8(n);

		System.out.println("-------pattern9----------");

		pattern9(n);

		System.out.println("-------pattern10----------");

		pattern10(n);

		// 29-01-2024

		System.out.println("-------pattern11----------");

		pattern11(n);

		System.out.println("-------pattern12----------");

		pattern12(n);

		System.out.println("-------pattern13----------");

		pattern13(n);
		// 30-01-2024
		System.out.println("-------pattern14----------");
		pattern14(n);
		// 31-01-2024
		System.out.println("-------pattern15----------");
		pattern15(n);
		System.out.println("-------pattern16----------");
		pattern16(n);
		System.out.println("-------pattern17----------");
		pattern17(n);
	}

	public static void pattern1(int n) {

		for (int i = 0; i <= n; i++) {

			for (int j = n; j >= i; j--) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}

	public static void pattern2(int n) {

		for (int i = 0; i <= n; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}

	public static void pattern3(int n) {

		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");

			}

			System.out.println();

		}

		for (int i = 0; i <= n; i++) {

			for (int k = 4; k >= i; k--) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}

	public static void pattern4(int n) {

		for (int i = 0; i <= n; i++) {

			for (int j = n; j > i; j--) {

				System.out.print("  ");

			}

			for (int k = 0; k <= i; k++) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}

	public static void pattern5(int n) {

		for (int i = 0; i <= n; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print("  ");

			}

			for (int k = n; k >= i; k--) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}

	public static void pattern6(int n) {

		for (int i = 0; i <= n; i++) {

			for (int j = n; j > i; j--) {

				System.out.print("  ");

			}

			for (int k = 0; k < i; k++) {

				System.out.print("* ");

			}

			System.out.println();

		}

		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("  ");

			}

			for (int k = 4; k > i; k--) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}

	public static void pattern7(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);

			}

			System.out.println();

		}

	}

	public static void pattern8(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i);

			}

			System.out.println();

		}

	}

	public static void pattern9(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = n; j >= i; j--) {

				System.out.print(n - j + 1 + " ");

			}

			System.out.println();

		}

	}

	public static void pattern10(int n) {

		int start = 1;

		for (int i = 0; i < n; i++) {

			if (start % 2 == 0) {

				start = 1;

			} else {

				start = 0;

			}

			for (int j = 0; j <= i; j++) {

				System.out.print(start + " ");

				start = 1 - start;

			}

			System.out.println();

		}

	}

	public static void pattern11(int n) {

		// number

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);

			} // space

			int space = 2 * (n - 1);

			for (int j = 1; j <= space; j++) {

				System.out.print(" ");
			}

			// number
			for (int j = i; j >= 1; j--) {

				System.out.print(j);

			}

			System.out.println();

			//

		}

	}

	public static void pattern12(int n) {

		int num = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(num + " ");

				num = num + 1;

			}

			System.out.println();

		}

	}

	public static void pattern13(int n) {

		for (int i = 0; i <= n; i++) {

			for (char ch = 'A'; ch <= 'A' + i; ch++) {

				System.out.print(ch + " ");

			}

			System.out.println();

		}

	}

	public static void pattern14(int n){
		for (int i = 0; i < N; i++)
    {
         
        for (int j =0; j<N-i-1; j++)
        {
            System.out.print(" ");
        }
       
         
        for(int j=0;j< 2*i+1;j++){
            
            System.out.print("*");
        }
        
         
         for (int j =0; j<N-i-1; j++)
        {
            System.out.print(" ");
        }
       
        System.out.println();
    }

	public static void pattern15(int n) {
		for (int i = 1; i <= n; i++) {
			for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public static void pattern16(int n) {
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print((char) (int) ('A' + i));
			}
			System.out.println();
		}
	}

	public static void pattern17(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i - 1; j++) {
				System.out.print(" ");
			}
			int m = 1;
			for (int k = 0; k <= i; k++) {
				System.out.print(m++);

			}
			System.out.println();
		}
	}
}
