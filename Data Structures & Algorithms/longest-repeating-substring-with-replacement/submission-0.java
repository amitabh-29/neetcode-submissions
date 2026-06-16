class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int [10001];
        int low=0;
        int high=0;
        int maxlen=0;
        int maxfreq=0;
        while(high<s.length()){
            char ch=s.charAt(high);
            freq[ch-'A']++;
            maxfreq=Math.max(maxfreq,freq[ch-'A']);
while((high-low+1)-maxfreq >k){
    char ch2=s.charAt(low);
    freq[ch2-'A']--;
    low++;
}
maxlen=Math.max(maxlen,(high-low+1));
            high++;
        }
return maxlen;
    }
}
