package com.thoughtworks;

import org.omg.Dynamic.Parameter;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public List<String> start(int count) {   //传入初始值
        for (int i = 1; i <=count; i++) {
        if(!fizz_when_have_3(i).equals("-1"))
        {
            results.add(fizz_when_have_3(i));
        }
        else if(!when_multiplier_of_35_37_357(i).equals("-1"))
        {
            results.add(when_multiplier_of_35_37_357(i));
        } else if (!when_multiplier_of_3_5_7(i).equals("-1")) {
            results.add(when_multiplier_of_3_5_7(i));
        }
        else {
            results.add(i+"");
        }
      }
      return results;
    }

    public  String fizz_when_have_3(int number) {   //包含3的
        String result="-1";
        if((number+"").contains("3"))
        {
            result ="Fizz";
        }
            return result;
    }

    public String when_multiplier_of_35_37_357(int number) {
        String result="-1";
      if(number%3==0&&number%5==0&&number%7==0)
      {
          result="FizzBuzzWhizz";
      }
      else if (number % 3 == 0 && number % 5 == 0) {
          result="FizzBuzz";
      } else if (number%5==0&&number%7==0) {
          result="BuzzWhizz";
      } else if (number%3==0&&number%7==0) {
          result="FizzWhizz";
      }
      return result;
    }

    public String when_multiplier_of_3_5_7(int number) {
         String result="-1";
        if(number%3==0)
        {
            result="Fizz";
        }
        if (number%5==0)
        {
            result="Buzz";
        }
        if (number%7==0)
        {
            result="Whizz";
        }
        return result;
    }

    public List<String> getResults() { //返回结果
        return results;
    }

}


