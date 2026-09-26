

class Solution {
    public boolean isSafe(int row, int col , char[][] board){
        int n = board.length;

        // horizontal
        for (int j=0; j<n; j++){
            if(board[row][j]== 'Q'){
                return false;
            }
        }

        // vertical 
        for (int i=0; i<n; i++){
            if(board[i][col]== 'Q'){
                return false;
            }
        }

        // upper left diagonal
        int r = row, c = col;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q') return false;
            r--; c--;
        }

        // upper right diagonal
        r = row; c = col;
        while(r>=0 && c<n){
            if(board[r][c]=='Q') return false;
            r--; c++;
        }

        // lower left diagonal
        r = row; c = col;
        while(r<n && c>=0){
            if(board[r][c]=='Q') return false;
            r++; c--;
        }

        // lower right diagonal
        r = row; c = col;
        while(r<n && c<n){
            if(board[r][c]=='Q') return false;
            r++; c++;
        }

        return true;
    }

    public void helper(char [][] board, List<List<String>> allBoards , int col ){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }
        for(int row=0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col]='Q';
                helper(board, allBoards, col+1);
                board[row][col]='.';
            }
        }
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards){
        List<String> newBoard = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            String row = new String(board[i]);
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards= new ArrayList<>();
        char[][] board = new char[n][n];

        // initialize board with '.'
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }
}
