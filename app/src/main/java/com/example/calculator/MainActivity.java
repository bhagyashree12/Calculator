package com.example.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bsum,bmul,bdiv,bdot,bequal,bac;
    TextView txt1,txt2;
    double num1,num2;
    boolean add,multiply,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView) findViewById(R.id.text1);
        txt2 = (TextView) findViewById(R.id.text2);
        b0 = (Button) findViewById(R.id.zero);
        b1 = (Button) findViewById(R.id.one);
        b2 = (Button) findViewById(R.id.two);
        b3 = (Button) findViewById(R.id.three);
        b4 = (Button) findViewById(R.id.four);
        b5 = (Button) findViewById(R.id.five);
        b6 = (Button) findViewById(R.id.six);
        b7 = (Button) findViewById(R.id.seven);
        b8 = (Button) findViewById(R.id.eight);
        b9 = (Button) findViewById(R.id.nine);
        bsum = (Button) findViewById(R.id.add);
        bmul = (Button) findViewById(R.id.multiply);
        bdot = (Button) findViewById(R.id.dot);
        bequal = (Button) findViewById(R.id.equal);
        bac = (Button) findViewById(R.id.ac);
        bdiv = (Button) findViewById(R.id.divide);


        //button click function
        b0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt1.setText(txt1.getText().toString() + "0");
                    }
                }
        );
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt1.setText(txt1.getText().toString() + "1");//txt1.gettext will help to concatenate the previous enterd number
                    }
                }
        );
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt1.setText(txt1.getText().toString() + "2");
                    }
                }
        );
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt1.setText(txt1.getText().toString() + "3");
                    }
                }
        );
        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt1.setText(txt1.getText().toString() + "4");
                    }
                }
        );
        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt1.setText(txt1.getText().toString() + "5");
                    }
                }
        );
        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt1.setText(txt1.getText().toString() + "6");
                    }
                }
        );
        b7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt1.setText(txt1.getText().toString() + "7");
                    }
                }
        );
        b8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt1.setText(txt1.getText().toString() + "8");
                    }
                }
        );
        b9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txt1.setText(txt1.getText().toString() + "9");
                    }
                }
        );


        //functions to do calculation

        bsum.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                         num1 = Double.parseDouble((String) txt1.getText());
                        add=true;

                        txt1.setText(txt1.getText().toString() + "+");
                        txt1.setText(null);
                    }
                }
        );
        bmul.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                         num1 = Double.parseDouble((String) txt1.getText());
                        multiply=true;
                        txt1.setText(txt1.getText().toString() + "*");
                        txt1.setText(null);
                    }
                }
        );
        bdiv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = Double.parseDouble((String) txt1.getText());
                        division=true;
                        txt1.setText(txt1.getText().toString() + "/");
                        txt1.setText(null);
                    }
                }
        );


        bac.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        txt1.setText(null);//this clears all the previous text
                        txt2.setText(null);
                    }
                }
        );

        bequal.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        num2 = Double.parseDouble((String) txt1.getText());//this is the reason for doing null in the txt1 only after this the num2 will be able to read the number
                        if(add==true){

                            txt2.setText(num1+num2+"");
                            add=false;
                        }
                        if(multiply==true){
                            txt2.setText(num1*num2+"");
                            multiply=false;
                        }
                        if(division==true){
                            txt2.setText(num1/num2+"");
                            division=false;
                        }



                    }

                }
        );

    }



}