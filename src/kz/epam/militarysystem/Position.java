package kz.epam.militarysystem;

import java.util.HashMap;
import java.util.Map;

public class Position {
    public static final String CEO = "CEO";
    public static final String DEPUTY_HEAD = "Deputy head";
    public static final String MANAGER = "Manager";
    public static final String WORKER = "Worker";

    public static Map<String , Integer> positionPriority = new HashMap<>();
    static {
        positionPriority.put(CEO,1);
        positionPriority.put(DEPUTY_HEAD,2);
        positionPriority.put(MANAGER,3);
        positionPriority.put(WORKER,4);
    }
}
