package com.example.codingtest.Ch01;

import java.util.stream.IntStream;


    //20231201
   /* 문제) 정수 start_num와 end_num가 주어질 때,start_num에서 end_num까지
    1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

    제한사항)
     0 ≤ end_num ≤ start_num ≤ 50

     예)
     10부터 3까지 1씩 감소하는 수를 담은 리스트는 [10, 9, 8, 7, 6, 5, 4, 3]입니다.

    */
public class ex03 {


    public static void main(String[] args) {
        //호출
        int start = 10;
        int end = 3;
        int[] result = solution(start, end);

        // 결과 출력
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] solution(int start_num, int end_num) {
        // start_num부터 end_num까지 1씩 감소하는 수들을 IntStream을 이용하여 배열로 생성
        int[] answer = IntStream.rangeClosed(end_num, start_num).toArray();

        return answer;
    }
}
