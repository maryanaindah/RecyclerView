package com.ifutama.maryanaindah.recyclerview.model;

import com.ifutama.maryanaindah.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by indah on 4/16/2017.
 */

public class DerpData {

    private static final String[] titles={"Nothingness cannot be defined",
            "Time is like a river made up of the events which happen, and a violent stream;"+
                "for as soon as a thing has been seen, it is carried away, and another comes"+
                "in this place, and this will be carried away too,",
            "But when I know that the glass is already broken, every minute with it is precious,",
            "for me, it is far better to grasp the universe as it relly is than to persist in" +
                    "delusion, however sat satisfying and reassuring.",
            "The seeker after the truth is not one who studies the writings of the ancients and," +
                    "following his natural disposition, puts his trust in them, but rather the" +
                    "The one who submits to argument and demonstration, and not to the" +
                    "sayings of a human being whose nature is traught with all kinds" +
                    "of imperfection and deficiency.",
            "You must take personal responsibility. You cannot change the circumstances, the" +
                    "seasons, or the wind, but you can change yourself.That is something you" +
                    "have charge of."
    };
    private static final String[] subTitles = {"Maryana",
            "Indah",
            "Lestari",
            "Asep",
            "Lulu",
            "Indra",
            "Noviantama"
    };
    public static List<ListItem>getListData(){
        List<ListItem> data = new ArrayList<>();

        for(int x=0; x < 4; x++){
            for(int i=0; i < titles.length; i++){
                ListItem item = new ListItem();
                item.setTitle(titles[i]);
                item.setSubTitle(subTitles[i]);
                data.add(item);
            }
        }

        return data;

    }
}
