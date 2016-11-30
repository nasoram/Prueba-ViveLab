/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivelabprueba;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Nelson Sora
 */
public class ViveLabPrueba {

    static boolean validNumber = false;
    static ArrayList<String> singleWords = null;
    
    public static boolean verifyNumber( String text ){
        
        String[] validWords = {
                    "zero","one","two","three","four","five","six","seven","eight","nine","ten",
                    "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
                    "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety",
                    "hundred","thousand","million","billion","trillion",
        };
        
        ArrayList<String> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(validWords));
        
          if ( text != null && text.length() > 0 ){
          
            text = text.replace("-", " ");
            text = text.toLowerCase();
            text = text.replace(" and", " ");
            text = text.replace(" and ", " ");
            text = text.replace("  "," ");
            String[] pieces = text.trim().split(" ");

            for( String word: pieces ){

                if( !numbers.contains( word )){
                    validNumber = false;
                    break;
                }else validNumber = true;
            }

            singleWords = new ArrayList<>();
            singleWords.addAll(Arrays.asList(pieces));

          }
        return validNumber;  
    }
    
    public static ArrayList<String> pivot(){
        return singleWords;
    }
    
    public static long translate( ArrayList<String> numbers ){
        
        long result = 0;
        long mergedNumbers = 0;

        if( validNumber ){
            
            for( String number: numbers ){
                
                switch (number) {
                    case "zero":
                        result += 0;
                        break;
                    case "one":
                        result += 1;
                        break;
                    case "two":
                        result += 2;
                        break;
                    case "three":
                        result += 3;
                        break;
                    case "four":
                        result += 4;
                        break;
                    case "five":
                        result += 5;
                        break;
                    case "six":
                        result += 6;
                        break;
                    case "seven":
                        result += 7;
                        break;
                    case "eight":
                        result += 8;
                        break;
                    case "nine":
                        result += 9;
                        break;
                    case "ten":
                        result += 10;
                        break;
                    case "eleven":
                        result += 11;
                        break;
                    case "twelve":
                        result += 12;
                        break;
                    case "thirteen":
                        result += 13;
                        break;
                    case "fourteen":
                        result += 14;
                        break;
                    case "fifteen":
                        result += 15;
                        break;
                    case "sixteen":
                        result += 16;
                        break;
                    case "seventeen":
                        result += 17;
                        break;
                    case "eighteen":
                        result += 18;
                        break;
                    case "nineteen":
                        result += 19;
                        break;
                    case "twenty":
                        result += 20;
                        break;
                    case "thirty":
                        result += 30;
                        break;
                    case "forty":
                        result += 40;
                        break;
                    case "fifty":
                        result += 50;
                        break;
                    case "sixty":
                        result += 60;
                        break;
                    case "seventy":
                        result += 70;
                        break;
                    case "eighty":
                        result += 80;
                        break;
                    case "ninety":
                        result += 90;
                        break;
                    case "hundred":
                        result *= 100;
                        break;
                    case "thousand":
                        result *= 1000;
                        mergedNumbers += result;
                        result = 0;
                        break;
                    case "million":
                        result *= 1000000;
                        mergedNumbers += result;
                        result = 0;
                        break;
                    case "billion":
                        result *= 1000000000;
                        mergedNumbers += result;
                        result = 0;
                        break;
                    case "trillion":
                        result *= 1000000000000L;
                        mergedNumbers += result;
                        result = 0;
                        break;
                    default:
                        break;
                }
            }
            
            mergedNumbers += result;
            return mergedNumbers;
        
        }
        return 0;
    }
    
}
