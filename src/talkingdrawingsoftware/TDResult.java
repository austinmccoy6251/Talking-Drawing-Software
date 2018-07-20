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
 * @author austi
 */
public class TDResult {
   
    private int responseNumber;
    private Map<String, Integer> frequencyMap = new HashMap();
    
    public TDResult(int responseNumber){
        this.responseNumber = responseNumber;
    }
    
    public void updateWord(String word){
      
        frequencyMap.put(word,1);       
    }
    
    public int getResponseNumber(){
        return this.responseNumber;
    }
    
    public Map<String,Integer> getFrequencyMap(){
        return this.frequencyMap;
    }
}
