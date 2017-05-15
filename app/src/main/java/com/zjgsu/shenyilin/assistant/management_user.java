package com.zjgsu.shenyilin.assistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class management_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management_user);

        final EditText text_previouskey=(EditText)findViewById(R.id.text_previouskey);
        final EditText text_newkey=(EditText)findViewById(R.id.text_newkey);

        Button button_revisekey=(Button)findViewById(R.id.button_revisekey);
        button_revisekey.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    //判断输入密码是否符合
                Intent intent=new Intent();
                intent.putExtra("newkey_return",text_newkey.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
                }
            });


    }
}
