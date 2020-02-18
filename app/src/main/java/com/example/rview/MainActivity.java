package com.example.rview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private MainAdapter mainAdapter;

    private MainAdapter.ItemClickListener itemClickListener = new MainAdapter.ItemClickListener() {
        @Override
        public void onItemClick(String item, int position) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("image", item);
            intent.putExtra("logo", item);
            intent.putExtra("content", item);
            intent.putExtra("title", item);

            startActivity(intent);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<String> content = new ArrayList<>();
        ArrayList<String> image = new ArrayList<>();
        ArrayList<String> title = new ArrayList<>();
        ArrayList<String> logo = new ArrayList<>();

        logo.add("https://core-electronics.com.au/media/catalog/product/cache/1/image/650x650/fe1bcd18654db18f328c2faaaf3c690a/a/0/a000066_front_2_1_1_1.jpg");
        title.add("Adruino");
        image.add("https://topwar.ru/uploads/posts/2019-02/1551243369_1.jpg");
        content.add("Arduino — торговая марка аппаратно-программных средств");

        logo.add("https://tukatuki.ru/image/cache/catalog/products/toys/rctoys/hg715_3-800x800.jpg");
        title.add("Robotics");
        image.add("http://www.icover.ru/upload/iblock/73f/73f91d28ddc498bdd0337498c91ead6d.jpg");
        content.add("Ро́бот — автоматическое устройство, предназначенное для осуществления");

        logo.add("http://kkoop.ru/wp-content/uploads/2018/09/5.-Sokrashheniya.jpg");
        title.add("Automation");
        image.add("https://iot.ru/upload/resize_cache/iblock/458/860_490_1/458a0d6231db931b43bc402a664f6ca2.jpg");
        content.add("Автоматиза́ция произво́дства — это процесс в развитии машинного производства");

        logo.add("https://core-electronics.com.au/media/catalog/product/cache/1/image/650x650/fe1bcd18654db18f328c2faaaf3c690a/a/0/a000066_front_2_1_1_1.jpg");
        title.add("Adruino");
        image.add("https://topwar.ru/uploads/posts/2019-02/1551243369_1.jpg");
        content.add("Arduino — торговая марка аппаратно-программных средств");

        logo.add("https://tukatuki.ru/image/cache/catalog/products/toys/rctoys/hg715_3-800x800.jpg");
        title.add("Robotics");
        image.add("http://www.icover.ru/upload/iblock/73f/73f91d28ddc498bdd0337498c91ead6d.jpg");
        content.add("Ро́бот — автоматическое устройство, предназначенное для осуществления");

        logo.add("http://kkoop.ru/wp-content/uploads/2018/09/5.-Sokrashheniya.jpg");
        title.add("Automation");
        image.add("https://iot.ru/upload/resize_cache/iblock/458/860_490_1/458a0d6231db931b43bc402a664f6ca2.jpg");
        content.add("Автоматиза́ция произво́дства — это процесс в развитии машинного производства");

        logo.add("https://core-electronics.com.au/media/catalog/product/cache/1/image/650x650/fe1bcd18654db18f328c2faaaf3c690a/a/0/a000066_front_2_1_1_1.jpg");
        title.add("Adruino");
        image.add("https://topwar.ru/uploads/posts/2019-02/1551243369_1.jpg");
        content.add("Arduino — торговая марка аппаратно-программных средств");

        logo.add("https://tukatuki.ru/image/cache/catalog/products/toys/rctoys/hg715_3-800x800.jpg");
        title.add("Robotics");
        image.add("http://www.icover.ru/upload/iblock/73f/73f91d28ddc498bdd0337498c91ead6d.jpg");
        content.add("Ро́бот — автоматическое устройство, предназначенное для осуществления");

        logo.add("http://kkoop.ru/wp-content/uploads/2018/09/5.-Sokrashheniya.jpg");
        title.add("Automation");
        image.add("https://iot.ru/upload/resize_cache/iblock/458/860_490_1/458a0d6231db931b43bc402a664f6ca2.jpg");
        content.add("Автоматиза́ция произво́дства — это процесс в развитии машинного производства");

        logo.add("https://core-electronics.com.au/media/catalog/product/cache/1/image/650x650/fe1bcd18654db18f328c2faaaf3c690a/a/0/a000066_front_2_1_1_1.jpg");
        title.add("Adruino");
        image.add("https://topwar.ru/uploads/posts/2019-02/1551243369_1.jpg");
        content.add("Arduino — торговая марка аппаратно-программных средств");

        logo.add("https://tukatuki.ru/image/cache/catalog/products/toys/rctoys/hg715_3-800x800.jpg");
        title.add("Robotics");
        image.add("http://www.icover.ru/upload/iblock/73f/73f91d28ddc498bdd0337498c91ead6d.jpg");
        content.add("Ро́бот — автоматическое устройство, предназначенное для осуществления");

        logo.add("http://kkoop.ru/wp-content/uploads/2018/09/5.-Sokrashheniya.jpg");
        title.add("Automation");
        image.add("https://iot.ru/upload/resize_cache/iblock/458/860_490_1/458a0d6231db931b43bc402a664f6ca2.jpg");
        content.add("Автоматиза́ция произво́дства — это процесс в развитии машинного производства");

        logo.add("https://core-electronics.com.au/media/catalog/product/cache/1/image/650x650/fe1bcd18654db18f328c2faaaf3c690a/a/0/a000066_front_2_1_1_1.jpg");
        title.add("Adruino");
        image.add("https://topwar.ru/uploads/posts/2019-02/1551243369_1.jpg");
        content.add("Arduino — торговая марка аппаратно-программных средств");

        logo.add("https://tukatuki.ru/image/cache/catalog/products/toys/rctoys/hg715_3-800x800.jpg");
        title.add("Robotics");
        image.add("http://www.icover.ru/upload/iblock/73f/73f91d28ddc498bdd0337498c91ead6d.jpg");
        content.add("Ро́бот — автоматическое устройство, предназначенное для осуществления");

        logo.add("http://kkoop.ru/wp-content/uploads/2018/09/5.-Sokrashheniya.jpg");
        title.add("Automation");
        image.add("https://iot.ru/upload/resize_cache/iblock/458/860_490_1/458a0d6231db931b43bc402a664f6ca2.jpg");
        content.add("Автоматиза́ция произво́дства — это процесс в развитии машинного производства");

        logo.add("https://core-electronics.com.au/media/catalog/product/cache/1/image/650x650/fe1bcd18654db18f328c2faaaf3c690a/a/0/a000066_front_2_1_1_1.jpg");
        title.add("Adruino");
        image.add("https://topwar.ru/uploads/posts/2019-02/1551243369_1.jpg");
        content.add("Arduino — торговая марка аппаратно-программных средств");

        logo.add("https://tukatuki.ru/image/cache/catalog/products/toys/rctoys/hg715_3-800x800.jpg");
        title.add("Robotics");
        image.add("http://www.icover.ru/upload/iblock/73f/73f91d28ddc498bdd0337498c91ead6d.jpg");
        content.add("Ро́бот — автоматическое устройство, предназначенное для осуществления");

        logo.add("http://kkoop.ru/wp-content/uploads/2018/09/5.-Sokrashheniya.jpg");
        title.add("Automation");
        image.add("https://iot.ru/upload/resize_cache/iblock/458/860_490_1/458a0d6231db931b43bc402a664f6ca2.jpg");
        content.add("Автоматиза́ция произво́дства — это процесс в развитии машинного производства");

        logo.add("https://core-electronics.com.au/media/catalog/product/cache/1/image/650x650/fe1bcd18654db18f328c2faaaf3c690a/a/0/a000066_front_2_1_1_1.jpg");
        title.add("Adruino");
        image.add("https://topwar.ru/uploads/posts/2019-02/1551243369_1.jpg");
        content.add("Arduino — торговая марка аппаратно-программных средств");

        logo.add("https://tukatuki.ru/image/cache/catalog/products/toys/rctoys/hg715_3-800x800.jpg");
        title.add("Robotics");
        image.add("http://www.icover.ru/upload/iblock/73f/73f91d28ddc498bdd0337498c91ead6d.jpg");
        content.add("Ро́бот — автоматическое устройство, предназначенное для осуществления");

        logo.add("http://kkoop.ru/wp-content/uploads/2018/09/5.-Sokrashheniya.jpg");
        title.add("Automation");
        image.add("https://iot.ru/upload/resize_cache/iblock/458/860_490_1/458a0d6231db931b43bc402a664f6ca2.jpg");
        content.add("Автоматиза́ция произво́дства — это процесс в развитии машинного производства");

        logo.add("https://core-electronics.com.au/media/catalog/product/cache/1/image/650x650/fe1bcd18654db18f328c2faaaf3c690a/a/0/a000066_front_2_1_1_1.jpg");
        title.add("Adruino");
        image.add("https://topwar.ru/uploads/posts/2019-02/1551243369_1.jpg");
        content.add("Arduino — торговая марка аппаратно-программных средств");

        logo.add("https://tukatuki.ru/image/cache/catalog/products/toys/rctoys/hg715_3-800x800.jpg");
        title.add("Robotics");
        image.add("http://www.icover.ru/upload/iblock/73f/73f91d28ddc498bdd0337498c91ead6d.jpg");
        content.add("Ро́бот — автоматическое устройство, предназначенное для осуществления");

        logo.add("http://kkoop.ru/wp-content/uploads/2018/09/5.-Sokrashheniya.jpg");
        title.add("Automation");
        image.add("https://iot.ru/upload/resize_cache/iblock/458/860_490_1/458a0d6231db931b43bc402a664f6ca2.jpg");
        content.add("Автоматиза́ция произво́дства — это процесс в развитии машинного производства");








        mainAdapter = new MainAdapter(content, image, title, logo, this );
        recyclerView.setAdapter(mainAdapter);
    }


}
