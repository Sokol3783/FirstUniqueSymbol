package com.mycompany.firstuniquesymbol;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

  public void main(String[] args) {
    System.out.println(getUniqueSymbol(Arrays.stream(args).collect(Collectors.joining())));
  }

  private char getUniqueSymbol(String text) {
    CollectorNonRepetitiveWords uniqueWordsCollector = new CollectorNonRepetitiveWords();
    List<String> words = uniqueWordsCollector.getUniqueWords(text);
    UniqueCharacterFinder characterFinder = new UniqueCharacterFinder();
    return characterFinder.getFirstUniqueChar(words);
  }
}
