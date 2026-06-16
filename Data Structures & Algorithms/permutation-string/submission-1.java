class Solution {
    // import java.util.Arrays;
    public boolean checkInclusion(String s1, String s2) {
        // int freq[]=new int [26];
        int low=0;
        int high=0;
        int freq1[]=new int [26];
        int freq2[]=new int [26];
        while(high<s1.length()){
            char ch=s1.charAt(high);
            freq1[ch-'a']++;
            high++;
        }
        high=0;
        while(high<s2.length()){
            char ch2=s2.charAt(high);
            freq2[ch2-'a']++;
            if((high-low+1)>s1.length()){
                char ch3=s2.charAt(low);
                freq2[ch3-'a']--;
                low++;
            }
high++;
if(java.util.Arrays.equals(freq1,freq2)){
    return true;
}
        }
        
        return false;
    }
}
