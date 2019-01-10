
/**
 * 題目編號 Java-B9
 *
 * @param args[0] the element to insert
 * @author Yuyi Lee
 * @version 1.0 Jan-03-2019
 * @since 1.0
 */
public class B9Review {

    public static void main(String args[]){

        Thread threadTest1 = new ThreadPractice("Eat lamb hotpot.");
        Thread threadTest2 = new ThreadPractice("Sleep 50 hours.");
        Thread threadTest3 = new ThreadPractice("Waste money.");
        Thread threadTest4 = new ThreadPractice("Feed Bawan.");

        threadTest1.run();
        threadTest2.run();
        threadTest3.run();
        threadTest4.run();
    }
}

class ThreadPractice extends Thread{
    String thingsToDo = "";
    public ThreadPractice(String thingsToDo){
        this.thingsToDo = thingsToDo;
    }

    public void run(){
        System.out.println(thingsToDo);
    }
}
