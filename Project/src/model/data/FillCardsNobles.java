/**
 * Main class: client/Main.java
 * Class: FillCardNobles.java
 */

package model.data;

import model.implementations.CardImpl;
import model.implementations.NobleImpl;

import java.util.ArrayList;

public class FillCardsNobles {
    public ArrayList<CardImpl> getDot1Cards(){
        ArrayList<CardImpl> retVal = new ArrayList<CardImpl>();

        //Black Cards
        retVal.add(new CardImpl(0, new int[]{1,1,1,0,1}, 'O'));
        retVal.add(new CardImpl(0, new int[]{0,1,2,0,0}, 'O'));
        retVal.add(new CardImpl(0, new int[]{2,0,2,0,0}, 'O'));
        retVal.add(new CardImpl(0, new int[]{0,3,1,1,0}, 'O'));
        retVal.add(new CardImpl(0, new int[]{0,0,3,0,0}, 'O'));
        retVal.add(new CardImpl(0, new int[]{1,1,1,0,2}, 'O'));
        retVal.add(new CardImpl(0, new int[]{2,1,0,0,2}, 'O'));
        retVal.add(new CardImpl(1, new int[]{0,0,0,0,4}, 'O'));

        //Blue Cards
        retVal.add(new CardImpl(0, new int[]{1,0,0,2,0}, 'B'));
        retVal.add(new CardImpl(0, new int[]{1,2,1,1,0}, 'B'));
        retVal.add(new CardImpl(0, new int[]{1,1,1,1,0}, 'B'));
        retVal.add(new CardImpl(0, new int[]{0,1,3,0,1}, 'B'));
        retVal.add(new CardImpl(0, new int[]{0,0,0,3,0}, 'B'));
        retVal.add(new CardImpl(0, new int[]{1,2,2,0,0}, 'B'));
        retVal.add(new CardImpl(0, new int[]{0,0,2,2,0}, 'B'));
        retVal.add(new CardImpl(1, new int[]{0,4,0,0,0}, 'B'));

        //Green Cards
        retVal.add(new CardImpl(0, new int[]{2,0,0,0,1}, 'G'));
        retVal.add(new CardImpl(0, new int[]{0,2,0,0,2}, 'G'));
        retVal.add(new CardImpl(0, new int[]{1,0,1,0,3}, 'G'));
        retVal.add(new CardImpl(0, new int[]{1,1,0,1,1}, 'G'));
        retVal.add(new CardImpl(0, new int[]{1,1,0,2,1}, 'G'));
        retVal.add(new CardImpl(0, new int[]{0,2,0,2,1}, 'G'));
        retVal.add(new CardImpl(0, new int[]{0,3,0,0,0}, 'G'));
        retVal.add(new CardImpl(1, new int[]{0,0,0,4,0}, 'G'));

        //Red Cards
        retVal.add(new CardImpl(0, new int[]{3,0,0,0,0}, 'R'));
        retVal.add(new CardImpl(0, new int[]{1,1,0,3,0}, 'R'));
        retVal.add(new CardImpl(0, new int[]{0,0,1,0,2}, 'R'));
        retVal.add(new CardImpl(0, new int[]{2,0,1,2,0}, 'R'));
        retVal.add(new CardImpl(0, new int[]{2,0,1,1,1}, 'R'));
        retVal.add(new CardImpl(0, new int[]{1,0,1,1,1}, 'R'));
        retVal.add(new CardImpl(0, new int[]{2,2,0,0,0}, 'R'));
        retVal.add(new CardImpl(1, new int[]{4,0,0,0,0}, 'R'));

        //White Cards
        retVal.add(new CardImpl(0, new int[]{0,0,2,1,2}, 'W'));
        retVal.add(new CardImpl(0, new int[]{0,2,0,1,0}, 'W'));
        retVal.add(new CardImpl(0, new int[]{0,1,1,1,1}, 'W'));
        retVal.add(new CardImpl(0, new int[]{0,0,0,0,3}, 'W'));
        retVal.add(new CardImpl(0, new int[]{0,0,2,0,2}, 'W'));
        retVal.add(new CardImpl(0, new int[]{0,1,2,1,1}, 'W'));
        retVal.add(new CardImpl(0, new int[]{3,0,0,1,1}, 'W'));
        retVal.add(new CardImpl(1, new int[]{0,0,4,0,0}, 'W'));

        return retVal;
    }

