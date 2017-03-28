package com.inducesmile.spinme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by kenny on 3/28/17.
 */

public class ActivityA extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Declare the spinner
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);


        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_options, android.R.layout.simple_spinner_item);

        // Specifies the layout the adapter should use to display the list of spinner choices
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        // A call to apply the adapter to the Spinner.
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        // The TextView that displays the selected spinner item
        final TextView textView = (TextView) findViewById(R.id.txtMe);


        final Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Displays The current selected item in the spinner
                String item = spinner.getSelectedItem().toString();
                textView.setText(item);

            }
        });

    }


    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

        // An item was selected. You can retrieve the selected item using
        parent.getItemAtPosition(pos);
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }


}
