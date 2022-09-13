package com.example.characterpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.textView);
        ImageView image = findViewById(R.id.imageView2);
        Button button = findViewById(R.id.button);

        final int[] resource_id = {R.drawable.goku};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (resource_id[0] ==R.drawable.goku){
                    text.setText("MASTER ROSHI");
                    image.setImageResource(R.drawable.masterroshi);
                    resource_id[0] = R.drawable.masterroshi;
                    Toast.makeText(MainActivity.this, "Thank you for using my app...", Toast.LENGTH_SHORT).show();
                }
                else if (resource_id[0] ==R.drawable.masterroshi){
                    text.setText("GOKU");
                    image.setImageResource(R.drawable.goku);
                    resource_id[0] = R.drawable.goku;
                    Toast.makeText(MainActivity.this, "Thank you for using my app...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}