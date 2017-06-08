/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java;

import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
public class User extends Human {
    //mycardsにいれる

    public ArrayList setCard(ArrayList set) {

        for (int i = 0; i < set.size(); i++) {

            //mycardsに引数setを追加
            Integer num = (Integer) set.get(i);
            myCards.add(num);

        }
        return myCards;
    }

//        public ArrayList setCard(ArrayList set) {
//
//        for (int i = 0; i < set.size(); i++) {
//
//            //mycardsに引数setを追加
//            myCards.add(set.get(i));
//
//        }
//            return myCards;
//    }
    public Integer open() {

        int sum = 0;

        for (int i = 0; i < myCards.size(); i++) {
            sum += myCards.get(i);

        }
        return sum;

    }

    public boolean checksum() {
        //手札を確認してまだカードが必要かどうか
        if (open() <= 16) {
            return true;
        } else {
            return false;
        }

    }

}
