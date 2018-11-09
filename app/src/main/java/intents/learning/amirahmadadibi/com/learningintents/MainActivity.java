package intents.learning.amirahmadadibi.com.learningintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_second_activity = findViewById(R.id.btn_second_step);
        btn_second_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivityNormaly();
            }
        });
    }

    public void launchActivityNormaly() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

}
