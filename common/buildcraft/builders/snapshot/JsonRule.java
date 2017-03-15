package buildcraft.builders.snapshot;

import java.util.List;

public class JsonRule {
    public String name = null;
    public List<String> parentNames = null;
    public List<String> blocks = null;
    public List<String> requiredItems = null;
    public boolean copyRequiredItemMetaFromBlock = false;
    public boolean copyRequiredItemsFromDrops = false;
    public String copyRequiredItemsCountFromProperty = null;
    public List<int[]> requiredBlockOffsets = null;
    public boolean ignore = false;
}
