package com.ken.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8;
    boolean player_1 = true;
    boolean player_2 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtons();

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player_1 == true && player_2 == false){
                    btn_0.setText("X");
                    player_1 = false;
                    player_2 = true;
                }
                else
                    btn_0.setText("O");
            }
        });




    }

    private void initButtons(){
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
    }











}
