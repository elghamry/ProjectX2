package com.example.abdel.projectx;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by ELGHAMRY on 27/02/2016.
 */
public class login extends Activity {

    EditText login_password;
    ImageView login_showPassword;
    Boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login_password=(EditText)findViewById(R.id.login_password);
        login_showPassword=(ImageView)findViewById(R.id.login_showPassword);
        login_showPassword.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (flag == false &&!login_password.getText().toString().isEmpty()) {
                    login_password.setTransformationMethod(null);
                    flag = !flag;
                    login_showPassword.setImageResource(R.drawable.ic_remove_red_eye_yellow_18dp);
                } else {
                    login_password.setTransformationMethod(new PasswordTransformationMethod());
                    flag = !flag;
                    login_showPassword.setImageResource(R.drawable.ic_remove_red_eye_black_18dp);

                }

            }
        });




}
    @Override
    public void onBackPressed() {


        super.onBackPressed();
        finish();

    }



}
