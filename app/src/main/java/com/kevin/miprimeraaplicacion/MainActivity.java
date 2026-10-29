package com.kevin.miprimeraaplicacion;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNum1, edtNum2;
    Button btnSumar;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        btnSumar = findViewById(R.id.btnSumar);
        txtResultado = findViewById(R.id.txtResultado);
        btnSumar.setOnClickListener(v -> {
            int n1 = Integer.parseInt(edtNum1.getText().toString());
            int n2 = Integer.parseInt(edtNum2.getText().toString());
            int suma = n1 + n2;
            txtResultado.setText("Resultado: " + suma);
            Toast.makeText(this, "La suma es: " + suma, Toast.LENGTH_SHORT).show();
        });
    }
}
