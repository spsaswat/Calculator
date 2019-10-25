package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {
        EditText no1,no2;
        TextView quantityTextView;
        double n1,n2,number;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            number=-Double.MAX_VALUE;
            quantityTextView =(TextView) findViewById(R.id.result);
        }
        private void display (double n){
            number=n;

            if(number==-Double.MAX_VALUE)
                quantityTextView.setText("Kindly Enter both the numbers");
            else
            quantityTextView.setText(""+number);
        }
    public void Result(View view) {
            if(number!=-Double.MAX_VALUE)
            {no1.setText(""+number);no2.setText("");}
            else
                quantityTextView.setText("Kindly Calculate Something");
    }

        private double getn1(){
            no1=(EditText) findViewById(R.id.num1);
            String str=no1.getText().toString();
            if(str.length()==0)
                return -1;
            else
            return (Double.parseDouble(str));
        }
        private double getn2(){
            no2=(EditText) findViewById(R.id.num2);
            String str=no2.getText().toString();
            if(str.length()==0)
                return -1;
            else
            return (Double.parseDouble(str));
        }
        public void add(View view){
            n1=getn1();
            n2=getn2();
            if(n1==-1||n2==-1)
                display(-Double.MAX_VALUE);
            else
            display((n1+n2));
        }
        public void multiply(View view){
            n1=getn1();
            n2=getn2();
            if(n1==-1||n2==-1)
                display(-Double.MAX_VALUE);
            else
            display((n1*n2));
        }
        public void divide(View view){
            n1=getn1();
            n2=getn2();
            if(n1==-1||n2==-1)
                display(-Double.MAX_VALUE);
            else
            display((n1/n2));
        }
        public void subtract(View view){
            n1=getn1();
            n2=getn2();
            if(n1==-1||n2==-1)
                display(-Double.MAX_VALUE);
            else
            display((n1-n2));
        }
        public void factorial(View view){
            n1=getn1();
            n2=getn2();
            if(n1==-1||n2==-1)
                display(-Double.MAX_VALUE);
            else {
                int n = (int) (n1 + n2);
                if (n > 19) {
                    TextView o_p = (TextView) findViewById(R.id.result);
                    o_p.setText(n + " is > 19 enter (n1+n2)<19");
                } else {
                    int f = 1, i;

                    for (i = 1; i <= (int) n; i++) {
                        f = f * i;
                    }
                    display((double) f);
                }
            }
        }
        public void prime(View view) {
            n1=getn1();
            n2=getn2();
            if(n1==-1||n2==-1)
                display(-Double.MAX_VALUE);
            else {
                int n = (int) (n1 + n2);
                int c = 0, i;
                for (i = 1; i * i <= (int) n; i++) {
                    if ((n % i) == 0) {
                        c++;
                    }
                }
                TextView o_p = (TextView) findViewById(R.id.result);

                if (c == 1) {
                    o_p.setText("Yes, " + n + " is prime");
                } else {
                    o_p.setText("No, " + n + " is not prime");
                }
            }
        }
        public void discount(View view) {
            n1=getn1();
            n2=getn2();
            if(n1==-1||n2==-1)
                display(-Double.MAX_VALUE);
            else {
                display((1 - n2 / 100) * n1);
            }
        }
        public void HCF(View view){
            double n1,n2;
            n1=getn1();
            n2=getn2();
            if(n1==-1||n2==-1)
                display(-Double.MAX_VALUE);
            else {
                n1 = (int) getn1();
                n2 = (int) getn2();
                if (n2 == 0)
                    display(n1);
                else if (n1 == 0) {
                    display(n2);
                } else if (n1 == 0 && n2 == 0) {
                    display(0.0);
                } else {
                    while (n1 != n2) {
                        if (n1 > n2)
                            n1 -= n2;
                        else
                            n2 -= n1;
                    }
                    display(n1);
                }
            }
        }
        public void LCM(View view){
            double n1,n2,n3,n4;
            n1=getn1();
            n2=getn2();
            if(n1==-1||n2==-1)
                display(-Double.MAX_VALUE);
            else {
                n1 = (int) getn1();
                n2 = (int) getn2();
                n3 = n1;
                n4 = n2;
                if (n2 == 0 || n1 == 0 || (n1 == 0 && n2 == 0))
                    display(0.0);
                else {
                    while (n1 != n2) {
                        if (n1 > n2)
                            n1 -= n2;
                        else
                            n2 -= n1;
                    }
                    display(((n3 * n4) / n1));
                }
            }
        }
        public void POW(View view){
            n1=getn1();
            n2=getn2();
            if(n1==-1||n2==-1)
                display(-Double.MAX_VALUE);
            else {
                display(Math.pow(n1, n2));
            }
        }

    public void mod(View view) {
        n1=getn1();
        n2=getn2();
        if(n1==-1||n2==-1)
            display(-Double.MAX_VALUE);
        else {
            long n1, n2;
            n1 = (int) getn1();
            n2 = (int) getn2();
            display(n1 % n2);
        }
    }


}

