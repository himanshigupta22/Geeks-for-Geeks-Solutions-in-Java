 // pair class
    static class Pair{
        int first, second;
        
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    
    public static void reverse(List<Integer> arr){
        int n = arr.size();
     
        for(int i = 0; i < n/2; i++){
            int temp = arr.get(i);
            arr.set(i, arr.get(n-i-1));
            arr.set(n-i-1, temp);
        }
    }
    
    public static List<Integer> NearestSmallestLeftIndex(int[] arr){
        List<Integer> v = new ArrayList<>();
        Stack<Pair> st = new Stack<>();
        int pseudoIndex = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(st.isEmpty()){
                v.add(pseudoIndex);
                
            } else if(!st.isEmpty() && st.peek().first < arr[i]){
                v.add(st.peek().second);
                
            } else if(!st.isEmpty() && st.peek().first >= arr[i]){
                
                while(!st.isEmpty() && st.peek().first >= arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                   v.add(pseudoIndex);
                } else {
                   v.add(st.peek().second);
                }
            }
            st.push(new Pair(arr[i], i));
        }
        return v;
    }
    
    public static List<Integer> NearestSmallestRightIndex(int[] arr){
        List<Integer> v = new ArrayList<>();
        Stack<Pair> st = new Stack<>();
        int pseudoIndex = arr.length;
        
        for(int i = arr.length-1; i >= 0; i--){
            if(st.isEmpty()){
                v.add(pseudoIndex);
                
            } else if(!st.isEmpty() && st.peek().first < arr[i]){
                v.add(st.peek().second);
                
            } else if(!st.isEmpty() && st.peek().first >= arr[i]){
                
                while(!st.isEmpty() && st.peek().first >= arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                   v.add(pseudoIndex);
                } else {
                   v.add(st.peek().second);
                }
            }
            st.push(new Pair(arr[i], i));
        }
        
        reverse(v);
        
        return v;
    }
    
    public static int getMaxArea(int arr[]) {
        // your code here
        List<Integer> left = NearestSmallestLeftIndex(arr);
        List<Integer> right = NearestSmallestRightIndex(arr);
        
        int max = 0;
        int[] width = new int[arr.length];
        int[] area = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            width[i] = right.get(i) - left.get(i) - 1;
        }
        
        for(int i = 0; i < arr.length; i++){
            area[i] = arr[i] * width[i];
        }
        
        for(int i = 0; i < arr.length; i++){
            if(max < area[i]){
                max = area[i];
            }
        }
        
        return max;
        
    }
