package com.example.codingtest.Ch01;
//20231130
//문제. 홀짝에 따라 다른 값 변환하기
/*양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을
return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.*/
public class ex02 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 예제로 n이 5일 때를 확인
        System.out.println(solution.solution(5));  // 홀수이므로 홀수의 합을 반환
        System.out.println(solution.solution(6));  // 짝수이므로 짝수의 제곱의 합을 반환
    }

    static class Solution {
        public int solution(int n) {
            if (n % 2 == 1) {
                return (n + 1) * (n + 1) / 2 / 2;
            } else {
                return 4 * n / 2 * (n / 2 + 1) * (2 * n / 2 + 1) / 6;
            }
        }
    }
}
