class Solution {
    public boolean sumGame(String num) {
        char[] c = num.toCharArray();
        int d=0, q=0;
        for(int i=0; i<c.length/2; i++){
            if(c[i]=='?')q++;
            else d-=c[i]-'0';
        }
        for(int i=c.length/2; i<c.length; i++){
            if(c[i]=='?'){d+=9; q++;}
            else d+=c[i]-'0';
        }
        if(q%2==1)return true;
        if(q==0)return d!=0;
        return d!=(q/2)*9;
    }
}