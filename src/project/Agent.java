package project;

import java.util.HashMap;


public class Agent {

    HashMap<String, Integer> map = new HashMap<>();

    public  Agent (int numberOfAgents) {
        for (int i = 0; i < numberOfAgents; i++) {
            map.put("vishal", 10);
        }
    }



}
