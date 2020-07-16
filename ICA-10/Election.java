import java.util.Scanner;

public class Election {

    /* New scanner object */
    static Scanner input = new Scanner(System.in);

    /* Main method */
    public static void main(String[] args){

        int[] votes = new int[5];
        String[] candidates = new String[5];
        int maxValue = votes[0]; //The maximum value inside the array cars
        int winner = 0; //Position inside the array
        int totalVotes = 0;

        for (int i = 0; i < votes.length; i++){
            System.out.println("Enter the name of the candidate: ");
            candidates[i] = input.next();
            System.out.println("Enter how many votes he received: ");
            votes[i] = input.nextInt();
            totalVotes += votes[i];

            if(maxValue < votes[i])
            {
                maxValue = votes[i];
                winner = i;
            }
        }

        /* Output the result */
        System.out.println("Candidate \t Votes Received \t % of Total Votes");
        System.out.printf("%s \t %5d \t %18.2f %n", candidates[0], votes[0], ((double) votes[0] * 100 / totalVotes));
        System.out.printf("%s \t %9d \t %18.2f %n", candidates[1], votes[1], ((double) votes[1] * 100 / totalVotes));
        System.out.printf("%s \t %9d \t %18.2f %n", candidates[2], votes[2], ((double) votes[2] * 100 / totalVotes));
        System.out.printf("%s \t %5d \t %18.2f %n", candidates[3], votes[3], ((double) votes[3] * 100 / totalVotes));
        System.out.printf("%s \t %5d \t %18.2f %n", candidates[4], votes[4], ((double) votes[4] * 100 / totalVotes));
        System.out.println("Total of votes is " + totalVotes);
        System.out.println("The winner of the election is " + candidates[winner] + " with " + votes[winner] + " votes.");
    }

}

/*
ICA-3
--------
Write a program (Election.java) that allows the user to enter the last names of five
candidates in a local election and the votes received by each candidate.

The program should then output each candidate’s name, the votes received
by that candidate, and the percentage of the total votes received by the
candidate.

Your program should also output the winner of the election.

A sample output is:

Enter candidate's name and the votes received by the candidate
Johnson 50001
Miller 4000
Duffy 6000
Robinson 2500
Ashtony 1800
Candidate     Votes Received     % of Total Votes
Johnson        50001               77.76
Miller            4000                6.22
Duffy             6000                9.33
Robinson       2500                3.89
Ashtony         1800                2.80
Total            64301
The Winner of the Election is Johnson.
*/