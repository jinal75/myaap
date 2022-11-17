package com.example.custom_list;

public class Messages {

    private int mImageid;
    private String mname;
    private String mDescription;
    private String mtime;

    public Messages(int mImageid,String mname,String mDescription,String mtime){
        this.mImageid = mImageid;
        this.mname = mname ;
        this.mDescription = mDescription;
        this.mtime = mtime;

    }

    public void setmImageid(int mImageid){
        this.mImageid = mImageid;
    }

    public int getmImageid() {
        return mImageid;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getmTime() {
        return mtime;
    }

    public void setmTime(String mtime) {
        this.mtime = mtime;
    }


}
