package id.putraprima.dts07Belajar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.putraprima.dts07Belajar.adapter.SchoolAdapter;
import id.putraprima.dts07Belajar.models.School;

public class SchoolActivity extends AppCompatActivity {

    private RecyclerView rvSchool;
    private List<School> listSchool = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
        rvSchool = findViewById(R.id.rvSchool);
        listSchool.add(new School("Sekolah Dasar"));
        listSchool.add(new School("Sekolah Menengah Pertama"));
        listSchool.add(new School("Sekolah Menengah Atas"));
        listSchool.add(new School("Sarjana"));
        listSchool.add(new School("Pasca Sarjana"));
        listSchool.add(new School("Doktoral"));
        listSchool.add(new School("Profesor"));

        rvSchool.setLayoutManager(new LinearLayoutManager(this));
        rvSchool.setAdapter(new SchoolAdapter(R.layout.item_school,listSchool));
    }
}