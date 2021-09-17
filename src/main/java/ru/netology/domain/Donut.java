package ru.netology.domain;

public class Donut {
    private boolean isDonat;
    private int paidDuration;
    private Object placeHolder;
    private boolean canPublishFreeCopy;
    private String editMore;

    public boolean isDonat() {
        return isDonat;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public Object getPlaceHolder() {
        return placeHolder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public String getEditMore() {
        return editMore;
    }

    public void setDonat(boolean donat) {
        isDonat = donat;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public void setPlaceHolder(Object placeHolder) {
        this.placeHolder = placeHolder;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public void setEditMore(String editMore) {
        this.editMore = editMore;
    }
}
