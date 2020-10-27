package com.example.convertcurrency;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    ArrayList<String> item;
    ArrayList<String> exchange;
    static int i = 0;
    static int j = 0;
    int num;
    Double result, a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        item = new ArrayList<>();
        item.add("VND");
        item.add("USD");
        item.add("EUR");
        item.add("CNY");
        item.add("JPY");
        item.add("GBP");
        item.add("SGD");
        item.add("KRW");
        item.add("HKD");
        item.add("THB");

        exchange = new ArrayList<>();
        exchange.add("1.0");
        exchange.add("0.000043");
        exchange.add("0.000036");
        exchange.add("0.000287");
        exchange.add("0.0004545");
        exchange.add("0.000033");
        exchange.add("0.000059");
        exchange.add("0.0492");
        exchange.add("0.00033");
        exchange.add("0.00135");
        exchange.add("23200");
        exchange.add("1");
        exchange.add("0.84");
        exchange.add("6.5");
        exchange.add("105");
        exchange.add("0.77");
        exchange.add("1.36");
        exchange.add("1141");
        exchange.add("7.7");
        exchange.add("31.25");
        exchange.add("27400");
        exchange.add("1.18");
        exchange.add("1");
        exchange.add("8");
        exchange.add("125");
        exchange.add("0.91");
        exchange.add("1.61");
        exchange.add("1351");
        exchange.add("9.2");
        exchange.add("37");
        exchange.add("3400");
        exchange.add("0.15");
        exchange.add("0.13");
        exchange.add("1");
        exchange.add("16");
        exchange.add("0.12");
        exchange.add("0.2");
        exchange.add("171");
        exchange.add("1.2");
        exchange.add("4.75");
        exchange.add("200");
        exchange.add("0.0095");
        exchange.add("0.008");
        exchange.add("0.632");
        exchange.add("1");
        exchange.add("0.0072");
        exchange.add("0.0129");
        exchange.add("10.83");
        exchange.add("0.0735");
        exchange.add("0.2968");
        exchange.add("30200");
        exchange.add("1.31");
        exchange.add("1.1");
        exchange.add("8.5");
        exchange.add("138");
        exchange.add("1");
        exchange.add("1.77");
        exchange.add("1489");
        exchange.add("10.1");
        exchange.add("40.75");
        exchange.add("17000");
        exchange.add("0.74");
        exchange.add("0.62");
        exchange.add("5");
        exchange.add("78");
        exchange.add("0.56");
        exchange.add("1");
        exchange.add("841");
        exchange.add("5.7");
        exchange.add("23");
        exchange.add("20.32");
        exchange.add("0.000876");
        exchange.add("0.00074");
        exchange.add("0.00585");
        exchange.add("0.0923");
        exchange.add("0.00067");
        exchange.add("0.00119");
        exchange.add("1");
        exchange.add("0.0068");
        exchange.add("0.0274");
        exchange.add("3000");
        exchange.add("0.13");
        exchange.add("0.11");
        exchange.add("0.86");
        exchange.add("14");
        exchange.add("0.1");
        exchange.add("0.18");
        exchange.add("147");
        exchange.add("1");
        exchange.add("4.034");
        exchange.add("800");
        exchange.add("0.032");
        exchange.add("0.027");
        exchange.add("0.213");
        exchange.add("3.37");
        exchange.add("0.0245");
        exchange.add("0.0434");
        exchange.add("36.5");
        exchange.add("0.2479");
        exchange.add("1");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner1 = findViewById(R.id.spinner1);
        spinner1.setAdapter(adapter);
        Spinner spinner2 = findViewById(R.id.spinner2);
        spinner2.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                i = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                j = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        textView = findViewById(R.id.text_view);
        editText = findViewById(R.id.amount);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String a  = exchange.get(10*i+j);
                a1 = Double.parseDouble(a);
                num = Integer.parseInt(editText.getText().toString());
                result  = a1*num;
                textView.setText(result.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



    }
}