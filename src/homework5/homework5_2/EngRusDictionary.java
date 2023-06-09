package homework5.homework5_2;

import java.util.*;

public class EngRusDictionary {
    private Map<String, String> dictionary;
    private Map<String, Integer> wordCount;

    public EngRusDictionary() {
        dictionary = new HashMap<>();
        wordCount = new HashMap<>();
    }

    public void addWord(String engWord, String translate) {
        dictionary.put(engWord.toLowerCase(), translate);
        wordCount.putIfAbsent(engWord.toLowerCase(), 0);
    }

    public void updateWord(String engWord, String newEngWord) {
        if (dictionary.containsKey(engWord.toLowerCase())) {
            String translate = dictionary.get(engWord.toLowerCase());
            dictionary.remove(engWord.toLowerCase());
            wordCount.remove(engWord.toLowerCase());
            dictionary.put(newEngWord.toLowerCase(), translate);
            wordCount.put(newEngWord.toLowerCase(), 0);
        } else {
            System.out.println("This word doesn't exists");
        }
    }

    public void removeWord(String engWord) {
        if (dictionary.containsKey(engWord.toLowerCase())) {
            dictionary.remove(engWord.toLowerCase());
            wordCount.remove(engWord.toLowerCase());
        }
        else {
            System.out.println("This word doesn't exists");
        }
    }

    public void addTranslation(String engWord, String translate) {
        dictionary.putIfAbsent(engWord.toLowerCase(), translate);
        wordCount.putIfAbsent(engWord.toLowerCase(), 0);
    }

    public void updateTranslation(String engWord, String newTranslate) {
        if (dictionary.containsKey(engWord.toLowerCase())) {
            dictionary.put(engWord.toLowerCase(), newTranslate);
        } else {
            System.out.println("This word doesn't exists");
        }
    }

    public void removeTranslation(String engWord) {
        if (dictionary.containsKey(engWord.toLowerCase())) {
            dictionary.remove(engWord.toLowerCase());
            wordCount.remove(engWord.toLowerCase());
        } else {
            System.out.println("This word doesn't exists");
        }
    }

    public void showWord(String engWord) {
        System.out.println("Translate for " + engWord + ": ");
        System.out.println(dictionary.getOrDefault(engWord, "This word doesn't exists"));
    }

    public void incrementWordCount(String engWord) {
        wordCount.put(engWord.toLowerCase(), wordCount.getOrDefault(engWord.toLowerCase(), 0) + 1);
    }

    public List<String> getPopularWords() {
        List<String> popularWords = new ArrayList<>(wordCount.keySet());
        popularWords.sort((w1, w2) -> wordCount.get(w2) - wordCount.get(w1));
        return popularWords.subList(0, Math.min(10, popularWords.size()));
    }

    public List<String> getUnpopularWords() {
        List<String> unpopularWords = new ArrayList<>(wordCount.keySet());
        unpopularWords.sort((w1, w2) -> wordCount.get(w1) - wordCount.get(w2));
        return unpopularWords.subList(0, Math.min(10, unpopularWords.size()));
    }

    public Map<String, Integer> getWordCount() {
        return wordCount;
    }

}
