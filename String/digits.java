//https://www.youtube.com/watch?v=imD5XeNaJXA
class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> l=new LinkedList<String>();
      
        if(digits.length()==0)
            return l;
         l.add("");
        String[] map={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0;i<digits.length();i++)
        {
            int index=Character.getNumericValue(digits.charAt(i));
            while(l.peek().length()==i)
            {
                String permut=l.remove();
                for(char c:map[index].toCharArray())
                {
                    l.add(permut+c);
                }
            }
        }
        return l;
    }
}
