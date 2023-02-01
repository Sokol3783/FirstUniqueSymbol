package com.mycompany.firstuniquesymbol;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueChars {

  //return message of result finding
  public String getFirstUniqueChar(List<String> words){
    List<Character> allUniqueChars = getAllUniqueChars(words);
    Optional<Character> first = allUniqueChars.stream().collect(
            Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                Collectors.summingInt(e -> 1)))
        .entrySet().stream().filter(s -> s.getValue() > 0)
        .filter(s -> s.getKey().compareTo(' ') != 0)
        .map(s -> s.getKey()).findFirst();
    if (first.isPresent()) {
      return "Unique char -> '" + first.get() + "'";
    }
    return "There are no unique char";
  }

  private List<Character> getAllUniqueChars(List<String> words) {
    return words.stream().map( s -> {
      for (int i = 0; i < s.length(); i++) {
        if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
          return s.charAt(i);
        }
      }
      return ' ';
    }).collect(Collectors.toList());
  }

}
