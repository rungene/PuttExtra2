package day2.rungene.com.puttextra2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity_Two extends AppCompatActivity {

    private TextView tvEmail;
    private TextView tvPass;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvPass = (TextView) findViewById(R.id.tvPass);

        Intent getIntA = getIntent();
        String getEmail = getIntA.getStringExtra("email");
        String getPass = getIntA.getStringExtra("pass");

        String newEmail = tvEmail.getText().toString();
        String newPass  = tvPass.getText().toString();

        tvEmail.setText(newEmail + " " + getEmail);
        tvPass.setText(newPass + " "+getPass);
    }

}

