package tw.org.iii.leo.leo17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText account,passwd,realname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        account = findViewById(R.id.account);
        passwd = findViewById(R.id.passwd);
        realname= findViewById(R.id.realname);
    }
}
