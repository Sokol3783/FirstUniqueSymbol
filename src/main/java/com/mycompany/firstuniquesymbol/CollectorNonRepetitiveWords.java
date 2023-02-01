package com.mycompany.firstuniquesymbol;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorNonRepetitiveWords {

  //get only unique words with keeping order
  public List<String> getUniqueWords(String text) {
    String[] words = text.replaceAll("[^a-zA-Z ]", "").split(" ");
    Map<String, Integer> countedWords = countWords(words);
    return filterWords(countedWords);
  }

  private List<String> filterWords(Map<String, Integer> countedWords) {
    return countedWords.entrySet().stream().filter(s -> s.getValue() == 1).map(Entry::getKey).collect(
        Collectors.toList());
  }

  private Map<String, Integer> countWords(String[] words) {
    return Arrays.stream(words)
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.summingInt(e -> 1)));
  }
}
