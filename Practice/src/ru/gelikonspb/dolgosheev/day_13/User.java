package ru.gelikonspb.dolgosheev.day_13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private String username;
    Set<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new HashSet<>();
    }

    public String getUsername() {
        return username;
    }

    public Set<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return (subscriptions.contains(user) && user.subscriptions.contains(this));
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
