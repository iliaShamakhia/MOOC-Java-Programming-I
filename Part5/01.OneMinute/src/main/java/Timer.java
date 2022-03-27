public class Timer {
    private ClockHand hundredsOfSeconds;
    private ClockHand seconds;
    
    public Timer(){
        this.hundredsOfSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public String toString(){
        return seconds + ":" + hundredsOfSeconds;
    }
    
    public void advance(){
        this.hundredsOfSeconds.advance();
        if(this.hundredsOfSeconds.value() == 0){
            this.seconds.advance();
        }
    }
}
