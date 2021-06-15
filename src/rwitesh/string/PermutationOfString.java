package rwitesh.string;

//Time Complexity ; O(N*N)
public class PermutationOfString {
    static String Swap(String s, int l, int r){
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[l];
        charArray[l] = charArray[r];
        charArray[r] = temp;
        return String.valueOf(charArray);
    }
    static void findPermutation(String s,int l, int r){
        if(l==r){ System.out.println(s);}
        else {
            for (int i = l; i <= r; i++) {
                s = Swap(s,l,i);
                findPermutation(s,l+1,r);
                s = Swap(s,l,i);
            }
        }
    }
    public static void main(String[] args) {
        String st = "abc";
        findPermutation(st,0,st.length()-1);
    }
}
