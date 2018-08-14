package com.example.syedalijaffery.myapplication;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button dwnbtn;
    Uri imagess = Uri.parse("http://songs.apniisp.com/Drama%20OST%20Songs/HumTV/08%20-%20Khamoshi%20-%20OST%20-%20HumTV%20(ApniISP.Com).mp3");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dwnbtn = findViewById(R.id.button);

        dwnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DownloadManager.Request request = new DownloadManager.Request(imagess);
                request.setTitle("Music File");
                request.setDescription("Its a music File");
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                DownloadManager manager = (DownloadManager) getApplication().getSystemService(Context.DOWNLOAD_SERVICE);
                manager.enqueue(request);
            }
        });
    }


}
