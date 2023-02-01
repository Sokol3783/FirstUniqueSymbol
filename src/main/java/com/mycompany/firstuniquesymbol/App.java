package com.mycompany.firstuniquesymbol;

import java.util.List;

public class App {

  public void main(String[] args) {
    System.out.println(getUniqueSymbol(args.toString()));
  }

  private char getUniqueSymbol(String text) {
    CollectorNonRepetitiveWords uniqueWordsCollector = new CollectorNonRepetitiveWords();
    List<String> words = uniqueWordsCollector.getUniqueWords(text);
    UniqueCharacterFinder characterFinder = new UniqueCharacterFinder();
    return characterFinder.getFirstUniqueChar(words);
  }
}
