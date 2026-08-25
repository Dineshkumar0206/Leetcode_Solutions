class Solution {
    public int calPoints(String[] operations) {
        int[]scores=new int[operations.length];
        int top=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                top--;
            }
            else if(operations[i].equals("D")){
                scores[top]=scores[top-1]*2;
                top++;
            }
            else if(operations[i].equals("+")) {
                scores[top]=scores[top-1]+scores[top-2];
                top++;
            }
            else {
                scores[top]=Integer.parseInt(operations[i]);
                top++;
            }

        }
        int sum=0;
        for(int i=0;i<top;i++){
            sum+=scores[i];

        }
        return sum;
    }
}