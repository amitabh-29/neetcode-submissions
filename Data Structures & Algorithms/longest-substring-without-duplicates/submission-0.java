class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[]=new int [256];
        int low=0;
        int high=0;
        int maxlen=0;
        while(high<s.length()){
            char ch=s.charAt(high);
            freq[ch]++;
        
        while(freq[ch]>1){
        char ch2=s.charAt(low);
        freq[ch2]--;
         low++;
        }
          maxlen=Math.max(maxlen,high-low+1);
         high++;
     
       
        }
        return maxlen;
    }
}
