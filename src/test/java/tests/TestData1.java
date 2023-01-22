package tests;

import java.util.*;

public class TestData1 {

    public static String printRandomMapKeyValueElement() {
        Map<String, String> map = new HashMap<>();
        map.put("Delhi", "NCR");
        map.put("Gurgaon", "NCR");
        map.put("Noida", "NCR");
        map.put("Agra", "Uttar Pradesh");
        map.put("Lucknow", "Uttar Pradesh");
        map.put("Merrut", "Uttar Pradesh");
        map.put("Karnal", "Haryana");
        map.put("Panipat", "Haryana");
        map.put("Jaipur", "Rajasthan");
        map.put("Jaiselmer", "Rajasthan");

        Set<String> keySet = map.keySet();
        List<String> keyList = new ArrayList<>(keySet);

        int size = keyList.size();
        int randIdx = new Random().nextInt(size);

        String randomKey = keyList.get(randIdx);
        String randomValue = map.get(randomKey);
        String keyValue = randomKey + "-" + randomValue;

        return keyValue;
    }
}