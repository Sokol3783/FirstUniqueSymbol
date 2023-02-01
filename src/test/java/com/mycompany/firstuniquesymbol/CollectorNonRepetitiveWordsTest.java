package com.mycompany.firstuniquesymbol;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CollectorNonRepetitiveWordsTest {

  @Test
  public void testOneWord() {
    CollectorNonRepetitiveWords uniqueWords = new CollectorNonRepetitiveWords();
    List<String> words = uniqueWords.getUniqueWords("letter");
    assertEquals(1, words.size());
    assertEquals(0, "letter".compareTo(words.get(0)));
  }

  @Test
  public void testWordsWithoutUpperCaseOnlyUniqueWords() {
    CollectorNonRepetitiveWords uniqueWords = new CollectorNonRepetitiveWords();
    List<String> expectedWords = Arrays.asList("i", "send", "letter", "to", "my", "friend");
    List<String> words = uniqueWords.getUniqueWords("i send letter to my friend");
    assertEquals(expectedWords.size(), words.size());
    assertEquals(expectedWords, words);
  }

  @Test
  public void testWordsWithoutUpperCaseWords() {
    CollectorNonRepetitiveWords uniqueWords = new CollectorNonRepetitiveWords();
    List<String> expectedWords = Arrays.asList("i", "send", "letter", "and", "answer","me");
    List<String> words = uniqueWords.getUniqueWords("i send letter to my friend and my friend answer to me");
    assertEquals(expectedWords.size(), words.size());
    assertEquals(expectedWords, words);
  }

  @Test
  public void testWordsWithUpperCaseOnlyUniqueWords() {
    CollectorNonRepetitiveWords uniqueWords = new CollectorNonRepetitiveWords();
    List<String> expectedWords = Arrays.asList("I", "send", "letter", "to", "my","Kiev","My", "answer","me",  "Maroko");
    List<String> words = uniqueWords.getUniqueWords("I send letter to my friend from Kiev. My friend answer me from Maroko");
    assertEquals(expectedWords.size(), words.size());
    assertEquals(expectedWords, words);
  }

  @Test
  public void testWordsWithUpperCase() {
    CollectorNonRepetitiveWords uniqueWords = new CollectorNonRepetitiveWords();
    List<String> expectedWords = Arrays.asList("I", "send", "letter", "to", "my", "My","answer", "me");
    List<String> words = uniqueWords.getUniqueWords("I send letter to my friend from Kiev. My friend answer me from Kiev");
    assertEquals(expectedWords.size(), words.size());
    assertEquals(expectedWords, words);
  }

}
