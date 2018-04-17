package javaapp0416;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fecha
{
    public static int ANIO_DESDE = 1800;
    public static int ANIO_HASTA = 2500;

    private int dia;
    private int mes;
    private int anio;

    public static String getFechaTel()
    {
        return new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().
                getTime());
    }

    public static String getHoraTel()
    {
        Date dt = new Date();

        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        String formatteHour = df.format(dt.getTime());
        return formatteHour;
    }

    public  Fecha()
    {
        this(new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().
                getTime()));
    }

    public int toEntero()
    {
        return (getAnio()*10000) + (getMes()*100) + getDia();
    }

    public Fecha(int aaaammdd)
    {
        setDia(aaaammdd % 100);
        setMes((aaaammdd/100)%100);
        setAnio(aaaammdd/10000);
    }

    public Fecha(int dia,int mes,int anio)
    {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    public Fecha(String dd_mm_aaaa)
    {
        String [] s = dd_mm_aaaa.split("/");
        setDia(Integer.valueOf(s[0]));
        setMes(Integer.valueOf(s[1]));
        setAnio(Integer.valueOf(s[2]));
    }

    public String toString()
    {
        return   getDia()+"/"+getMes()+"/"+ getAnio();
    }


    private int losDiasDelMes()
    {
        int dias = 30;

        if (getMes() ==1 || getMes() ==3|| getMes() ==5|| getMes() ==7|| getMes() ==8|| getMes() ==10|| getMes() ==12)
        {
            dias = 31;
        }
        else
        {
            if(getMes() ==2 )
            {
                if (esBisiesto())
                {
                    dias = 29;
                }
                else
                {
                    dias = 28;
                }
            }
        }
        return dias;
    }

    private boolean esBisiesto()
    {
        return (getAnio() % 4 == 0) && ((getAnio() % 100 != 0) || (getAnio() % 400 == 0));
    }

    public boolean esPrimavera()
    {
        return ((getDia() >=21&& getMes() ==9)||(getMes() ==10)||(getMes() ==11)||(getDia() <21&& getMes() ==12));
    }
    public boolean esInvierno()
    {
        return ((getDia() >=21&& getMes() ==6)||(getMes() ==7)||(getMes() ==8)||(getDia() <21&& getMes() ==9));
    }
    public boolean esVerano()
    {
        return ((getDia() >=21&& getMes() ==12)||(getMes() ==1)||(getMes() ==2)||(getDia() <21&& getMes() ==3));
    }
    public boolean esOtonio()
    {
        return ((getDia() >=21&& getMes() ==3)||(getMes() ==4)||(getMes() ==5)||(getDia() <21&& getMes() ==6));
    }

    public boolean esValida()
    {
        return getAnio() < ANIO_DESDE|| getAnio() >ANIO_HASTA|| getMes() <1|| getMes() >12|| getDia() <1|| getDia() > losDiasDelMes();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
