package com.example.reproductor_semana5_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class reproductor_de_video extends AppCompatActivity {
VideoView videoView;
//declaramos nuestro boton
Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor_de_video);
        videoView = (VideoView)findViewById(R.id.videoView);
        String path = "android.resource://"+ getPackageName() + "/" + R.raw.video;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
volver=(Button) findViewById(R.id.btVolver);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver= new Intent(reproductor_de_video.this,MainActivity.class);
                startActivity(volver);
            }
        });
    }
}

