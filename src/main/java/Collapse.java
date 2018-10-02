class Collapse {

    public static void main(String[] args) {
        collapse(args[0]);
    }

    public static String collapse(String toCollapse) {
        String[] arrayToCollapse = toCollapse.split(",");
        StringBuilder buildingCollapsed = new StringBuilder();
        int counter = Integer.parseInt(arrayToCollapse[0]);
        int startEndOfRangeToCollapse[] = new int[2];
        boolean willCollapse;
        int counterOfIterations = 0;
        for(int i = 0; i < arrayToCollapse.length; i++) {
            if(Integer.parseInt(arrayToCollapse[i]) == counter) {
                counterOfIterations++;
                willCollapse = false;
            } else {
                counterOfIterations = 1;
                willCollapse = true;
                if(startEndOfRangeToCollapse[0] == startEndOfRangeToCollapse[1]) {
                    buildingCollapsed.append(startEndOfRangeToCollapse[0]);
                    buildingCollapsed.append(",");
                } else if(startEndOfRangeToCollapse[1] == 0) {
                    buildingCollapsed.append(startEndOfRangeToCollapse[0]);
                    buildingCollapsed.append(",");
                } else {
                    buildingCollapsed.append(startEndOfRangeToCollapse[0]);
                    buildingCollapsed.append("-");
                    buildingCollapsed.append(startEndOfRangeToCollapse[1]);
                    buildingCollapsed.append(",");
                }
                counter = Integer.parseInt(arrayToCollapse[i]);
            }
            if(i == 0)
                startEndOfRangeToCollapse[0] = counter;
            else
                startEndOfRangeToCollapse[1] = Integer.parseInt(arrayToCollapse[i]);
            if(willCollapse) {
                startEndOfRangeToCollapse[0] = counter;
            }
            counter++;
        }
        if(startEndOfRangeToCollapse[0] == startEndOfRangeToCollapse[1]) {
            buildingCollapsed.append(startEndOfRangeToCollapse[0]);
        } else {
            buildingCollapsed.append(startEndOfRangeToCollapse[0]);
            buildingCollapsed.append("-");
            buildingCollapsed.append(startEndOfRangeToCollapse[1]);
        }
        return buildingCollapsed.toString();
    }

} 