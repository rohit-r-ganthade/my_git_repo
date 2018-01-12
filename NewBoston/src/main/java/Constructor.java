/**
 * Created by rohit on 07/09/17.
 */
public class Constructor {

    private int hour;
    private int minute;
    private int second;

    public Constructor(){
        this(0,0,0);
    }

    public Constructor(int h){
        this(h,0,0);
    }

    public Constructor(int h, int m){
        this(h,m,0);
    }

    public Constructor(int h, int m, int s){
        setTime(h,m,s);
    }

    private void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
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

    private void setHour(int h) {
        hour = ((h>=0 && h<24) ? h : 0);
    }

    private void setMinute(int m) {
        minute = ((m>=0 && m<60) ? m : 0);
    }

    private void setSecond(int s) {
        second = ((s>=0 && s<60) ? s : 0);
    }

    public String toMilitary(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

}
