package com.developer.algorithm.string;

import java.time.Duration;
import java.time.Instant;
import java.util.Hashtable;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueCharacterString {
    public static void main(String ... args){
        int index = findIndexFirstUniqueCharacter("Carlos");
        System.out.println("The first unique character in Carlos is at the position: " +index);

        index = findIndexFirstUniqueCharacter("CarlosC");
        System.out.println("The first unique character in CarlosC is at the position: " +index);

        index = findIndexFirstUniqueCharacter("CarCar");
        System.out.println("The first unique character in CarCar is at the position: " +index);

        index = findIndexFirstUniqueCharacter("CarloCarlos");
        System.out.println("The first unique character in CarloCarlos is at the position: " +index);

    }

    private static int findIndexFirstUniqueCharacter(String s) {
        if(Optional.of(s).isPresent()){

        for (int i = 0; i <s.length() ; i++) {
            char letter =  s.charAt(i);
            int count= 0;
            for (int j = 0; j <s.length() ; j++) {
                if(letter == s.charAt(j)){
                    count++;
                }
               }
            if(count==1){
              return i;
            }
        }
        }
     return -1;
   }

}
