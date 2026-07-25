class Solution {

    public String reverseWords(String s) {

      
        s = s.trim().replaceAll("\\s+", " ");

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < sb.length()) {

            StringBuilder word = new StringBuilder();

         
            while (i < sb.length() && sb.charAt(i) != ' ') {
                word.append(sb.charAt(i));
                i++;
            }

            word.reverse();

            if (ans.length() > 0) {
                ans.append(" ");
            }

            ans.append(word);

            i++;
        }

        return ans.toString();
    }
}