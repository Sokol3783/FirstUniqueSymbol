package com.mycompany.firstuniquesymbol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueWords {

  public List<String> getUniqueWords(String text) {
    String[] s = String.format(text, "[^a-zA-Z ]").split(" ");
    return Arrays.stream(s).distinct().collect(Collectors.toList());
  }
}
