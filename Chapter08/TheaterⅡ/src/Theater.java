public class Theater {

    private Seat[][] seats;
    private int rowCount, colCount;

    public Theater(int rowCount, int colCount) {
        if (rowCount > 26) {
            rowCount = 26;
        }

        seats = new Seat[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                seats[i][j] = new Seat();
            }
        }

        this.rowCount = rowCount;
        this.colCount = colCount;

    }

    public void printSeatMatrix() {
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if (s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    public boolean reserve(String name, char rowChar, int col, int numSeat) {
        if (getRowIndex(rowChar) > rowCount || col > colCount) {
            return false;
        } else {
            if (col + numSeat > colCount + 1) {
                return false;
            } else {
                for (int i = col; i < col + numSeat - 1; i++) {
                    Seat a = seats[getRowIndex(rowChar)][i];
                    if (a.isOccupied()) {
                        return false;
                    }
                }
            }
        }
        for (int i = col - 1; i < col + numSeat - 1; i++) {
            Seat a = seats[getRowIndex(rowChar)][i];
            a.reserve(name);
        }

        return true;
    }


    public int cancel(String name) {
        int count = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                Seat b = seats[i][j];
                if (b.getName() != null) {
                    if (b.match(name) == true) {
                        b.cancel();
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int cancel(char rowChar, int col, int numSeat) {
        int count = 0;
        for (int i = col - 1; i < col + numSeat; i++) {
            Seat c = seats[getRowIndex(rowChar)][i];
            if (c.isOccupied()) {
                c.cancel();
                count++;
            }
        }
        return count;
    }

    public int getNumberOfReservedSeat() {
        int count = 0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                Seat d = seats[i][j];
                if (d.isOccupied() == true) {
                    count++;
                }
            }
        }
        return count;
    }

    private int getRowIndex(char uppercaseChar) {
        return uppercaseChar - 'A';
    }
}