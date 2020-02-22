public class Theater_2 {

    private Seat[][] seats;
    private int rowCount, colCount;

    public Theater_2(int rowCount, int colCount) {
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
        int row = getRowIndex(rowChar) + 1; // col과 통일성을 위해 + 1

        // 예약 시도 정보가 영화관 좌석 영역을 벗어났을 경우 - false
        if (row > rowCount || col > colCount || col + numSeat > colCount) {
            return false;
        }
        // 예약할 좌석 하나씩 확인
        for (int i = 0; i < numSeat; i++) {
            Seat current = seats[row - 1][col - 1 + i];

            // 이미 예약된 자리 - 예약하려는 자리 모두 취소
            if (current.isOccupied()) {
                for (int j = 0; j < i; j++) {
                    seats[row - 1][col - 1 + j].cancel();
                }
                return false;
            }
            // 빈자리이면 예약
            current.reserve(name);
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