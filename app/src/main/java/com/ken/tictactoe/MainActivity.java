package com.ken.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,restart_btn;
    boolean player_1 = true;
    boolean player_2 = false;
    int player_1_score = 0;
    int player_2_score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtons();

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player_1 == true && player_2 == false) {
                    btn_0.setText("X");
                    player_1 = false;
                    player_2 = true;
                  btn_0.setClickable(false);
                    checkWinner();
                } else {
                    btn_0.setText("O");
                    player_1 = true;
                    player_2 = false;
                    btn_0.setClickable(false);
                    checkWinner();
                }
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player_1 == true && player_2 == false) {
                    btn_1.setText("X");
                    player_1 = false;
                    player_2 = true;
                    btn_1.setClickable(false);
                    checkWinner();
                } else {
                    btn_1.setText("O");
                    player_1 = true;
                    player_2 = false;
                    btn_1.setClickable(false);
                    checkWinner();
                }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player_1 == true && player_2 == false) {
                    btn_2.setText("X");
                    player_1 = false;
                    player_2 = true;
                    btn_2.setClickable(false);
                    checkWinner();
                } else {
                    btn_2.setText("O");
                    player_1 = true;
                    player_2 = false;
                    btn_2.setClickable(false);
                    checkWinner();
                }
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player_1 == true && player_2 == false) {
                    btn_3.setText("X");
                    player_1 = false;
                    player_2 = true;
                    btn_3.setClickable(false);
                    checkWinner();
                } else {
                    btn_3.setText("O");
                    player_1 = true;
                    player_2 = false;
                    btn_3.setClickable(false);
                    checkWinner();
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player_1 == true && player_2 == false) {
                    btn_4.setText("X");
                    player_1 = false;
                    player_2 = true;
                    btn_4.setClickable(false);
                    checkWinner();
                } else {
                    btn_4.setText("O");
                    player_1 = true;
                    player_2 = false;
                    btn_4.setClickable(false);
                    checkWinner();
                }
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player_1 == true && player_2 == false){
                    btn_5.setText("X");
                    player_1 = false;
                    player_2 = true;
                    btn_5.setClickable(false);
                    checkWinner();
                }
                else {
                    btn_5.setText("O");
                    player_1 = true;
                    player_2 = false;
                    btn_5.setClickable(false);
                    checkWinner();
                }
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player_1 == true && player_2 == false) {
                    btn_6.setText("X");
                    player_1 = false;
                    player_2 = true;
                    btn_6.setClickable(false);
                    checkWinner();
                } else {
                    btn_6.setText("O");
                    player_1 = true;
                    player_2 = false;
                    btn_6.setClickable(false);
                    checkWinner();
                }
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player_1 == true && player_2 == false) {
                    btn_7.setText("X");
                    player_1 = false;
                    player_2 = true;
                    btn_7.setClickable(false);
                    checkWinner();
                } else {
                    btn_7.setText("O");
                    player_1 = true;
                    player_2 = false;
                    btn_7.setClickable(false);
                    checkWinner();
                }
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player_1 == true && player_2 == false) {
                    btn_8.setText("X");
                    player_1 = false;
                    player_2 = true;
                    btn_8.setClickable(false);
                    checkWinner();
                } else {
                    btn_8.setText("O");
                    player_1 = true;
                    player_2 = false;
                    btn_8.setClickable(false);
                    checkWinner();
                }
            }
        });


        restart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearALLbuttons();
                enableALLbuttons();
            }
        });
    }

    private void initButtons(){
        restart_btn = (Button) findViewById(R.id.restart_btn);
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

    public void disablingALLbuttons(){
        btn_0.setClickable(false);
        btn_1.setClickable(false);
        btn_2.setClickable(false);
        btn_3.setClickable(false);
        btn_4.setClickable(false);
        btn_5.setClickable(false);
        btn_6.setClickable(false);
        btn_7.setClickable(false);
        btn_8.setClickable(false);
    }
    public void enableALLbuttons(){
        btn_0.setClickable(true);
        btn_1.setClickable(true);
        btn_2.setClickable(true);
        btn_3.setClickable(true);
        btn_4.setClickable(true);
        btn_5.setClickable(true);
        btn_6.setClickable(true);
        btn_7.setClickable(true);
        btn_8.setClickable(true);
    }

    public void clearALLbuttons(){
        btn_0.setText("");
        btn_1.setText("");
        btn_2.setText("");
        btn_3.setText("");
        btn_4.setText("");
        btn_5.setText("");
        btn_6.setText("");
        btn_7.setText("");
        btn_8.setText("");
    }

    private void checkWinner() {

//        First Row Checker Boxes 0 , 1 , 2
        if (btn_0.getText() == "X" && btn_1.getText() == "X" && btn_2.getText() == "X") {
            Toast.makeText(MainActivity.this, "Player One Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }
        if (btn_0.getText() == "O" && btn_1.getText() == "O" && btn_2.getText() == "O") {
            Toast.makeText(MainActivity.this, "Player Two Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }

//        Second Row Checker Boxes 3 , 4 , 5
        if (btn_3.getText() == "X" && btn_4.getText() == "X" && btn_5.getText() == "X") {
            Toast.makeText(MainActivity.this, "Player One Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }
        if (btn_3.getText() == "O" && btn_4.getText() == "O" && btn_5.getText() == "O") {
            Toast.makeText(MainActivity.this, "Player Two Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }

//        Third Row Checker Boxes 6, 7, 8
        if (btn_6.getText() == "X" && btn_7.getText() == "X" && btn_8.getText() == "X") {
            Toast.makeText(MainActivity.this, "Player One Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }
        if (btn_6.getText() == "O" && btn_7.getText() == "O" && btn_8.getText() == "O") {
            Toast.makeText(MainActivity.this, "Player Two Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();


        }

//        1st Column Checker Boxes 0, 3, 6
        if (btn_0.getText() == "X" && btn_3.getText() == "X" && btn_6.getText() == "X") {
            Toast.makeText(MainActivity.this, "Player One Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }
        if (btn_0.getText() == "O" && btn_3.getText() == "O" && btn_6.getText() == "O") {
            Toast.makeText(MainActivity.this, "Player Two Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }

//        Second Column Checker 1, 4, 7
        if (btn_1.getText() == "X" && btn_4.getText() == "X" && btn_7.getText() == "X") {
            Toast.makeText(MainActivity.this, "Player One Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }
        if (btn_1.getText() == "O" && btn_4.getText() == "O" && btn_7.getText() == "O") {
            Toast.makeText(MainActivity.this, "Player Two Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }

//        Third Row Checker 2 , 5 , 8
        if (btn_2.getText() == "X" && btn_5.getText() == "X" && btn_8.getText() == "X") {
            Toast.makeText(MainActivity.this, "Player One Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }
        if (btn_2.getText() == "O" && btn_5.getText() == "O" && btn_8.getText() == "O") {
            Toast.makeText(MainActivity.this, "Player Two Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }
//        First Diagonal Checker 0 , 4, 8
        if (btn_0.getText() == "X" && btn_4.getText() == "X" && btn_8.getText() == "X") {
            Toast.makeText(MainActivity.this, "Player One Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }
        if (btn_0.getText() == "O" && btn_4.getText() == "O" && btn_8.getText() == "O") {
            Toast.makeText(MainActivity.this, "Player Two Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }
//        Second Diagonal Checker  2, 4, 6
        if (btn_2.getText() == "X" && btn_4.getText() == "X" && btn_6.getText() == "X") {
            Toast.makeText(MainActivity.this, "Player One Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }
        if (btn_2.getText() == "O" && btn_4.getText() == "O" && btn_6.getText() == "O") {
            Toast.makeText(MainActivity.this, "Player Two Wins!!", Toast.LENGTH_SHORT).show();
            disablingALLbuttons();

        }
    }
}
