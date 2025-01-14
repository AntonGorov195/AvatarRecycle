package com.example.avatarrecycle.classes;


import com.example.avatarrecycle.R;
import com.example.avatarrecycle.models.Character;
import java.util.ArrayList;

public class myData {
    //
//    public static String[] nameArray = {"Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich","JellyBean", "Kitkat", "Lollipop"};
//    public static String[] versionArray = {"1.5", "1.6", "2.0-2.1", "2.2-2.2.3", "2.3-2.3.7", "3.0-3.2.6", "4.0-4.0.4", "4.1-4.3.1", "4.4-4.4.4","6.0-6.0.1"};
//
//    public static Integer[] drawableArray = {R.drawable.cupcake, R.drawable.donut, R.drawable.eclair,
//            R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb,
//            R.drawable.jellybean, R.drawable.kitkat, R.drawable.lollipop,R.drawable.marsh};
//
//    public static Integer[] id_ = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//
    private static ArrayList<Character> characters;

    public static ArrayList<Character> getCharacters() {
        if (characters == null) {
            characters = new ArrayList<>();
            characters.add(new Character("Aang", "The avatar. After being frozen in an iceberg for 100 year, he must now save the world.", R.drawable.aang));
            characters.add(new Character("Katara", "The last water bender of the southern water tribe.", R.drawable.katara));
            characters.add(new Character("Sokka", "Katara's brother and a great strategist. Non bender.", R.drawable.sokka));
            characters.add(new Character("Appa", "Aang's friend flying bison. One of the few remains of air nomad culture.", R.drawable.appa));
            characters.add(new Character("Azula", "The daughter of the fire lord Ozai. She is evil.", R.drawable.azula));
            characters.add(new Character("Zuko", "Obsessed with catching the avatar. I don't remember nor care why.", R.drawable.zuko));
            characters.add(new Character("Iroh", "Owner of the tea drinking central club.", R.drawable.iroh));
            characters.add(new Character("King Bumi", "Crazy old man. He is also a king.", R.drawable.bumi));
            characters.add(new Character("Toph", "She is cool. Blind.", R.drawable.toph));
            characters.add(new Character("Fire Lord Ozai", "The fire lord Ozai. He is the bad guy in the story.", R.drawable.ozai));
        }
        return characters;
    }
}
