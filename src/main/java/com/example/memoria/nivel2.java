package com.example.memoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class nivel2 extends AppCompatActivity {
    private ImageView imagen1, imagen2, imagen3, imagen4, imagen5, imagen6;
    private Integer[] Lis_act, Lis_enc;
    private TextView tv1, tvG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel2);
        //LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ancho, alto);
        //myImageView.setLayoutParams(params);

        imagen1=(ImageView)findViewById(R.id.imageView1a);
        imagen2=(ImageView)findViewById(R.id.imageView2a);
        imagen3=(ImageView)findViewById(R.id.imageView3a);
        imagen4=(ImageView)findViewById(R.id.imageView4a);
        imagen5=(ImageView)findViewById(R.id.imageView5a);
        imagen6=(ImageView)findViewById(R.id.imageView6a);


        tv1=(TextView)findViewById(R.id.textView4);
        tvG=(TextView)findViewById(R.id.textView5);
        tv1.setText("Puntaje: 0/6");

        Lis_act=new Integer[6];  // creamos una lista para saber quienes estan volteados 1 si estan volteados y 0 caso contrario
        Lis_enc=new Integer[6];  // creamos una lista para saber quienes estan emparejados 1 si estan emparejados y 0 caso contrario
        Lis_act[0]=Lis_act[1]=Lis_act[2]=Lis_act[3]=Lis_act[4]=Lis_act[5]=0;
        Lis_enc[0]=Lis_enc[1]=Lis_enc[2]=Lis_enc[3]=Lis_enc[4]=Lis_enc[5]=0;

    }
    public void CImagen1a(View view){  // funcion si volteamos una imagen

        if (Lis_act[0]==0 && Lis_enc[0]==0){ // esta condicion nos ayuda a voltear una imagen
            imagen1.setImageResource(R.mipmap.l1gk22);
            Lis_act[0]=1;
        }
        else if(Lis_act[0]==1 && Lis_enc[0]==0){  // aqui regresamos a la condicion inicial
            imagen1.setImageResource(R.drawable.ic_launcher_background);
            Lis_act[0]=0;
        }

        if (Lis_act[5]==1){ // Si encontramos par cambiamos valores en la lista de emparejamiento
            Toast.makeText(this, "PAR ENCONTRADO!!!", Toast.LENGTH_SHORT).show();
            Lis_enc[0]=Lis_enc[5]=1;
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3]+Lis_act[4]+Lis_act[5])%2==0){  // Aqui regresamos a su condicion inicial los 2
            Toast.makeText(this, "NO SON IGUALES!!!", Toast.LENGTH_SHORT).show();   // ultimos volteados si no son iguales

            if(Lis_enc[0]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen1.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen1.postDelayed(r, 1000);
                Lis_act[0]=0;
            }
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
            if(Lis_enc[4]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen5.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen5.postDelayed(r, 1000);
                Lis_act[4]=0;
            }
            if(Lis_enc[5]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen6.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen6.postDelayed(r, 1000);
                Lis_act[5]=0;
            }

        }
        visible_b(view);  // esta funcion nos ayuda a determinar si hubo emparejamiento y lo muestra en el puntaje
                            // de haber ganado se activa un boton para pasar al siguiente nivel
    }
    public void CImagen2a(View view){

        if (Lis_act[1]==0 && Lis_enc[1]==0){
            imagen2.setImageResource(R.mipmap.samsuna21s2);
            Lis_act[1]=1;
        }
        else if(Lis_act[1]==1 && Lis_enc[1]==0){
            imagen2.setImageResource(R.drawable.ic_launcher_background);
            Lis_act[1]=0;
        }

        if (Lis_act[4]==1){
            Toast.makeText(this, "PAR ENCONTRADO!!!", Toast.LENGTH_SHORT).show();
            Lis_enc[1]=Lis_enc[4]=1;
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3]+Lis_act[4]+Lis_act[5])%2==0){
            Toast.makeText(this, "NO SON IGUALES!!!", Toast.LENGTH_SHORT).show();

            if(Lis_enc[0]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen1.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen1.postDelayed(r, 1000);
                Lis_act[0]=0;
            }
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
            if(Lis_enc[4]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen5.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen5.postDelayed(r, 1000);
                Lis_act[4]=0;
            }
            if(Lis_enc[5]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen6.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen6.postDelayed(r, 1000);
                Lis_act[5]=0;
            }
        }
        visible_b(view);
    }
    public void CImagen3a(View view){
        if (Lis_act[2]==0 && Lis_enc[2]==0){
            imagen3.setImageResource(R.mipmap.vivoy31);
            Lis_act[2]=1;
        }
        else if(Lis_act[2]==1 && Lis_enc[2]==0){
            imagen3.setImageResource(R.drawable.ic_launcher_background);
            Lis_act[2]=0;
        }

        if (Lis_act[3]==1){
            Toast.makeText(this, "PAR ENCONTRADO!!!", Toast.LENGTH_SHORT).show();
            Lis_enc[2]=Lis_enc[3]=1;
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3]+Lis_act[4]+Lis_act[5])%2==0){
            Toast.makeText(this, "NO SON IGUALES!!!", Toast.LENGTH_SHORT).show();

            if(Lis_enc[0]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen1.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen1.postDelayed(r, 1000);
                Lis_act[0]=0;
            }
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
            if(Lis_enc[4]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen5.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen5.postDelayed(r, 1000);
                Lis_act[4]=0;
            }
            if(Lis_enc[5]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen6.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen6.postDelayed(r, 1000);
                Lis_act[5]=0;
            }
        }
        visible_b(view);
    }
    public void CImagen4a(View view){
        if (Lis_act[3]==0 && Lis_enc[3]==0){
            imagen4.setImageResource(R.mipmap.vivoy31);
            Lis_act[3]=1;
        }
        else if(Lis_act[3]==1 && Lis_enc[3]==0){
            imagen4.setImageResource(R.drawable.ic_launcher_background);
            Lis_act[3]=0;
        }

        if (Lis_act[2]==1){
            Toast.makeText(this, "PAR ENCONTRADO!!!", Toast.LENGTH_SHORT).show();
            Lis_enc[2]=Lis_enc[3]=1;
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3]+Lis_act[4]+Lis_act[5])%2==0){
            Toast.makeText(this, "NO SON IGUALES!!!", Toast.LENGTH_SHORT).show();

            if(Lis_enc[0]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen1.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen1.postDelayed(r, 1000);
                Lis_act[0]=0;
            }
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
            if(Lis_enc[4]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen5.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen5.postDelayed(r, 1000);
                Lis_act[4]=0;
            }
            if(Lis_enc[5]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen6.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen6.postDelayed(r, 1000);
                Lis_act[5]=0;
            }
        }
        visible_b(view);
    }
    public void CImagen5a(View view){
        if (Lis_act[4]==0 && Lis_enc[4]==0){
            imagen5.setImageResource(R.mipmap.samsuna21s2);
            Lis_act[4]=1;
        }
        else if(Lis_act[4]==1 && Lis_enc[4]==0){
            imagen5.setImageResource(R.drawable.ic_launcher_background);
            Lis_act[4]=0;
        }

        if (Lis_act[1]==1){
            Toast.makeText(this, "PAR ENCONTRADO!!!", Toast.LENGTH_SHORT).show();
            Lis_enc[1]=Lis_enc[4]=1;
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3]+Lis_act[4]+Lis_act[5])%2==0){
            Toast.makeText(this, "NO SON IGUALES!!!", Toast.LENGTH_SHORT).show();

            if(Lis_enc[0]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen1.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen1.postDelayed(r, 1000);
                Lis_act[0]=0;
            }
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
            if(Lis_enc[4]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen5.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen5.postDelayed(r, 1000);
                Lis_act[4]=0;
            }
            if(Lis_enc[5]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen6.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen6.postDelayed(r, 1000);
                Lis_act[5]=0;
            }
        }
        visible_b(view);
    }
    public void CImagen6a(View view){
        if (Lis_act[5]==0 && Lis_enc[5]==0){
            imagen6.setImageResource(R.mipmap.l1gk22);
            Lis_act[5]=1;
        }
        else if(Lis_act[5]==1 && Lis_enc[5]==0){
            imagen6.setImageResource(R.drawable.ic_launcher_background);
            Lis_act[5]=0;
        }

        if (Lis_act[0]==1){
            Toast.makeText(this, "PAR ENCONTRADO!!!", Toast.LENGTH_SHORT).show();
            Lis_enc[5]=Lis_enc[0]=1;
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3]+Lis_act[4]+Lis_act[5])%2==0){
            Toast.makeText(this, "NO SON IGUALES!!!", Toast.LENGTH_SHORT).show();

            if(Lis_enc[0]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen1.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen1.postDelayed(r, 1000);
                Lis_act[0]=0;
            }
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
            if(Lis_enc[4]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen5.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen5.postDelayed(r, 1000);
                Lis_act[4]=0;
            }
            if(Lis_enc[5]==0){
                Runnable r = new Runnable(){
                    public void run(){
                        imagen6.setImageResource(R.drawable.ic_launcher_background);
                    }
                };
                imagen6.postDelayed(r, 1000);
                Lis_act[5]=0;
            }
        }
        visible_b(view);
    }

    public void visible_b(View view){
        if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3]+Lis_act[4]+Lis_act[5])==2){
            tv1.setText("Puntaje: 2/6");
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3]+Lis_act[4]+Lis_act[5])==4){
            tv1.setText("Puntaje: 4/6");
        }
        else if((Lis_act[0]+Lis_act[1]+Lis_act[2]+Lis_act[3]+Lis_act[4]+Lis_act[5])==6){
            tv1.setText("Puntaje: 6/6");
            tvG.setVisibility(View.VISIBLE);
        }
    }
}