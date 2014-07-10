package com.example.hello_world;

/**
 * Created by nalanulusoyy on 7/10/14.
 */

import android.os.Bundle;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
 class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // Thread hazırlanıyor
        Thread thread = new Thread() {

            @Override
            public void run() {

                try {
                    synchronized (this) {
                        // Uygulama 4 saniye aynı ekranda bekliyor
                        wait(3000);
                    }
                } catch (InterruptedException e) {

                    // Hata yönetimi

                } finally {

                    finish();

                    // Yeni açılmak istenen Intent
                    Intent intent = new Intent();
                    intent.setClass(getApplicationContext(), AnaEkran.class);
                    startActivity(intent);

                }

            }
        };

        // Thread başlatılıyor
        thread.start();

    }
}