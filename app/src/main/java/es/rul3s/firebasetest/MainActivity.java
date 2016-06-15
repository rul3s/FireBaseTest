package es.rul3s.firebasetest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        //
    }

    public void subscribe(View v){
        Log.d("INFO:","Subscribe button");
        FirebaseMessaging.getInstance().subscribeToTopic("test");
    }

    public void unsubscribe(View v){
        Log.d("INFO:","Unsubscribe button");
        FirebaseMessaging.getInstance().unsubscribeFromTopic("test");
    }
}
