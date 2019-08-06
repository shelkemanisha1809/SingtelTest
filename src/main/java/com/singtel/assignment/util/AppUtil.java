package com.singtel.assignment.util;

import com.singtel.assignment.action.CanFly;
import com.singtel.assignment.action.CanSing;
import com.singtel.assignment.action.CanSwim;
import com.singtel.assignment.action.CanWalk;
import com.singtel.assignment.animal.Animal;

import java.util.HashMap;
import java.util.Map;

import static com.singtel.assignment.util.AppConstant.*;

public class AppUtil {

    public static Map<String, Integer> countActions(Animal[] animals) {
        Map<String, Integer> actionCountMap = new HashMap<>();
        for (Animal animal : animals) {
            if (animal instanceof CanFly) {
                actionCountMap.put(CAN_FLY, getCount(actionCountMap, CAN_FLY));
            }
            if (animal instanceof CanWalk) {
                actionCountMap.put(CAN_WALK, getCount(actionCountMap, CAN_WALK));
            }
            if (animal instanceof CanSing) {
                actionCountMap.put(CAN_SING, getCount(actionCountMap, CAN_SING));
            }
            if (animal instanceof CanSwim) {
                actionCountMap.put(CAN_SWIM, getCount(actionCountMap, CAN_SWIM));
            }
        }
        return actionCountMap;
    }

    private static Integer getCount(Map<String, Integer> actionCountMap, String action) {
        return actionCountMap.get(action) != null ?
                actionCountMap.get(action) + 1 : 1;
    }
}
