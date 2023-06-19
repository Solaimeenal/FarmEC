package com.swarnamythili.farmec;

public class ModelUsers {
    String name;
    String type;

    public ModelUsers() {
    }
    String onlineStatus;
    String typingTo;
    String email;
    String image;
    String uid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ModelUsers(String name, String onlineStatus, String typingTo, String email, String image,  String uid,String type) {
        this.name = name;
        this.onlineStatus = onlineStatus;
        this.typingTo = typingTo;
        this.email = email;
        this.image = image;
        this.uid = uid;
        this.type=type;
    }


}
