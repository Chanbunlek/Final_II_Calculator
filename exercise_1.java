import java.util.Arrays;
import java.util.Scanner;

public class exercise_1 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        int opt = 0;
        int arr[] = {};

        do {
            System.out.println( "Option" );
            System.out.println( "1./ Input" );
            System.out.println( "2./ Output" );
            System.out.println( "3./ Exit." );
            System.out.print( "Choose option: " );
            opt = scanner.nextInt();

            switch ( opt ) {
                case 1: {
                    int userInput;
                    
                    while ( true ) {
                        System.out.print( "Input negative number to leave : " );
                        userInput = scanner.nextInt();
                        if ( userInput < 0 )
                            break;

                        arr = Arrays.copyOf( arr, arr.length + 1 );
                        arr[ arr.length - 1 ] = userInput;
                    };
                    break;
                }
                case 2: {
                    for ( int i: arr ) {
                        System.out.println( i );
                    }

                    break;
                }
            }
        } while ( opt != 3 );
    }
}