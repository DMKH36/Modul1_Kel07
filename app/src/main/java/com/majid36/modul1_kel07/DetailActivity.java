package com.majid36.modul1_kel07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static final String MyData = "mydata";
    private ImageView foto;
    private TextView tvNamaDepan, tvNamaBelakang, tvEmail;
    String namadepan, namabelakang, email, avatar;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_detail);

        tvNamaDepan = findViewById(R.id.tv_first_name);
        tvNamaBelakang = findViewById(R.id.tv_last_name);
        tvEmail = findViewById(R.id.tv_email);
        foto = findViewById(R.id.photo_user);

        getData();
        setData();
    }

    private void getData() {
        Data data = getIntent().getParcelableExtra(MyData);
        if (data == null) {
            namadepan = data.getNamaDepan();
            namabelakang = data.getNamaBelakang();
            email = data.getEmail();
            avatar = data.getAvatar();
        }
        else {
            namadepan = data.getNamaDepan();
            namabelakang = data.getNamaBelakang();
            email = data.getEmail();
            avatar = data.getAvatar();
        }

    }

    private void setData() {
        tvNamaDepan.setText(namadepan);
        tvNamaBelakang.setText(namabelakang);
        tvEmail.setText(email);
        Glide.with(this).load(avatar).error(R.drawable.ic_logo).circleCrop().into(foto);
    }

}
