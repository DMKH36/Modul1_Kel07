package com.majid36.modul1_kel07;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Data implements Parcelable {
    private String NamaDepan;
    private String NamaBelakang;
    private String Email;
    private String Avatar;

    public Data(){

    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar (String avatar) {
        this.Avatar = avatar;
    }

    public String getNamaDepan() {
        return NamaDepan;
    }

    public void setNamaDepan(String Nama_Depan){
        this.NamaDepan = Nama_Depan;
    }

    public String getNamaBelakang() {
        return NamaBelakang;
    }

    public void setNamaBelakang(String Nama_Belakang) {
        this.NamaBelakang = Nama_Belakang;
    }

    public String getEmail(){
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    protected Data(Parcel in) {
        NamaDepan = in.readString();
        NamaBelakang = in.readString();
        Email = in.readString();
        Avatar = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(NamaDepan);
        dest.writeString(NamaBelakang);
        dest.writeString(Email);
        dest.writeString(Avatar);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

}
