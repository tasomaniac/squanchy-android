package net.squanchy.service.firebase.model;

import java.util.Collections;
import java.util.Map;

public class FirebaseAchievements {

    public static FirebaseAchievements empty() {
        return new FirebaseAchievements(Collections.emptyMap());
    }

    public FirebaseAchievements() {
    }

    public FirebaseAchievements(Map<String, Long> achievements) {
        this.achievements = achievements;
    }

    public Map<String, Long> achievements;
}
