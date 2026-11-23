class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int n = arr.length;
        ans[n-1] = -1;
        int max = arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i] = Math.max(arr[i+1],max);
            max = Math.max(arr[i+1],max);
        }
        return ans;
    }
}