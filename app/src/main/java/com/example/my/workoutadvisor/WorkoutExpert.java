package com.example.my.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
    List<String> getWorkouts (String workouttype) {
        List<String> workout = new ArrayList<String>();

        if (workouttype.equals("Chest")) {
            workout.add("Bench Press");
            workout.add("Cable Flys");
        } else if (workouttype.equals("Triceps")) {
            workout.add("Tricep Ext");
            workout.add("Triceps PushDowns");


        } else if (workouttype.equals("Shoulder")) {
            workout.add("Shoulder Press");
            workout.add("Dumbell Vertical Lift");

        } else if (workouttype.equals("Biceps")) {
            workout.add("Bicep Curls");

        }

        return workout;
    }

}
