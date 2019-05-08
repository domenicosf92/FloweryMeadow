package com.company;

public class Grid {
    public int [][] grid = new int[9][9];
    public int [][] bombs = new int[2][2]; //how should I use?
    private int numberOfMines = 0;
    private int x=0, y=0;
    private int max= this.grid.length-1;

    public int setMines() throws Exception {
        if ((x>this.grid.length-1) || (y> this.grid.length-1)) {
            throw new Exception("Invalid coordinate");
        }
        for(int z=0; z<2; z++) {
            this.minesPosition();
            this.grid[x][y] = -1;
            for (int i = x - 1; i <= x + 1; i++) {
                if ((i<0) || (i>8)) {
                    continue;
                }
                for (int j = y - 1; j <= y + 1; j++) {
                    if (((j < 0) || (j>8))) {
                        continue;
                    }
                        if (this.grid[i][j]==-1) {
                            continue;
                        }
                        numberOfMines = this.grid[i][j]++;
                }
            }
        }
        return numberOfMines;
    }

    private void minesPosition(){
        x= (int) (Math.random()*max);
        y= (int) (Math.random()*max);
    }

    public boolean checkPosition(int x, int y){
                if (this.grid[x][y]== -1) {
                    return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder s= new StringBuilder();
        int[][] grid1 = this.grid;
        for (int i = 0; i < grid.length; i++) {
            int[] ints = grid1[i];
            for (int j = 0; j < this.grid.length; j++) {
                if (this.grid[i][j]==-1) {
                    s.append("| x |");
                }else {
                    s.append("| ").append(ints[j]).append(" |");
                }
            }
            s.append("\n");
        }
        s.append("\n\n");
        return s.toString();
    }
}
