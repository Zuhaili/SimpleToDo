package sg.edu.rp.c346.id19004781.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etToDo;
    Button btnAdd, btnClear;
    ListView lvToDo;

    ArrayList<String> taskList;
    ArrayAdapter<String>aaTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etToDo = findViewById(R.id.editTextToDo);
        btnAdd = findViewById(R.id.buttonAdd);
        btnClear = findViewById(R.id.buttonClear);
        lvToDo = findViewById(R.id.listViewToDo);

        taskList  = new ArrayList<>();
//        aaTask.add("Red");
//        aaTask.add("Orange");

        aaTask  = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, taskList);

        lvToDo.setAdapter(aaTask);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taskName = etToDo.getText().toString();
//                alColours.add(colourName);
//                int pos = Integer.parseInt(etIndexElement.getText().toString());
                taskList.add(taskName);
                aaTask.notifyDataSetChanged();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taskList.clear();
                aaTask.notifyDataSetChanged();
            }
        });

    }
}
