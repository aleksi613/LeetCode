class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int horizontalMaxDifference = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);
        int verticalMaxDifference = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);

        for (int i = 0; i < horizontalCuts.length - 1; i++) {
            int hDifference = horizontalCuts[i + 1] - horizontalCuts[i];
            if (hDifference > horizontalMaxDifference) {
                horizontalMaxDifference = hDifference;
            }
        }

        for (int j = 0; j < verticalCuts.length - 1; j++) {
            int vDifference = verticalCuts[j + 1] - verticalCuts[j];
            if (vDifference > verticalMaxDifference) {
                verticalMaxDifference = vDifference;
            }
        }

        long maxArea = (long) horizontalMaxDifference * verticalMaxDifference;
        return (int) (maxArea % 1_000_000_007);
    }
}
