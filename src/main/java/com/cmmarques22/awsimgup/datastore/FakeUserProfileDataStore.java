package com.cmmarques22.awsimgup.datastore;

import com.cmmarques22.awsimgup.profile.UserProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "carlosmarques", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "manuelcalavera", null));
    }
    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
