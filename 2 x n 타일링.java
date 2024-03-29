// 가로 길이가 2이고 세로의 길이가 1인 직사각형모양의 타일이 있습니다. 
// 이 직사각형 타일을 이용하여 세로의 길이가 2이고 가로의 길이가 n인 바닥을 가득 채우려고 합니다.
// 타일을 채울 때는 다음과 같이 2가지 방법이 있습니다.

// - 타일을 가로로 배치 하는 경우
// - 타일을 세로로 배치 하는 경우
// 직사각형의 가로의 길이 n이 매개변수로 주어질 때, 이 직사각형을 채우는 방법의 수를 return 하는 solution 함수를 완성해주세요.

// DP 기초 문제, DP는 이해하고 나면 쉬울텐데.!

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        answer = dp[n];
        return answer;
    }
}
