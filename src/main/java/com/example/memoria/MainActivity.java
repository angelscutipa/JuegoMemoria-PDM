package com.example.memoria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import java.util.concurrent.TimeUnit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imagen1, imagen2, imagen3, imagen4;
    private Integer[] Lis_act, Lis_enc;
    private Integer pared_correc;
    private Button btSig;
    private TextView tv1, tvG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSig=(Button)findViewById(R.id.button1);

        imagen1=(ImageView)findViewById(R.id.imageView3);
        imagen2=(ImageView)findViewById(R.id.imageView4);
        imagen3=(ImageView)findViewById(R.id.imageView5);
        imagen4=(ImageView)findViewById(R.id.imageView6);

        tv1=(TextView)findViewById(R.id.textView3);
        tvG=(TextView)findViewById(R.id.textView6);

        Lis_act=new Integer[4];  // creamos una lista para saber quienes estan volteados 1 si estan volteados y 0 caso contrario
        Lis_enc=new Integer[4];  // creamos una lista para saber quienes estan emparejados 1 si estan emparejados y 0 caso contrario
        Lis_act[0]=Lis_act[1]=Lis_act[2]=Lis_act[3]=0;
        Lis_enc[0]=Lis_enc[1]=Lis_enc[2]=Lis_enc[3]=0;
        pared_correc=0;

    }

    public void CImagen1(View view){  // funcion si volteamos una imagen
        if (Lis_act[0]==0 && Lis_enc[0]==0){  // esta condicion nos ayuda a voltear una imagen
            imagen1.setImageResource(R.mipmap.huaweiy72);
            Lis_act[0]=1;
        }
        else if(Lis_act[0]==1 && Lis_enc[0]==0){  // aqui regresamos a la condicion inicial
            imagen1.setImageResource(R.drawable.ic_launcher_background);
            Lis_act[0]=0;
        }

        if (Lis_act[2]==1){    // Si encontramos par cambiamos valores en la lista de emparejamiento
            Toast.makeText(this, "PAR ENCONTRADO!!!", Toast.LENGTH_SHORT).show();
            Lis_enc[0]=Lis_enc[2]=1;
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3])%2==0){               // Aqui regresamos a su condicion inicial los 2
            Toast.makeText(this, "NO SON IGUALES!!!", Toast.LENGTH_SHORT).show();  // ultimos volteados si no son iguales

            if (Lis_enc[1]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen2.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen2.postDelayed(r, 1000);
                Lis_act[1]=0;
            }
            if(Lis_enc[2]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen3.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen3.postDelayed(r, 1000);
                Lis_act[2]=0;
            }
            if(Lis_enc[3]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen4.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen4.postDelayed(r, 1000);
                Lis_act[3]=0;
            }
            if(Lis_enc[0]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen1.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen1.postDelayed(r, 1000);
                Lis_act[0]=0;
            }
        }
        visible_b(view);// esta funcion nos ayuda a determinar si hubo emparejamiento y lo muestra en el puntaje
        // de haber ganado se activa un boton para pasar al siguiente nivel
    }

    public void CImagen2(View view){

        if (Lis_act[1]==0){
            imagen2.setImageResource(R.mipmap.realmec3);
            Lis_act[1]=1;
        }
        else if(Lis_act[1]==1){
            imagen2.setImageResource(R.drawable.ic_launcher_background);
            Lis_act[1]=0;
        }

        if (Lis_act[3]==1){
            Toast.makeText(this, "PAR ENCONTRADO!!!", Toast.LENGTH_SHORT).show();
            Lis_enc[1]=Lis_enc[3]=1;
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3])%2==0){
            Toast.makeText(this, "NO SON IGUALES!!!", Toast.LENGTH_SHORT).show();

            if (Lis_enc[1]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen2.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen2.postDelayed(r, 1000);
                Lis_act[1]=0;
            }
            if(Lis_enc[2]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen3.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen3.postDelayed(r, 1000);
                Lis_act[2]=0;
            }
            if(Lis_enc[3]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen4.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen4.postDelayed(r, 1000);
                Lis_act[3]=0;
            }
            if(Lis_enc[0]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen1.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen1.postDelayed(r, 1000);
                Lis_act[0]=0;
            }
        }
        visible_b(view);
    }

    public void CImagen3(View view){

        if (Lis_act[2]==0){
            imagen3.setImageResource(R.mipmap.huaweiy72);
            Lis_act[2]=1;
        }
        else if(Lis_act[2]==1){
            imagen3.setImageResource(R.drawable.ic_launcher_background);
            Lis_act[2]=0;
        }

        if (Lis_act[0]==1){
            Toast.makeText(this, "PAR ENCONTRADO!!!", Toast.LENGTH_SHORT).show();
            Lis_enc[0]=Lis_enc[2]=1;
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3])%2==0){
            Toast.makeText(this, "NO SON IGUALES!!!", Toast.LENGTH_SHORT).show();

            if (Lis_enc[1]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen2.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen2.postDelayed(r, 1000);
                Lis_act[1]=0;
            }
            if(Lis_enc[2]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen3.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen3.postDelayed(r, 1000);
                Lis_act[2]=0;
            }
            if(Lis_enc[3]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen4.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen4.postDelayed(r, 1000);
                Lis_act[3]=0;
            }
            if(Lis_enc[0]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen1.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen1.postDelayed(r, 1000);
                Lis_act[0]=0;
            }
        }
        visible_b(view);

    }

    public void CImagen4(View view){
        if (Lis_act[3]==0){
            imagen4.setImageResource(R.mipmap.realmec3);
            Lis_act[3]=1;
        }
        else if(Lis_act[3]==1){
            imagen4.setImageResource(R.drawable.ic_launcher_background);
            Lis_act[3]=0;
        }

        if (Lis_act[1]==1){
            Toast.makeText(this, "PAR ENCONTRADO!!!", Toast.LENGTH_SHORT).show();
            Lis_enc[1]=Lis_enc[3]=1;
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3])%2==0){
            Toast.makeText(this, "NO SON IGUALES!!!", Toast.LENGTH_SHORT).show();

            if (Lis_enc[1]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen2.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen2.postDelayed(r, 1000);
                Lis_act[1]=0;
            }
            if(Lis_enc[2]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen3.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen3.postDelayed(r, 1000);
                Lis_act[2]=0;
            }
            if(Lis_enc[3]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen4.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen4.postDelayed(r, 1000);
                Lis_act[3]=0;
            }
            if(Lis_enc[0]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen1.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen1.postDelayed(r, 1000);
                Lis_act[0]=0;
            }

        }
        visible_b(view);

    }

    public void visible_b(View view){
        if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3])==2){
            tv1.setText("Puntaje: 2/4");
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3])==4){
            tv1.setText("Puntaje: 4/4");
            btSig.setVisibility(View.VISIBLE);
            tvG.setVisibility(View.VISIBLE);
        }
    }
    public void sig_nivel(View view){
        Intent siguiente=new Intent(this, nivel2.class);
        startActivity(siguiente);
    }
}