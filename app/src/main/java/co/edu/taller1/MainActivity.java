package co.edu.taller1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner ;
    private Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        boton = findViewById(R.id.button);

       llenarSpinner();

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarIdSeleccionado();
            }
        });



    }

    private void mostrarIdSeleccionado() {
        Proyectos proyectos = (Proyectos) spinner.getSelectedItem();
        String mensaje = "haz seleccionado"+ proyectos.getId()+"y pertenece al tipo"+proyectos.getZona();
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
    }

    private void llenarSpinner() {
        ArrayList<Proyectos> proyectos = new ArrayList<>();
        proyectos.add(new Proyectos(1, "infraestructura:", "parques"));
        proyectos.add(new Proyectos(2, "infraestructura:", "Caminos verdes"));
        proyectos.add(new Proyectos(3, "Recreacion:", "Ciclovias"));
        proyectos.add(new Proyectos(4, "Recreacion:", "Caminos"));


        ArrayAdapter<Proyectos> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, proyectos);

        spinner.setAdapter(adapter);
        spinner.setPrompt(getString(R.string.seleccion_user));

    }
}