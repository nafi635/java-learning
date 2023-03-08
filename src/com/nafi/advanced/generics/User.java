package com.nafi.advanced.generics;

public class User implements Comparable<User>{

    public int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User o) {
        if(points < o.points) {
            return -1;
        }
        if(points == o.points)
            return 0;
        return -1;
    }
}
