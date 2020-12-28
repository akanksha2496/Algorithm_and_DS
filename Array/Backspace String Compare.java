class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        Stack<Character> sStack = new Stack<>();
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='#') {
                sStack.push(S.charAt(i));
            }else if(!sStack.isEmpty()) {
                sStack.pop();
            }
        }
        
        Stack<Character> tStack = new Stack<>();
        
        for(int i=0;i<T.length();i++){
            if(T.charAt(i)!='#') {
                tStack.push(T.charAt(i));
            }else if(!tStack.isEmpty()) {
                tStack.pop();
            }
        }
        
        while(!sStack.isEmpty()) {
            char current = sStack.pop();
            if(tStack.isEmpty() || current != tStack.pop()){
                return false;
            }
        }
        
        return sStack.isEmpty() && tStack.isEmpty();
        
    }
}
