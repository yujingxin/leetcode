class Solution {
        public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum =0,index=0;
        for(int i = s.length()-1; i >=0 ; i--){
            int count = map.get(s.charAt(i));
            if(index <= count)
                sum += count;               
            else 
                sum -= count;           
            index = count;           
        }
        return sum;
    }
}

// using HashMap<Character,Integer>
// 'A' is Character
// "A" is String
