package ma.ens.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText nom;
    private EditText prenom;
    private Spinner ville;

    private RadioButton f;

    private RadioButton m;
    private Button bn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);
        ville = findViewById(R.id.ville);
        f = findViewById(R.id.f);
        m = findViewById(R.id.m);

        bn = findViewById(R.id.bn);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, nom.getText()+ " "+ prenom.getText()+" "+ville.getSelectedItem(), Toast.LENGTH_LONG).show();
                Log.d("ENS", nom.getText()+ " "+ prenom.getText()+" "+ville.getSelectedItem());
            }
        });

    }
}