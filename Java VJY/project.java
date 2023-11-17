import java.util.*;

class project {

  char board[][] = new char[3][3];

  public static void Display(char board[][]) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + "    ");
      }
      System.out.println();
    }
  }

  public static void Replace(char board[][], char find, char replace) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i][j] == find) {
          board[i][j] = replace;
          return;
        }
      }
    }
  }

  public boolean checkForWin() {
    return (checkforRow() || checkforCol() || checkforDia());
  }

  public boolean checkforRow() {
    for (int i = 0; i < 3; i++) {
      if (check(board[i][0], board[i][1], board[i][2]) == true) return true;
    }
    return false;
  }

  public boolean checkforCol() {
    for (int i = 0; i < 3; i++) {
      if (check(board[0][i], board[1][i], board[2][i]) == true) return true;
    }
    return false;
  }

  public boolean checkforDia() {
    return (
      (check(board[0][0], board[1][1], board[2][2]) == true) ||
      (check(board[0][2], board[1][1], board[2][0]) == true)
    );
  }

  public boolean check(char c1, char c2, char c3) {
    return ((c1 == c2) && (c2 == c3));
  }

  public static void main(String args[]) {
    String player1, player2;
    char playerMarker1, playerMarker2;

    //to access the data members first create the object of class.
    project game = new project();

    Scanner in = new Scanner(System.in);

    System.out.println("             RULES!!!    ");
    System.out.println("1.You have only Eight turn");
    System.out.println(
      "2.Do not Enter the used position ...You lost your turn!!"
    );

    System.out.print("\nEnter the player 1 name:");
    player1 = in.nextLine();

    System.out.print("Enter the player 2 name:");
    player2 = in.nextLine();

    System.out.print(player1 + "  Please Select the charater  (X or O):");
    playerMarker1 = in.nextLine().charAt(0);

    //checking the character which is given by player 1
    while (
      playerMarker1 != 'X' &&
      playerMarker1 != 'x' &&
      playerMarker1 != 'O' &&
      playerMarker1 != 'o'
    ) {
      System.out.println("Invalid input !!! please enter correct character");

      playerMarker1 = in.nextLine().charAt(0);
    }

    if (playerMarker1 == 'X' || playerMarker1 == 'x') playerMarker2 =
      'O'; else playerMarker2 = 'X';

    int counter = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        //here counter is in Integer hence it cannot be store the value in char
        game.board[i][j] = Character.forDigit(counter++, 10);
      }
    }
    Display(game.board);

    //getting choice from the user
    char choice;
    for (int i = 0; i < 4; i++) {
      System.out.print(player1 + " Turn: ");
      choice = in.next().charAt(0);

      //here we have to replace the choice with player1
      Replace(game.board, choice, playerMarker1);
      Display(game.board);

      if (game.checkForWin()) {
        System.out.println("We have a winner: " + player1);
        i = 5;
      } else {
        System.out.print(player2 + " Turn: ");
        choice = in.next().charAt(0);
        Replace(game.board, choice, playerMarker2);
        Display(game.board);

        if (game.checkForWin()) {
          System.out.println("We have a winner: " + player2);
        }
      }
    }
  }
}
