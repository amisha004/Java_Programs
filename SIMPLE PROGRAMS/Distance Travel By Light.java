public class Light {
    public static void main (String[] args){
        int lightspeed;
        long days;
        long seconds;
        long distances;
        lightspeed=186000;
        days=1000;
        seconds=days*24*60*60;
        distances=lightspeed * seconds;

        System.out.println("In " +days);
        System.out.println("days light will travel about");
        System.out.println(distances+ "miles.");
    }
}
