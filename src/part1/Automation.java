package part1;

import java.util.*;

public class Automation {

    public static void oddOrEven() {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter Number : " );
        num = scanner.nextInt();
        if(num % 2 == 0)
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
        scanner.close();
    }

    public static void swap1() {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("Enter number a : ");
        a = scanner.nextInt();
        System.out.println();
        System.out.print("Enter number b : ");
        b = scanner.nextInt();
        System.out.println();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped a : " + a);
        System.out.println("Swapped b : " + b);

    }

    public static void swap2() {
        Scanner scanner = new Scanner(System.in);
        int a, b, temp;
        System.out.print("Enter number a : ");
        a = scanner.nextInt();
        System.out.println();
        System.out.print("Enter number b : ");
        b = scanner.nextInt();
        System.out.println();
        temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped a : " + a);
        System.out.println("Swapped b : " + b);

    }

    public static void prime() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Enter Number : ");
        int n = scanner.nextInt();
        if(n == 0 || n == 1) {
            System.out.println("Not Prime");
        } else {
          for(int i = 2; i <= n/2; i++){
              if (n%i == 0){
                  flag = false;
                  break;
              }
          }
        }

        if(flag)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
        scanner.close();
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scanner.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        scanner.close();
    }

    public static void occurrence(String s) {
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                char b = s.charAt(j);
                if(a == b && i > j)
                    break;
                if(a == b)
                    count++;
                if(j == s.length()-1 && i%2 == 1)
                    System.out.println(a + "----------" + count);
            }
        }

    }

    
    public static int test() {
        List<Integer>  list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(6);


        int count = 0, duplicate = 0;

        for (int i = 0; i < list.size(); i++) {
            int i1 = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                int i2 = list.get(j);
                if (i1 == i2 && i > j)
                    break;
                if(i1 == i2)
                    count++;
                if(j == list.size()-1)
                    if(count > 1)
                        duplicate++;
            }
        }
        return duplicate;
    }

    public static int demo() {
        List<Integer>  list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(6);

        Set<Integer> integers = new HashSet<>(list);
        int count  = 0;

        for (Integer i : integers) {
            if (Collections.frequency(list, i) > 1)
                count++;
        }
        System.out.println(integers);
        return count;
    }


    public static void stringTest(String str) {
        List<String> list = Arrays.asList(str.split(""));
        HashSet<String> set = new HashSet<>(list);
        for (String s : set) {
            System.out.println(s + "---------------" + Collections.frequency(list, s));
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        stringTest("HIMALAYA");
    }

}
