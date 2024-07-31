package alpha_codes;
//import java.util.Scanner;

public class A1_patterns {

    public static void hollow_rect(int totrows, int totcols) {

        // outerloop
        for (int i = 1; i <= totrows; i++) {
            // inner columns
            for (int j = 1; j <= totcols; j++) {
                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    // boundary cells
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }

    public static void inv_rot_half_pyr(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void inv_half_pyr_num(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);

            }
            System.out.println();
        }

    }

    public static void floyds_tri(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + counter);
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_1_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces=2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars=i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces=2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars=i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // hollow rect=stars #modified
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void diamond(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        // hollow_rect(10, 7);
        // inv_rot_half_pyr(10);
        // inv_half_pyr_num(10);
        // floyds_tri(4);
        // zero_1_triangle(5);
        // butterfly(10);
        // solid_rhombus(10);
        // hollow_rhombus(10);
        diamond(20);

    }

}
