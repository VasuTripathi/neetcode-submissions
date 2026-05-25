class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        int[] res = new int[n];

        for (int left = 0; left < n; left++) {

            for (int right = left + 1; right < n; right++) {

                if (temperatures[right] > temperatures[left]) {

                    res[left] = right - left;

                    break;
                }
            }
        }

        return res;
    }
}