class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<12;i++){
            int res = 0;
            for(int j = 0;j<60;j++){
               int count = 0;
               int tempm = j;
                    while (tempm != 0) {
                        tempm = tempm & (tempm - 1);
                        count++;
                    }
                    int sum = 0;
                    int temph = i;
                    while(temph != 0 ){
                        temph = temph&(temph-1);
                        sum++;
                    }
                     res = count+sum;
            if(res == turnedOn){
                list.add(i+":"+String.format("%02d",j));
            }
            }
        }
        return list;
    }
}