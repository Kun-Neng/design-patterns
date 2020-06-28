package src.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeManager {
    private static Map<String, Tree> treePool = new HashMap<>();

    public static Tree getTree(String type) {
        if (!treePool.containsKey(type)) {
            treePool.put(type, new Tree(type));
        }

        return treePool.get(type);
    }
}
