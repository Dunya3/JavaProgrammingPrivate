package ReturnMethodTasks;

public class FrequencyWord {
    public static void main(String[] args) {
       String sentence = "Java java java python python";
       String word = "Java";
       int frequency = frequencyOfWord(sentence,word);
        System.out.println(frequency);
    }
    public static int frequencyOfWord(String sentence,String word){
        int frequencyOfWord=0;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.contains(word)){
                frequencyOfWord++;
                sentence=sentence.replaceFirst(word, "");
            }

        }
     return frequencyOfWord;
    }
}
/*
1.Create a method named frequencyOfWord that passes two parameters:
 string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */