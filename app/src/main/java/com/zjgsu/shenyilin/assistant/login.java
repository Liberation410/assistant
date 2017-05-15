package com.zjgsu.shenyilin.assistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class login extends AppCompatActivity {
    //用于保存自己的账户密码，方便修改
    public String username=1512180623+"";
    public String userkey=1512180623+"";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText text_username=(EditText)findViewById(R.id.text_username);
        final EditText text_key=(EditText)findViewById(R.id.text_key);

        Button button_login=(Button)findViewById(R.id.button_login);
        Button button_cancel=(Button)findViewById(R.id.button_cancel);

        button_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent successlogin=new Intent(login.this,function_choose.class);

                if (text_username.getText().toString().equals(username)&& text_key.getText().toString().equals(userkey)){
                    startActivity(successlogin);
                }else{
                    Toast.makeText(login.this, "登录密码与用户名不匹配，请重新输入", Toast.LENGTH_SHORT).show();
                    text_key.setText("");
                }

            }

        });

        button_cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){

        switch (requestCode){
            case 1:
                if (resultCode==RESULT_OK){
                    userkey=data.getStringExtra("newkey_return");

                }
                break;
            default:
        }
    }
}
