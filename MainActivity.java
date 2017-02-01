package esilv.team41.eatnow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickLogin(View view){
        if (true){

            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        }
        else
        {
            TextView errorMessage = new TextView(this);
            errorMessage.setText("The e-mail adress or the password you used is unappropriate.");
            ViewGroup layout = (ViewGroup) findViewById(R.id.layoutErrorMessage);
            layout.addView(errorMessage);
        }
    }
}
