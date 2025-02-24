class Solution {
    public int equalPairs(int[][] grid) {
        
        Map<List<Integer>, Integer> rows = new HashMap<>();
        Map<List<Integer>, Integer> columns = new HashMap<>();
        int n = grid.length;
        int count = 0;

        for (int[] row : grid) {
            List<Integer> rowList = new ArrayList<>();
            for (int num : row) {
                rowList.add(num);
            }
            rows.put(rowList, rows.getOrDefault(rowList, 0) + 1);
        }

        for (int j = 0; j < n; j++) {
            List<Integer> colList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                colList.add(grid[i][j]);
            }
            columns.put(colList, columns.getOrDefault(colList, 0) + 1);
        }

        for (List<Integer> key : rows.keySet()) {
            if (columns.containsKey(key)) {
                count += rows.get(key) * columns.get(key);
            }
        }

        return count;
    }
}