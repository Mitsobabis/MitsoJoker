import java.util.Arrays;
import java.util.Random;

public class sus {
    public static java.util.List<Integer> getList1() {
        return Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40);
    }
    public static  java.util.List<Integer> getBannedList(){
        return Arrays.asList(0,0,0,0,0,0);
    }

    public static int getInt1() {
        Random rand = new Random();
        var n = getList1().get(rand.nextInt(getList1().size()));
        getBannedList().set(1,n);
        return n;
    }
    public static int getInt2() {
        Random rand = new Random();
        var n = getList1().get(rand.nextInt(getList1().size()));
        while(getBannedList().contains(getInt1())) {
            System.out.println("[LOG] Got a number that has a value same to a previous one (" + n + ")");
            n = getList1().get(rand.nextInt(getList1().size()));
        }
        getBannedList().set(2,n);
        return n;

    }
    public static int getInt3() {
        Random rand = new Random();
        var n = getList1().get(rand.nextInt(getList1().size()));
        while(getBannedList().contains(getInt1()) || getBannedList().contains(getInt2())) {
            System.out.println("[LOG] Got a number that has a value same to a previous one (" + n + ")");
            n = getList1().get(rand.nextInt(getList1().size()));
        }
        getBannedList().set(3,n);
        return n;

    }
    public static int getInt4() {
        Random rand = new Random();
        var n = getList1().get(rand.nextInt(getList1().size()));
        while(getBannedList().contains(getInt1()) || getBannedList().contains(getInt2()) || getBannedList().contains(getInt3())) {
            System.out.println("[LOG] Got a number that has a value same to a previous one (" + n + ")");
            n = getList1().get(rand.nextInt(getList1().size()));
        }
        getBannedList().set(4,n);
        return n;
    }
    public static int getInt5() {
        Random rand = new Random();
        var n = getList1().get(rand.nextInt(getList1().size()));
        while(getBannedList().contains(getInt1()) || getBannedList().contains(getInt2()) || getBannedList().contains(getInt3()) || getBannedList().contains(getInt4())) {
            System.out.println("[LOG] Got a number that has a value same to a previous one (" + n + ")");
            n = getList1().get(rand.nextInt(getList1().size()));
        }
        getBannedList().set(5,n);
        return n;
    }
    public static int getInt6() {
        Random rand = new Random();
        var n = rand.nextInt(20);
        while(getBannedList().contains(getInt1()) || getBannedList().contains(getInt2()) || getBannedList().contains(getInt3()) || getBannedList().contains(getInt4()) || getBannedList().contains(getInt5())) {
            System.out.println("[LOG] Got a number that has a value same to a previous one (" + n + ")");
            n = rand.nextInt(20);
        }
        getBannedList().set(1,0);
        getBannedList().set(2,0);
        getBannedList().set(3,0);
        getBannedList().set(4,0);
        getBannedList().set(5,0);
        return n;
    }
}