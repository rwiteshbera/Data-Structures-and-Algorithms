package rwitesh.string;
/*Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
(eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)*/

public class CheckForRotation {
    static boolean rotateString(String s, String goal)
    {
        if (s.length()!=goal.length()) return false;
        s = s.concat(s);
        if (!s.contains(goal))
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }
}
