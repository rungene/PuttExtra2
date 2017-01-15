package day2.rungene.com.puttextra2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_One extends AppCompatActivity {

    private EditText etEmail;
    private EditText etPass;
    private Button btnA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__one);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPass = (EditText) findViewById(R.id.etPass);

        btnA = (Button) findViewById(R.id.btnA);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validation
                String newEmail = etEmail.getText().toString();
                String newPass = etPass.getText().toString();

                boolean samr = validEmail(newEmail);

                if ((newEmail.equals("")|| newEmail.equals(null))
                        || newPass.equals("") || newPass.equals(null)|| samr==false){
                    Toast.makeText(getApplicationContext(),"Acces Denied" + newEmail,Toast.LENGTH_LONG).show();
                }else {
                    if (newEmail.equals("samrr@yahoo.com") && newPass.equals("123")){

                        Intent intent = new Intent(Activity_One.this, Activity_Two.class);
                        intent.putExtra("email", newEmail);
                        intent.putExtra("pass", newPass);
                        Activity_One.this.startActivity(intent);
                    }else {
                        Toast.makeText(getApplication(),"Emai or Password Incorrect", Toast.LENGTH_SHORT).show();
                    }
                }
            }


        });
    }
    private boolean validEmail(String email) {
        if (email.contains("@")){
            return true;

        }else {
            return false;
        }
    }
}
