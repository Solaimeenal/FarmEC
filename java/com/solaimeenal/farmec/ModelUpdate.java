package com.swarnamythili.farmec;

public class ModelUpdate {
    private String pname, description, price, image, password, pid, date, time;
    public  ModelUpdate()
    {

    }
    public ModelUpdate(String pname, String description,  String image, String password, String pid, String date, String time) {
        this.pname = pname;
        this.description = description;

        this.image = image;
       this.password=password;
        this.pid = pid;
        this.date = date;
        this.time = time;
    }
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String category) {
        this.password = password;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
