grade

change int[][] to char[][]
change 0, 1 values to O, X
Make a 2-player game, player O and player X
ask first player to input row, col
--place an X
--check for Win or tie
--if yes ask if they want to play again if no player
ask the second player to input row/col
--place an O
--check for win or tie
-- if yes ask if they want to play again! if no next play
Hint: to check for win, loop through all
possible win conditions:
--if(game[0][0]==game[0][1] && game[0][1]==game[0][2] we have a row win
--(remember char use == like int; Strings must use .equals() )
--"3 rows + 3 cols + 2 diags = 8 tests for a win"
--If no winner, but all cells are full that is a tie - 9 moves means all cells are full

\nGRADING IN INCREMENTAL STEPS
"1. First grade: Have X, O players make moves"
"where you see updated board -- but"
"-- no check for win, no check for tie, no ask to go again"