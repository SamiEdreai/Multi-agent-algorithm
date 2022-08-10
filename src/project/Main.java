package project;

import java.util.Scanner;

public class Main {

    public static void main(int n,int d,int p1,int p2) {

        Scanner scanner = new Scanner(System.in);
        int numberOfAgents = scanner.nextInt();
        Agent agent = new Agent(numberOfAgents);
        System.out.println(agent);

    }

}
