package lopez.quintor.appsuma;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNum1, etNum2;
    Button btnsuma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        btnsuma = findViewById(R.id.btnsuma);


        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Num1 = Integer.valueOf(etNum1.getText().toString());
                int Num2 = Integer.valueOf(etNum2.getText().toString());
                int resultado = Num1 + Num2;
                mensajeRes("El resultado es "+resultado);
            }
        });




    }
    public void mensajeRes(String mensajeRes){
        Toast.makeText( this, mensajeRes, Toast.LENGTH_LONG).show();
    }
}
