package ch10.collection01.ch15.sec02.exam01;

public class EvenNumbersExample {
    public static void main(String[] args) {
        // 1부터 100까지 반복
        for (int i = 1; i <= 100; i++) {
            // 짝수인 경우에만 출력
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
