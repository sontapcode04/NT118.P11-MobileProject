package com.example.setpassword;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class setting extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        // Bắt sự kiện cho RelativeLayout chứa nút Logout
        RelativeLayout logoutLayout = findViewById(R.id.imglogout); // Sử dụng ID của RelativeLayout.
        logoutLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang LogoutActivity
                Intent intent = new Intent(setting.this, logout.class);
                startActivity(intent);
            }
        });
    }
}
