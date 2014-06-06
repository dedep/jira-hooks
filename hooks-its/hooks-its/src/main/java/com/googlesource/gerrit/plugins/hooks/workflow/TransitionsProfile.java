package com.googlesource.gerrit.plugins.hooks.workflow;

public class TransitionsProfile {

    private String profileFilePath;

    public TransitionsProfile(String profileFilePath) {
        this.profileFilePath = profileFilePath;
    }

    public String getProfileFilePath() {
        return profileFilePath;
    }
}
