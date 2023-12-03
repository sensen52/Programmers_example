package com.example.codingtest.Ch01;


//20231203
//글자지우기문제) 문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서
//indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
public class ex05 {

    public static class Solution {

        public String solution(String my_string, int[] indices) {

            String answer = "";  // 결과를 저장할 빈 문자열 초기화
            String[] tmp = my_string.split("");   // 문자열을 각 문자별로 분리하여 배열로 저장


            // 주어진 indices 배열에 있는 인덱스의 글자를 제거
            for (int i = 0; i < indices.length; i++) {
                tmp[indices[i]] = "";
            }

            // 제거된 문자를 이어붙여서 결과 문자열 만들기
            for (String x : tmp) {
                answer += x;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();   // Solution 클래스의 인스턴스 생성
        String my_string = "apporoograpemmemprs"; // 주어진 문자열과 indices 배열
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

        String result = solution.solution(my_string, indices); // solution 메서드 호출하여 결과 저장
        System.out.println(result);
    }
}
