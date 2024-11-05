package com.example.helloRelative;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView contador;
    Button  bToast;
    Button  bCount;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bToast=findViewById(R.id.button_toast);
        bCount=findViewById(R.id.button_count);
        contador=findViewById(R.id.show_count);
        bCount.setOnClickListener(v -> {

                    count++;
            contador.setText(String.valueOf(count));
        });
        bToast.setOnClickListener(v -> {
            Toast.makeText(this, "Has contado hasta: "+count, Toast.LENGTH_SHORT).show();
        });
        }

    }
