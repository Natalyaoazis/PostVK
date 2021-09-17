package ru.netology.domain;

public class LikesInfo {
    private int id;
    private boolean userLikes;
    private boolean canLike;
    private boolean canPublish;

    public int getId() {
        return id;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
