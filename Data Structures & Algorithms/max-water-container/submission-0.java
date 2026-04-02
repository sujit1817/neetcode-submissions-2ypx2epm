class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int currArea = 0;
        int lp = 0;
        int rp = heights.length-1;
        while(lp < rp){
            int width = rp - lp;
            int ht = Math.min(heights[lp], heights[rp]); 
            currArea = ht * width;
            maxArea = Math.max(maxArea, currArea);
            if(heights[lp] < heights[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        
        return maxArea;
    }
}
