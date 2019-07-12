package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvEmployee;
    ArrayList<Employee> EmployeeList;
    ArrayAdapter aaEmployeeList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.lvEmployee);
        EmployeeList = new ArrayList<>();
        Employee e1 = new Employee("John", "Software Technical Leader", "3400.0");
        Employee e2 = new Employee("May", "Programmer", "2200.0");

        EmployeeList.add(e1);
        EmployeeList.add(e2);

        aaEmployeeList = new ArrayAdapter(this, android.R.layout.simple_list_item_1, EmployeeList);
        lvEmployee.setAdapter(aaEmployeeList);
        adapter = new CustomAdapter(this, R.layout.row, EmployeeList);
        lvEmployee.setAdapter(adapter);
    }
}
