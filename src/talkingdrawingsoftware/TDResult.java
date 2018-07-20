/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talkingdrawingsoftware;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Austin McCoy
 */

/**
 * 
 * TDResult is a container for the results of one TD Response
 */
public class TDResult {
   
    //TD response identifier and word frequency HashMap
    private int responseNumber;
    private Map<String, Integer> frequencyMap = new HashMap();
    
    /**
     * Constructor for TDResult
     * @param responseNumber TD response identifier 
     */
    public TDResult(int responseNumber){
        this.responseNumber = responseNumber;
    }
    
    /**
     * Updates the frequency value in the word frequency HashMap for a particular word
     * @param word Word to be updated
     */
    public void updateWord(String word){   
        frequencyMap.put(word,1);       
    }
    
    /**
     * Fetches the TD response identifier 
     * @return Returns the TD response identifier
     */
    public int getResponseNumber(){
        return this.responseNumber;
    }
    
    /**
     * Fetches the word frequency HashMap
     * @return Returns the word frequency HashMap
     */
    public Map<String,Integer> getFrequencyMap(){
        return this.frequencyMap;
    }
}
