package com.mycompany.firstuniquesymbol;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class UniqueCharacterFinderTest {
  @Test
  public void uniqueCharInWordSingleSymbol(){
    UniqueCharacterFinder myChar = new UniqueCharacterFinder();
    List<String> words = Arrays.asList("I");
    assertEquals('I', myChar.getFirstUniqueChar(words));
  }

  @Test
  public void noUniqueCharInWord(){
    UniqueCharacterFinder myChar = new UniqueCharacterFinder();
    List<String> words = Arrays.asList("mama");
    assertEquals(' ', myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInWord(){
    UniqueCharacterFinder myChar = new UniqueCharacterFinder();
    List<String> words = Arrays.asList("friend");
    assertEquals('f', myChar.getFirstUniqueChar(words));
  }

  @Test
  public void noUniqueCharInTwoWords(){
    UniqueCharacterFinder myChar = new UniqueCharacterFinder();
    List<String> words = Arrays.asList("friend","field");
    assertEquals(' ', myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInThreeWords(){
    UniqueCharacterFinder myChar = new UniqueCharacterFinder();
    List<String> words = Arrays.asList("friend", "field", "answer");
    assertEquals('a', myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInFourWords(){
    UniqueCharacterFinder myChar = new UniqueCharacterFinder();
    List<String> words = Arrays.asList("friend", "field", "fifi", "answer");
    assertEquals('a', myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInFiveWords(){
    UniqueCharacterFinder myChar = new UniqueCharacterFinder();
    List<String> words = Arrays.asList("pineapple","promise", "friend","fill", "field", "fifi", "answer");
    assertEquals('i', myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInSentence(){
    UniqueCharacterFinder myChar = new UniqueCharacterFinder();
    List<String> words = Arrays.asList("Your", "should", "get", "pineapple","from", "table");
    assertEquals('Y', myChar.getFirstUniqueChar(words));
  }

  @Test
  public void uniqueCharInTwoSentence(){
    UniqueCharacterFinder myChar = new UniqueCharacterFinder();
    List<String> words = Arrays.asList("Your", "should", "get", "pineapple","from", "table",
        "You", "have", "to", "be", "careful");
    assertEquals('s', myChar.getFirstUniqueChar(words));
  }

}