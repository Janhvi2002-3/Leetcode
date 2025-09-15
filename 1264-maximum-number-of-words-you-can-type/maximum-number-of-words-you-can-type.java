class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String [] word = text.split(" ");
        for(String words : word){
            boolean  type = true;
       
        for(char texting : words.toCharArray()){
            if(brokenLetters.indexOf(texting)!= -1){
                type = false;
                break ;
            }
        }
           if(type){
             count ++;
           }
        
        } 
        return count ;
    }
}