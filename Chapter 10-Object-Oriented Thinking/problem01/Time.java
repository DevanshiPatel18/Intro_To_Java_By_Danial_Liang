package problem1;


class Time{
    private long hour,minute,second;

    public Time(){
        this(System.currentTimeMillis());    
    }

    public Time(long elapsedTime){
        setTime(elapsedTime);
    }

    public Time(long hour, long minute,long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(long elapsedTime){

        this.hour = (elapsedTime/3600000)%24;
        this.minute = (elapsedTime/60000)%60;
        this.second = (elapsedTime/1000)%60; 
    }
    public long getHour(){
        return this.hour;
    }
    public long getMinute(){
        return this.minute;
    }
    public long getSecond(){
        return this.second;
    }
    
    @Override
    public String toString(){
        return (this.hour+":"+this.minute+":"+this.second);
    }

}