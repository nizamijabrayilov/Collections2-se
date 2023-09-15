package enummap;

import java.util.EnumMap;

public class WorkingHours {
    public static void main(String[] args) {

        EnumMap<DaysOfTheWeek, Integer> enumMap = new EnumMap<>(DaysOfTheWeek.class);

        enumMap.put(DaysOfTheWeek.Monday, 9);
        enumMap.put(DaysOfTheWeek.Wednesday, 8);
        enumMap.put(DaysOfTheWeek.Friday, 10);
        enumMap.put(DaysOfTheWeek.Sunday, 0);

        System.out.println(enumMap);


    }
}