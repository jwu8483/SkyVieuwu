package JWu;

public class SkyView {int numRows,int numCols , double[]Scanned)
    {
        private double[][] View;
        View = new double[numRows][numCols];
        int k = 0;

        for(int r =0; r < numRows;r++)
        {
            if(r%2 == 0)
            {
                for(int c = 0;c < numCols; c++)
                {
                    View[r][c] = Scanned[k];
                    k++;
                }
            }
            else
            {
                for(int c = numCols - 1;c >= 0; c--)
                {
                    View[r][c] = Scanned[k];
                    k++;
                }
            }
        }
    }
    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double total = 0.0; int numCounted = 0;

        for (int i = startRow; i <= endRow; i ++) {
            for (int j = startCol; j <= endCol; j ++) {
                total += this.View[i][j]; numCounted ++;
            }
        }
        return (double) (total / numCounted);
    }
}

