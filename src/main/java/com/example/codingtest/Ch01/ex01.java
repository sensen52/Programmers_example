package com.example.codingtest.Ch01;

//20231129
//문제.숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 return하도록 solution 함수를 완성해주세요.

public class ex01 {
    public static void main(String[] args) {
        // Solution 클래스의 인스턴스를 생성
        Solution solution = new Solution();

        // 테스트 케이스 1
        String input1 = "10";
        int result1 = solution.solution(input1);
        System.out.println("입력: " + input1 + ", 결과: " + result1);

        // 테스트 케이스 2
        String input2 = "8542";
        int result2 = solution.solution(input2);
        System.out.println("입력: " + input2 + ", 결과: " + result2);
    }

    // Solution 클래스를 외부에 선언
    static class Solution {
        public int solution(String n_str) {
            //문자열을 정수로 변환하는 메서드
            return Integer.parseInt(n_str);
        }
    }
}
