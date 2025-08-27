class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        bruteForce(candidates, target, new ArrayList<>(), result);
        return new ArrayList<>(result);
    }

    private void bruteForce(int[] candidates, int target, List<Integer> current, Set<List<Integer>> result) {
        int sum = 0;
        for (int num : current) {
            sum += num;
        }

        if (sum == target) {
            List<Integer> temp = new ArrayList<>(current);
            Collections.sort(temp);
            result.add(temp);
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            current.add(candidates[i]);
            bruteForce(candidates, target, current, result);
            current.remove(current.size() - 1);
        }
    }
}
