class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*")
                && !tokens[i].equals("/"))
                
            {
                st.push(Integer.parseInt(tokens[i]));
            }else {
                int d2 = st.pop();
                int d1 = st.pop();

                int res = 0;
                if (tokens[i].equals("+")) {
                    res = d1 + d2;
                }

                else if (tokens[i].equals("-")) {
                    res = d1 - d2;
                }

                else if (tokens[i].equals("*")) {
                    res = d1 * d2;
                }

                else if (tokens[i].equals("/")) {
                    res = d1 / d2;
                }

                st.push(res);
            }
        }
        return st.pop();
    }
}
