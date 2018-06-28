package WrapSeq;

import java.util.ArrayList;

public class SeqStart extends Methods {
    public static void main(String[] args) {
        ArrayList<Integer> workArr = wordToArrToInt(readWord());

      while(!workArr.isEmpty()) {
          if (firstCheck(workArr) == false) {
              if(checkSize(workArr) == true) {
                 workArr.clear();
              } else {
                  deleteFirstSeq(workArr);
                  if(checkSize(helpArr) == false){
                      System.out.print(helpArr.get(0) + "-" + helpArr.get(helpArr.size() - 1)+
                                                                        lastCheck(helpArr.get(helpArr.size() - 1)));
                  }
               helpArr.clear(); }
          } else {workArr.clear();}
      }
    }
}

