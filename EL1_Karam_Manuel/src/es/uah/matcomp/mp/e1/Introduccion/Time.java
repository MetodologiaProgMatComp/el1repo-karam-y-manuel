package es.uah.matcomp.mp.e1.Introduccion;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time (int hour, int minute, int second){
        if (0 > hour&&hour>= 24){System.out.println("hora no válida");}
        else this.hour = hour;
        if (0> minute&&minute>= 60){System.out.println("minútos no válidos");}
        else this.minute = minute;
        if (0> second&&second>= 60){System.out.println("segundos no válidos");}
        else this.second = second;

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime (int hour, int minute, int second ) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString(){
        return String.format("%02d:%02d:%02d",hour, minute, second);
    }
    public Time nextSecond(){
        if (second == 59){
            second = 0;
            if (minute == 59){
                minute = 0;
                if (hour == 23){
                    hour =0;
                }
                else {hour = hour + 1; }

            }
            else {minute = minute + 1;}

        }
        else {second = second +1;}

        return this;
    }

    public Time previousSecond(){
        if (second == 0){
            second = 59;
            if (minute == 0){
                minute = 59;
                if (hour == 0){
                    hour =23;
                }
                else {hour = hour - 1; }

            }
            else {minute = minute - 1;}

        }
        else {second = second -1;}

        return this;
    }
}
