class Solution {
    // Function to calculate the span of stock's price for all n days.
    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        ArrayList<Integer> v = new ArrayList<>();
        Stack<Pair<Integer, Integer>> st = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if(st.isEmpty()){
                v.add(-1);
                
            } else if(!st.isEmpty() && st.peek().getKey() > arr[i]) {
                v.add(st.peek().getValue());
                
            } else if(!st.isEmpty() && st.peek().getKey() <= arr[i]){
                
                while(!st.isEmpty() && st.peek().getKey() <= arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                  v.add(-1);
                } else{
                    v.add(st.peek().getValue());
                }
            }
            st.push(new Pair<>(arr[i], i));
        }
        
        for(int i = 0; i < arr.length; i++){
            v.set(i, i - v.get(i));
        }
        return v;
    }
}
