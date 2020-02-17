public class ShapePrinter {
    public void printFloydsPyramid(int height) {
        // 숫자값
        int maxNum = height * (height + 1) / 2;
        // 마지막 끝값 수
        int lenMaxNum = (String.valueOf(maxNum)).length();
        // 인쇄될 수
        int count = 1;

        // 반복분 1 - 행을 바꾸는 반복문
        for (int i = 1; i <= height; i++) {

            // 반복문 2 - 한 행에 열을 바꾸는 반복문
            for (int k = 1; k <= i; k++) {
                int lenCount = (String.valueOf(count)).length();

                // 반복문 3 - 한 열 안에 자리 수 맞추는 반복문
                for (int j = 1; j <= lenMaxNum - lenCount; j++) {
                    System.out.print(" ");

                }

                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
