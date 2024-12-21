

class GfG
{
    int minEle;
    Stack<Integer> s;
    Stack<Integer> ss;
    
    
    // Constructor    
    GfG()
	{
      s = new Stack<>();
      ss = new Stack<>();
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	    if(ss.isEmpty()){
	        return -1;
	    }
	    return ss.peek();
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	  if(ss.isEmpty()){
	        return -1;
	   }
	   int ans = s.peek();
	   if(ans == ss.peek()){
	       ss.pop();
	   }
	   s.pop();
	   return ans;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here	
	    s.push(x);
	    
	    if(ss.isEmpty() || x <= ss.peek()){
	        ss.push(x);
	    }
    }	
}
