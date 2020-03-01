package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        List<String> songs = Arrays.asList(playList);
        int totalNumSongs = playList.length;
        int indexOfSelection = songs.indexOf(selection);
        int forwardClicks = startIndex - indexOfSelection;
        int backWardClicks = startIndex;

        for (int i = totalNumSongs-1; i >= 0 ; i--) {
            backWardClicks++;
            if(backWardClicks < Math.abs(forwardClicks) && selection == playList[i]){
                return backWardClicks;
            }
        }
        return Math.abs(forwardClicks);
    }
}
