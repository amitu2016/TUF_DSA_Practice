package sebi.previous.y2022;

import java.util.*;

/*Solve the following question in java
Currently the fifth edition of Indian Premier League (IPL-5) is going on and the overall point table is changing after every match. The point table is based on the match result (win/loss) and the net run rate of each team.

You have to write a C/Java program to create point table from the results of given set of matches. You will also have to find the net run rate of each team. Consider the following while preparing the point table:

1.      The net-run rate of each team is summed up after every match.

2.      The team which has better net run rate is the winner of the match

3.      The team winning the match, is awarded 2 points. In case of loss, no point will be deducted from the losing team.

4.      If the run rate of both teams is same in a particular match, the match will be is consider as draw and 1 point will be awarded to each team.

5.      If two teams have same points, the team who has better net run-rate will be up in the table.

Note: Assume no two teams will have same points as well as same net run-rate.  

Input specification:
1.  First line will contains an integer N indicating number of teams
2. Next N lines will be the names of the teams, a single string (0 < length of string < 20)
3.      Next line will contain an integer M indicating number of matches
4.      Next M line will contain the match result. In the following format

Output specification:
1. Print the team name, total points and net run rate in decreasing order of their standing in the point table. Points for each team should be printed on a separate line
2.  Output should be terminated by a new line character.

Sample I/O:
Sample Input
4
A
B
C
D
5
A 1.0 B 2.0
B 1.0 C 2.1
D 2.5 A 1.2
B 1.5 D 1.0
C 1.2 A 2.0

Sample Output

B 4 4.50
A 2 4.20
D 2 3.50
C 2 3.30*/



class Team {
    String name;
    int points;
    double netRunRate;

    public Team(String name) {
        this.name = name;
        this.points = 0;
        this.netRunRate = 0.0;
    }
}

public class IPLPointTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of teams
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Map to store teams and their details
        Map<String, Team> teams = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String teamName = sc.nextLine();
            teams.put(teamName, new Team(teamName));
        }

        // Number of matches
        int m = sc.nextInt();
        sc.nextLine(); // consume newline

        // Process matches
        for (int i = 0; i < m; i++) {
            String match = sc.nextLine();
            String[] details = match.split(" ");
            String team1 = details[0];
            double nrr1 = Double.parseDouble(details[1]);
            String team2 = details[2];
            double nrr2 = Double.parseDouble(details[3]);

            // Update net run rates
            teams.get(team1).netRunRate += nrr1;
            teams.get(team2).netRunRate += nrr2;

            // Determine match result
            if (nrr1 > nrr2) {
                teams.get(team1).points += 2; // Team 1 wins
            } else if (nrr2 > nrr1) {
                teams.get(team2).points += 2; // Team 2 wins
            } else {
                teams.get(team1).points += 1; // Draw
                teams.get(team2).points += 1;
            }
        }

        // Sort teams based on points and net run rate
        List<Team> teamList = new ArrayList<>(teams.values());
        teamList.sort((t1, t2) -> {
            if (t2.points != t1.points) {
                return t2.points - t1.points; // Sort by points
            } else {
                return Double.compare(t2.netRunRate, t1.netRunRate); // Sort by net run rate
            }
        });

        // Print the result
        for (Team team : teamList) {
            System.out.printf("%s %d %.2f%n", team.name, team.points, team.netRunRate);
        }

        sc.close();
    }
}
