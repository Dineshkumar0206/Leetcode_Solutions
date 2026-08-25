class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for( String s : operations)
        {
           if(s.matches("-?\\d+")){
                stack.push(Integer.parseInt(s));
            }
            else if(s.equals("C"))
            {
               stack.pop();
            }
            else if(s.equals("D"))
            {
                stack.push(stack.peek() * 2);
            }
           else if(s.equals("+"))
            {
                int top1 = stack.pop();
                int top2 = stack.peek(); 

                int newScore = top1 + top2;
    
                stack.push(top1); 
                stack.push(newScore); 
            }
        }
        int sum = 0 ;
        for(int i : stack)
        {
            sum += i;
        }
        return sum ;
    }
}