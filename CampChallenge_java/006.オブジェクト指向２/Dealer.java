/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author guest1Day
 */
public class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<Integer>();

    //初期処理
    public Dealer() {

        //すべてのトランプを持たせる
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 13; i++) {
                if (i >= 10) {
                    //10以上だった時にcardsに10を追加
                    cards.add(10);
                } else {
                    cards.add(i);
                }

            }
        }
        Collections.shuffle(cards);
    }

    //dealメソッド
    ArrayList deal() {

        ArrayList<Integer> set = new ArrayList();

        for (int i = 0; i <= 1; i++) {

            //cardsの一番上からとる    
            cards.get(0);
            //それをsetに追加する
            set.add(cards.get(0));

            //山札から１番上を消す
            cards.remove(0);
        }

        return set;

    }

    //hitメソッド
    ArrayList hit() {

        ArrayList<Integer> set = new ArrayList();

        cards.get(0);
        set.add(cards.get(0));

        cards.remove(0);

        return set;

    }

    public ArrayList setCard(ArrayList set) {

        for (int i = 0; i < set.size(); i++) {

            //mycardsに引数setを追加
            Integer num = (Integer) set.get(i);
            myCards.add(num);

        }
            return myCards;
    }

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
