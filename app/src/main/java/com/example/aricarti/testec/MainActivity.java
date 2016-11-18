package com.example.aricarti.testec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
        //System.loadLibrary("soma");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv_name = (TextView) findViewById(R.id.tv_nameC);
        tv_name.setText(stringFromJNI());

        TextView tv_mult = (TextView) findViewById(R.id.tv_multC);
        tv_mult.setText(Integer.toString(stringFromJNI3()));

        TextView tv_fat = (TextView) findViewById(R.id.tv_fatC);
        tv_fat.setText(Integer.toString(stringFromJNI4(5)));

        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et_pNr = (EditText) findViewById(R.id.et_pNr);
                EditText et_sNr = (EditText) findViewById(R.id.et_sNr);

                int pNr = Integer.parseInt(et_pNr.getText().toString());
                int sNr = Integer.parseInt(et_sNr.getText().toString());

                TextView tv_sub = (TextView) findViewById(R.id.tv_sub);
                tv_sub.setText(Integer.toString(valueSub(pNr, sNr)));
            }
        });
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native int stringFromJNI3();
    public native int stringFromJNI4(int value);
    public native int valueSub(int value1, int value2);
}
