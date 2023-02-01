package com.mycompany.firstuniquesymbol;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class UniqueCharsTest {
  @Test
  public void uniqueCharInWordSingleSymbol(){
    UniqueChars myChar = new UniqueChars();
    List<String> words = Arrays.asList("I");
    assertEquals("Unique char -> 'I'", myChar.getFirstUniqueChar(words));
  }

  @Test
  public void noUniqueCharInWord(){
    UniqueChars myChar = new UniqueChars();
    List<String> words = Arrays.asList("mama");
    assertEquals("There are no unique char", myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInWord(){
    UniqueChars myChar = new UniqueChars();
    List<String> words = Arrays.asList("friend");
    assertEquals("Unique char -> 'I'", myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInTwoWords(){
    UniqueChars myChar = new UniqueChars();
    List<String> words = Arrays.asList("friend","field");
    assertEquals("Unique char -> 'a'", myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInThreeWords(){
    UniqueChars myChar = new UniqueChars();
    List<String> words = Arrays.asList("friend", "field", "fifi", "answer");
    assertEquals("There are no unique char", myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInFourWords(){
    UniqueChars myChar = new UniqueChars();
    List<String> words = Arrays.asList("friend", "field", "fifi", "answer");
    assertEquals("Unique char -> 'a'", myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInFiveWords(){
    UniqueChars myChar = new UniqueChars();
    List<String> words = Arrays.asList("pineapple","promise", "friend","fill", "field", "fifi", "answer");
    assertEquals("Unique char -> 'p'", myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInSentence(){
    UniqueChars myChar = new UniqueChars();
    List<String> words = Arrays.asList("Your", "should", "get", "pineapple","from", "table");
    assertEquals("Unique char -> 'Y'", myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInTwoSentence(){
    UniqueChars myChar = new UniqueChars();
    List<String> words = Arrays.asList("Your", "should", "get", "pineapple","from", "table",
        "You", "have", "to", "be", "careful");
    assertEquals("Unique char -> 's'", myChar.getFirstUniqueChar(words));
  }

}