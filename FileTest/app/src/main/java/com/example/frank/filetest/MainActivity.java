package com.example.frank.filetest;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;

/**
 * Created by95 on 2015/11/15.
 */
public class MainActivity extends Activity {
    public final String TAG = this.getClass().getSimpleName();
    public Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        Log.d(TAG,"onCreated调用了");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart调用了");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onReStart调用了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume调用了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause调用了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop调用了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy调用了");
    }
}
