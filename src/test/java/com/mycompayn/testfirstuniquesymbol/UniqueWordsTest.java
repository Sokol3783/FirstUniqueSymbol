package com.mycompayn.testfirstuniquesymbol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.mycompany.firstuniquesymbol.UniqueWords;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class UniqueWordsTest {

  @Test
  public void testOneWord() {
    UniqueWords uniqueWords = new UniqueWords();
    List<String> words = uniqueWords.getUniqueWords("letter");
    assertEquals(1, words.size());
    assertTrue("letter".compareTo(words.get(0)) == 0);
  }

  @Test
  public void testWordsWithoutUpperCaseOnlyUniqueWords() {
    UniqueWords uniqueWords = new UniqueWords();
    List<String> expectedWords = Arrays.asList("i", "send", "letter", "to", "my", "friends");
    List<String> words = uniqueWords.getUniqueWords("i send letter to my friend");
    assertEquals(expectedWords.size(), words.size());
    assertTrue(expectedWords.equals(words));
  }

  @Test
  public void testWordsWithoutUpperCaseWords() {
    UniqueWords uniqueWords = new UniqueWords();
    List<String> expectedWords = Arrays.asList("i", "send", "letter", "to", "my", "friend", "and", "answer","me");
    List<String> words = uniqueWords.getUniqueWords("i send letter to my friend and my friend answer to me");
    assertEquals(expectedWords.size(), words.size());
    assertTrue(expectedWords.equals(words));
  }

  @Test
  public void testWordsWithUpperCaseOnlyUniqueWords() {
    UniqueWords uniqueWords = new UniqueWords();
    List<String> expectedWords = Arrays.asList("I", "send", "letter", "to", "my", "friend", "answer","me", "My", "from", "Kiev");
    List<String> words = uniqueWords.getUniqueWords("I send letter to my friend from Kiev. My friend answer from Kiev");
    assertEquals(expectedWords.size(), words.size());
    assertTrue(expectedWords.equals(words));
  }

  @Test
  public void testWordsWithUpperCase() {
  }

}
