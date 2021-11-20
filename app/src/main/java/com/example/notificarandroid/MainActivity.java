package com.example.notificarandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNotificarProg1 = (Button) findViewById(R.id.btnNotificar1);
        btnNotificarProg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String mensagem1 = "50% de desconto.";
                String titulo1 = "Promoção!";
                notificarUsuario1(mensagem1, titulo1);
            }

            private void notificarUsuario1(String mensagem1, String titulo1) {
                NotificationCompat.Builder notificacao1 = new NotificationCompat.Builder(getBaseContext());
                notificacao1.setContentTitle(titulo1);
                notificacao1.setContentText(mensagem1);
                notificacao1.setPriority(Notification.PRIORITY_HIGH);
                notificacao1.setSmallIcon(R.drawable.ic_launcher_foreground);
                notificacao1.setAutoCancel(true);
                Intent it = new Intent(getBaseContext(), Promocao1.class);
                PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);
                notificacao1.setContentIntent(pit);
                NotificationManager notificar1 = (NotificationManager)getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);
                notificar1.notify(9000, notificacao1.build());
            }
        });
            Button btnNotificarProg2 = (Button) findViewById(R.id.btnNotificar2);
             btnNotificarProg2.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     String mensagem2 = "50% de desconto.";
                     String titulo2 = "Promoção!";
                     notificarUsuario2(mensagem2, titulo2);
                 }

             private void notificarUsuario2(String mensagem2, String titulo2) {
                 NotificationCompat.Builder notificacao2 = new NotificationCompat.Builder(getBaseContext());
                 notificacao2.setContentTitle(titulo2);
                 notificacao2.setContentText(mensagem2);
                 notificacao2.setPriority(Notification.PRIORITY_HIGH);
                 notificacao2.setSmallIcon(R.drawable.ic_launcher_foreground);
                 notificacao2.setAutoCancel(true);
                 Intent it = new Intent(getBaseContext(), Promocao2.class);
                 PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);
                 notificacao2.setContentIntent(pit);
                 NotificationManager notificar2 = (NotificationManager) getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);
                 notificar2.notify(9001, notificacao2.build());
             }
        });
    }
}