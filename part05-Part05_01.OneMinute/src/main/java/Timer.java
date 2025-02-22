public class Timer {
    private ClockHand milis;
    private ClockHand seconds;
    
    public Timer(){
        this.milis = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance(){
        this.milis.advance();
        
        if(this.milis.value() == 0){
            this.seconds.advance();
        }
    }
    
    public String toString(){
        return seconds + ":" + milis;
    }
}
