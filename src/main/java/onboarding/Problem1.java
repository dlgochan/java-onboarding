package onboarding;

import java.util.List;

/**
 * 기능 목록
 * 1. 예외 체크
 * 2. 각 자리수의 합과 곱 구하는 함수
 * 3. 한 페이지에서 높은 점수를 구하는 함수
 * 4. 두 사람의 점수를 비교하여 결과를 반환
 */
class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if (checkException(pobi) || checkException(crong)) {
            return -1;
        }
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    /**
     * 페이지 쌍의 예외를 체크한다.
     * 
     * @param pages 펼친 페이지 쌍
     * @return 예외가 있다면 true, 없으면 false 반환
     */
    private static boolean checkException(List<Integer> pages) {
        Integer left = pages.get(0);
        Integer right = pages.get(1);
        // null check
        if (left == null || right == null)
            return true;
        // range check
        if (left >= right || left < 0 || right > 400)
            return true;
        // odd check
        if (left % 2 != 1)
            return true;
        // continuous check
        if (right - left != 1)
            return true;

        return false;
    }
}