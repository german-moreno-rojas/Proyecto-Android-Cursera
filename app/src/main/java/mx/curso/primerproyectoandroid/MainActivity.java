package mx.curso.primerproyectoandroid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enterButton = findViewById(R.id.enterButton);
        enterButton.setOnClickListener(view ->
                Toast.makeText(
                        MainActivity.this,
                        getString(R.string.button_message),
                        Toast.LENGTH_SHORT
                ).show()
        );
    }
}
