public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'R', 'E', 'I', 'M', 'A', 'E', 'R', 'S', 'G', 'T' },
                { 'E', 'V', 'D', 'B', 'D', 'V', 'I', 'A', 'B', 'I' },
                { 'E', 'L', 'R', 'O', 'F', 'S', 'A', 'W', 'U', 'K' },
                { 'B', 'G', 'C', 'E', 'I', 'L', 'C', 'J', 'H', 'T' },
                { 'S', 'S', 'K', 'G', 'D', 'Z', 'H', 'S', 'T', 'O' },
                { 'V', 'M', 'J', 'A', 'V', 'H', 'Z', 'S', 'I', 'K' },
                { 'C', 'H', 'I', 'L', 'L', 'T', 'O', 'P', 'G', 'M' },
                { 'Y', 'S', 'P', 'I', 'T', 'A', 'P', 'R', 'W', 'D' },
                { 'G', 'B', 'D', 'S', 'T', 'K', 'P', 'W', 'S', 'O' },
                { 'G', 'T', 'L', 'H', 'Q', 'X', 'Q', 'L', 'O', 'E' },
        };

        // =============================================================
        // ALAK - (10 points)
        System.out.println(" ");
        System.out.println("1. ALAK ");
        for (int row = 0; row < 9; row++) {

            System.out.println("");

            for (int columne = 0; columne < 9; columne++) {

                if (row == 7 && (columne == 5)) {

                    System.out.print(array[row][columne]);
                }
                else if (row == 6 && (columne == 4)) {
                    System.out.print(array[row][columne]);
                }
                else if (row == 5 && (columne == 3)) {
                    System.out.print(array[row][columne]);
                }
                else if (row == 4 && (columne == 2)) {
                    System.out.print(array[row][columne]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

//         // =============================================================
        //  GITHUB - (10 points)
        System.out.println(" ");
         System.out.println("2. GITHUB ");
         for (int rows = 0; rows < 10; rows++) {
            System.out.println(" ");
            for (int columnx = 0; columnx < 10; columnx++) {
                if (rows == 6 && (columnx == 8)) {    
                System.out.print(array[rows][columnx]);
                }
                else if (rows == 5 && (columnx == 8)) {
                System.out.print(array[rows][columnx]);
                }
                else if (rows == 4 && (columnx == 8)) {
                System.out.print(array[rows][columnx]);
                }
                else if (rows == 3 && (columnx== 8)) {
                System.out.print(array[rows][columnx]);
                }
                else if (rows == 2 && (columnx == 8)) {
                System.out.print(array[rows][columnx]);
                }
                else if (rows == 1 && (columnx == 8)) {
                System.out.print(array[rows][columnx]);
                }
                else {
                System.out.print(" ");
                }
            }
         }


//         // =============================================================
        // SISIG - (10 points)
        System.out.println(" ");
        System.out.println("3. SISIG ");
        for (int rows = 0; rows < 10; rows++) {
            System.out.println("");
            for (int columns = 0; columns < 10; columns++) {
                if (rows == 0 && (columns == 7)) {    
                System.out.print(array[rows][columns]);
                }
                else if (rows == 1 && (columns == 6)) {
                System.out.print(array[rows][columns]);
                }
                else if (rows == 2 && (columns == 5)) {
                System.out.print(array[rows][columns]);
                }
                else if (rows == 3 && (columns == 4)) {
                System.out.print(array[rows][columns]);
                }
                else if (rows == 4 && (columns == 3)) {
                System.out.print(array[rows][columns]);
                
                }
                else {
                System.out.print(" ");
                }
            }
         }


//         // =============================================================
//         // VSCODE - (10 points)
        System.out.println(" ");
        System.out.println("4. VSCODE ");
        for (int rows = 0; rows < 10; rows++) {
    System.out.println("");
    for (int columnq = 0; columnq < 10; columnq++) {
        if (rows == 5 && (columnq == 0)) {    
        System.out.print(array[rows][columnq]);
        }
        else if (rows == 4 && (columnq == 1)) {
        System.out.print(array[rows][columnq]);
        }
        else if (rows == 3 && (columnq == 2)) {
        System.out.print(array[rows][columnq]);
        }
        else if (rows == 2 && (columnq == 3)) {
        System.out.print(array[rows][columnq]);
        }
        else if (rows == 1 && (columnq == 4)) {
            System.out.print(array[rows][columnq]);
        
        }
        else if (rows == 0 && (columnq == 5)) {
            System.out.print(array[rows][columnq]);
        }
        else {
        System.out.print(" ");
        }
    }
 }

//         // =============================================================
//         // BEER - (10 points)
        System.out.println(" ");
        System.out.println("5. BEER ");
for (int rows = 0; rows < 10; rows++) {
    System.out.println("");
    for (int columnw = 0; columnw < 10; columnw++) {
        if (rows == 3 && (columnw == 0)) {    
        System.out.print(array[rows][columnw]);
        }
        else if (rows == 2 && (columnw == 0)) {
        System.out.print(array[rows][columnw]);
        }
        else if (rows == 1 && (columnw == 0)) {
        System.out.print(array[rows][columnw]);
        }
        else if (rows == 0 && (columnw == 0)) {
        System.out.print(array[rows][columnw]);   
     }
        else {
        System.out.print(" ");
        }
    }
 }
//         // =============================================================
//         // JAVA - (10 points)
        System.out.println(" ");
        System.out.println("6. JAVA ");
        for (int rows = 0; rows < 10; rows++) {
            System.out.println("");
            for (int columnd = 0; columnd < 10; columnd++) {
                if (rows == 3 && (columnd == 7)) {    
                System.out.print(array[rows][columnd]);
                }
                else if (rows == 2 && (columnd == 6)) {
                System.out.print(array[rows][columnd]);
                }
                else if (rows == 1 && (columnd == 5)) {
                System.out.print(array[rows][columnd]);
                }
                else if (rows == 0 && (columnd == 4)) {
                System.out.print(array[rows][columnd]);   
             }
                else {
                System.out.print(" ");
                }
            }
         }

//         // =============================================================
        // TIKTOK - (10 points)
        System.out.println(" ");
        System.out.println("7. TIKTOK ");
        for (int rows = 0; rows < 10; rows++) {
            System.out.println("");
            for (int columnc = 0; columnc < 10; columnc++) {
                if (rows == 0 && (columnc == 9)) {    
                System.out.print(array[rows][columnc]);
                }
                else if (rows == 1 && (columnc == 9)) {
                System.out.print(array[rows][columnc]);
                }
                else if (rows == 2 && (columnc == 9)) {
                System.out.print(array[rows][columnc]);
                }
                else if (rows == 3 && (columnc == 9)) {
                System.out.print(array[rows][columnc]);   
             }
             else if (rows == 4 && (columnc == 9)) {
                System.out.print(array[rows][columnc]);   
             }
             else if (rows == 5 && (columnc== 9)) {
                System.out.print(array[rows][columnc]);   
             }
                else {
                System.out.print(" ");
                }
            }
         }


//         // =============================================================
        // CHILLTOP - (10 points)
        System.out.println(" ");
        System.out.println("8. CHILLTOP ");
for (int rows = 0; rows < 10; rows++) {
    System.out.println("");
    for (int columnv = 0; columnv < 10; columnv++) {
        if (rows == 6 && (columnv == 0)) {    
        System.out.print(array[rows][columnv]);
        }
        else if (rows == 6 && (columnv == 1)) {
        System.out.print(array[rows][columnv]);
        }
        else if (rows == 6 && (columnv == 2)) {
        System.out.print(array[rows][columnv]);
        }
        else if (rows == 6 && (columnv == 3)) {
        System.out.print(array[rows][columnv]);   
     }
     else if (rows == 6 && (columnv == 4)) {
        System.out.print(array[rows][columnv]);   
     }
     else if (rows == 6 && (columnv == 5)) {
        System.out.print(array[rows][columnv]);   
     }
     else if (rows == 6 && (columnv == 6)) {
        System.out.print(array[rows][columnv]);   
     }
     else if (rows == 6 && (columnv == 7)) {
        System.out.print(array[rows][columnv]);   
     }
        else {
        System.out.print(" ");
        }
    }
 }


//         // =============================================================
//         // REDHORSE - (10 points)
        System.out.println(" ");
        System.out.println("9. REDHORSE ");
for (int rows = 0; rows < 10; rows++) {
    System.out.println("");
    for (int columnt = 0; columnt< 10; columnt++) {
        if (rows == 2 && (columnt == 2)) {    
        System.out.print(array[rows][columnt]);
        }
        else if (rows == 3 && (columnt == 3)) {
        System.out.print(array[rows][columnt]);
        }
        else if (rows == 4 && (columnt == 4)) {
        System.out.print(array[rows][columnt]);
        }
        else if (rows == 5 && (columnt == 5)) {
        System.out.print(array[rows][columnt]);   
     }
     else if (rows == 6 && (columnt == 6)) {
        System.out.print(array[rows][columnt]);   
     }
     else if (rows == 7 && (columnt == 7)) {
        System.out.print(array[rows][columnt]);   
     }
     else if (rows == 8 && (columnt == 8)) {
        System.out.print(array[rows][columnt]);   
     }
     else if (rows == 9 && (columnt == 9)) {
        System.out.print(array[rows][columnt]);   
     }
        else {
        System.out.print(" ");
        }
    }
 }

//         // =============================================================
//         // TIPSY - (10 points)
        System.out.println(" ");
        System.out.println("10. TIPSY ");
for (int rows = 0; rows < 10; rows++) {
    System.out.println("");
    for (int column = 0; column < 10; column++) {
        if (rows == 7 && (column == 4)) {    
        System.out.print(array[rows][column]);
        }
        else if (rows == 7 && (column == 3)) {
        System.out.print(array[rows][column]);
        }
        else if (rows == 7 && (column == 2)) {
        System.out.print(array[rows][column]);
        }
        else if (rows == 7 && (column == 1)) {
        System.out.print(array[rows][column]);   
     }
     else if (rows == 7 && (column == 0)) {
        System.out.print(array[rows][column]);   
     }
     else {
        System.out.print(" ");
        }
    }
 }

//         // =============================================================

//         // BONUS
//         // SLY starts to learn programming. The first task is drawing a fox! However, that turns out to be too hard for a beginner, so she decides to draw a snake instead.

//         // A snake is a pattern on a n by m table. Denote c-th cell of r-th row as (r, c). The tail of the snake is located at (1, 1), then it's body extends to (1, m), then goes down 2 rows to (3, m), then goes left to (3, 1) and so on.

//         // Your task is to draw this snake for Fox Ciel: the empty cells should be represented as dot characters ('.') and the snake cells should be filled with number signs ('#').

//         // Consider sample tests in order to understand the snake pattern.
        
        
//         // Input
//         // The only line contains two integers: n and m (3 ≤ n, m ≤ 50).

//         // n is an odd number.

//         // Output
//         // Output n lines. Each line should contain a string consisting of m characters. Do not output spaces.
        
//         // Example
//         // Input: 3 3
        
//         // ###
//         // ..#
//         // ###
//         // #..
//         // ###
        
        
// //         Input: 9 9
            
// #########
// ........#
// #########
// #........
// #########
// ........#
// #########
// #........
// #########

            }
        
    }
