package com.mycompany.firstuniquesymbol;

import java.util.Scanner;

public class App {

  public void main(String[] args) {
    System.out.println("Enter the text:");
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()){
      if (scanner.hasNextLine()) {
        System.out.println(getUniqueSymbol(scanner.nextLine()));
      }
    }
  }

  private char getUniqueSymbol(String text) {


    return '1';
  }
}