    public ArrayList<CardImpl> getDot2Cards(){
        ArrayList<CardImpl> retVal = new ArrayList<CardImpl>();

        //Black Cards
        retVal.add(new CardImpl(1, new int[]{3,0,2,0,2}, 'O'));
        retVal.add(new CardImpl(1, new int[]{3,0,3,2,0}, 'O'));
        retVal.add(new CardImpl(2, new int[]{0,2,4,0,1}, 'O'));
        retVal.add(new CardImpl(2, new int[]{5,0,0,0,0}, 'O'));
        retVal.add(new CardImpl(2, new int[]{0,3,5,0,0}, 'O'));
        retVal.add(new CardImpl(3, new int[]{0,0,0,6,0}, 'O'));

        //Blue Cards
        retVal.add(new CardImpl(1, new int[]{0,3,2,0,2}, 'B'));
        retVal.add(new CardImpl(1, new int[]{0,0,3,3,2}, 'B'));
        retVal.add(new CardImpl(2, new int[]{5,0,0,0,3}, 'B'));
        retVal.add(new CardImpl(2, new int[]{0,0,0,0,5}, 'B'));
        retVal.add(new CardImpl(2, new int[]{2,1,0,4,0}, 'B'));
        retVal.add(new CardImpl(3, new int[]{0,0,0,0,6}, 'B'));

        //Green Cards
        retVal.add(new CardImpl(1, new int[]{3,3,2,0,0}, 'G'));
        retVal.add(new CardImpl(1, new int[]{2,0,0,2,3}, 'G'));
        retVal.add(new CardImpl(2, new int[]{4,0,0,1,2}, 'G'));
        retVal.add(new CardImpl(2, new int[]{0,0,5,0,0}, 'G'));
        retVal.add(new CardImpl(2, new int[]{0,0,3,0,5}, 'G'));
        retVal.add(new CardImpl(3, new int[]{0,0,6,0,0}, 'G'));

        //Red Cards
        retVal.add(new CardImpl(1, new int[]{0,2,0,3,3}, 'R'));
        retVal.add(new CardImpl(1, new int[]{2,2,0,3,0}, 'R'));
        retVal.add(new CardImpl(2, new int[]{1,0,2,0,4}, 'R'));
        retVal.add(new CardImpl(2, new int[]{3,0,0,5,0}, 'R'));
        retVal.add(new CardImpl(2, new int[]{0,0,0,5,0}, 'R'));
        retVal.add(new CardImpl(3, new int[]{0,6,0,0,0}, 'R'));

        //White Cards
        retVal.add(new CardImpl(1, new int[]{0,2,3,2,0}, 'W'));
        retVal.add(new CardImpl(1, new int[]{2,3,0,0,3}, 'W'));
        retVal.add(new CardImpl(2, new int[]{0,4,1,2,0}, 'W'));
        retVal.add(new CardImpl(2, new int[]{0,5,0,0,0}, 'W'));
        retVal.add(new CardImpl(2, new int[]{0,5,0,3,0}, 'W'));
        retVal.add(new CardImpl(3, new int[]{6,0,0,0,0}, 'W'));

        return retVal;
    }

    public ArrayList<CardImpl> getDot3Cards(){
        ArrayList<CardImpl> retVal = new ArrayList<CardImpl>();

        //Black Cards
        retVal.add(new CardImpl(3, new int[]{3,3,5,0,3}, 'O'));
        retVal.add(new CardImpl(4, new int[]{0,7,0,0,0}, 'O'));
        retVal.add(new CardImpl(4, new int[]{0,6,3,3,0}, 'O'));
        retVal.add(new CardImpl(5, new int[]{0,7,0,3,0}, 'O'));

        //Blue Cards
        retVal.add(new CardImpl(3, new int[]{3,3,3,5,0}, 'B'));
        retVal.add(new CardImpl(4, new int[]{7,0,0,0,0}, 'B'));
        retVal.add(new CardImpl(4, new int[]{6,0,0,3,3}, 'B'));
        retVal.add(new CardImpl(5, new int[]{7,0,0,0,3}, 'B'));

        //Green Cards
        retVal.add(new CardImpl(3, new int[]{5,3,0,3,3}, 'G'));
        retVal.add(new CardImpl(4, new int[]{3,0,3,0,6}, 'G'));
        retVal.add(new CardImpl(4, new int[]{0,0,0,0,7}, 'G'));
        retVal.add(new CardImpl(5, new int[]{0,0,3,0,7}, 'G'));

        //Red Cards
        retVal.add(new CardImpl(3, new int[]{3,0,3,3,5}, 'R'));
        retVal.add(new CardImpl(4, new int[]{0,0,7,0,0}, 'R'));
        retVal.add(new CardImpl(4, new int[]{0,3,6,0,3}, 'R'));
        retVal.add(new CardImpl(5, new int[]{0,3,7,0,0}, 'R'));

        //White Cards
        retVal.add(new CardImpl(3, new int[]{0,5,3,3,3}, 'W'));
        retVal.add(new CardImpl(4, new int[]{0,0,0,7,0}, 'W'));
        retVal.add(new CardImpl(4, new int[]{3,3,0,6,0}, 'W'));
        retVal.add(new CardImpl(5, new int[]{3,0,0,7,0}, 'W'));

        return retVal;
    }

    public ArrayList<NobleImpl> getNobles(){
        ArrayList<NobleImpl> retVal = new ArrayList<NobleImpl>();

        retVal.add(new NobleImpl(3, new int[]{0,4,0,0,4}));
        retVal.add(new NobleImpl(3, new int[]{0,0,3,3,3}));
        retVal.add(new NobleImpl(3, new int[]{4,0,4,0,0}));
        retVal.add(new NobleImpl(3, new int[]{0,0,4,4,0}));
        retVal.add(new NobleImpl(3, new int[]{3,3,0,0,3}));
        retVal.add(new NobleImpl(3, new int[]{0,3,0,3,3}));
        retVal.add(new NobleImpl(3, new int[]{4,4,0,0,0}));
        retVal.add(new NobleImpl(3, new int[]{0,0,4,4,0}));
        retVal.add(new NobleImpl(3, new int[]{4,0,0,0,4}));

        return retVal;
    }
}
