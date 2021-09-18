package ru.netology.domain;

import java.lang.reflect.Array;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String body;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private Array attachments;
    private int singerId;
    private Array copyHistory;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postPonedId;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private Donut donut;
    private Geo geo;
    private LikesInfo likesInfo;
    private Repost repost;
    private ShowViews showViews;

    public int getId() {
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public int getDate() {
        return date;
    }

    public String getBody() {
        return body;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public Array getAttachments() {
        return attachments;
    }

    public int getSingerId() {
        return singerId;
    }

    public Array getCopyHistory() {
        return copyHistory;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public int getPostPonedId() {
        return postPonedId;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public Donut getDonut() {
        return donut;
    }

    public Geo getGeo() {
        return geo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public Repost getRepost() {
        return repost;
    }

    public ShowViews getShowViews() {
        return showViews;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public void setAttachments(Array attachments) {
        this.attachments = attachments;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public void setCopyHistory(Array copyHistory) {
        this.copyHistory = copyHistory;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public void setPostPonedId(int postPonedId) {
        this.postPonedId = postPonedId;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public void setShowViews(ShowViews showViews) {
        this.showViews = showViews;
    }
}
