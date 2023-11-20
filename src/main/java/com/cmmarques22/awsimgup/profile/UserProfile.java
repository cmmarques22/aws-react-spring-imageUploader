package com.cmmarques22.awsimgup.profile;

import java.security.PrivateKey;
import java.util.Objects;
import java.util.UUID;

public class UserProfile {
    private UUID UserProfileId;
    private String username;
    private String profileImageLink; // S3key

    public UserProfile(UUID userProfileId,
                       String username,
                       String profileImageLink) {
       this.UserProfileId = userProfileId;
        this.username = username;
        this.profileImageLink = profileImageLink;
    }

    public UUID getUserProfileId() {
        return UserProfileId;
    }

    public void setUserProfileId(UUID userProfileId) {
        UserProfileId = userProfileId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfileImageLink() {
        return profileImageLink;
    }

    public void setProfileImageLink(String profileImageLink) {
        this.profileImageLink = profileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        //can return null
        return Objects.equals(UserProfileId, that.UserProfileId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(profileImageLink, that.profileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UserProfileId, username, profileImageLink);
    }
}
