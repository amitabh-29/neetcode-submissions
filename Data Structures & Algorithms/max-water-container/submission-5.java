class Solution {
    public int maxArea(int[] heights) {
//         int max=0;
// for(int i=0;i<heights.length;i++){
//             for(int j=i+1;j<heights.length;j++){

// int width=j-i;;
// int area=width*Math.min(heights[i],heights[j]);
// max=Math.max(max,area);
//             }
//         }      
//         return max;  


int i=0;
int j=heights.length-1;
int max=0;
while(i<j){
        int width=j-i;
        int area=width*Math.min(heights[i],heights[j]);
        max=Math.max(max,area);
     
    
     if(heights[i]<heights[j]){
        i++;
    }
    else{
        j--;
    }
}
return max;
    }
}
