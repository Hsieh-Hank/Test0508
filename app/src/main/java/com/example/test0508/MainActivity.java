package com.example.test0508;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvMyData);

        List<StuData> stuDataList = new ArrayList<>();
        stuDataList.add(new StuData("https://www.apple.com/newsroom/images/logos/quick-reads-logos/Apple-environment-logo.jpg.square_social.jpg", "John", "180"));
        stuDataList.add(new StuData("https://www.apple.com/newsroom/images/logos/quick-reads-logos/Apple-environment-logo.jpg.square_social.jpg", "Tom", "175"));
        stuDataList.add(new StuData("https://www.apple.com/newsroom/images/logos/quick-reads-logos/Apple-environment-logo.jpg.square_social.jpg", "Jerry", "170"));
        stuDataList.add(new StuData("https://www.apple.com/newsroom/images/logos/quick-reads-logos/Apple-environment-logo.jpg.square_social.jpg", "Mike", "165"));
        stuDataList.add(new StuData("https://www.apple.com/newsroom/images/logos/quick-reads-logos/Apple-environment-logo.jpg.square_social.jpg", "Jack", "160"));
        stuDataList.add(new StuData("https://www.apple.com/newsroom/images/logos/quick-reads-logos/Apple-environment-logo.jpg.square_social.jpg", "Rose", "155"));
        stuDataList.add(new StuData("https://www.apple.com/newsroom/images/logos/quick-reads-logos/Apple-environment-logo.jpg.square_social.jpg", "Lily", "150"));
        stuDataList.add(new StuData("https://www.apple.com/newsroom/images/logos/quick-reads-logos/Apple-environment-logo.jpg.square_social.jpg", "Lucy", "145"));
        stuDataList.add(new StuData("https://www.apple.com/newsroom/images/logos/quick-reads-logos/Apple-environment-logo.jpg.square_social.jpg", "Bob", "140"));
        stuDataList.add(new StuData("https://www.apple.com/newsroom/images/logos/quick-reads-logos/Apple-environment-logo.jpg.square_social.jpg", "Alice", "135"));

        recyclerView.setAdapter(new StuDataAdapter(stuDataList));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}