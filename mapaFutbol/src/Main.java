/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisnavarrete
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static int N = 100;
    static int TN = 32;
    static int T = 30;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner sc = new Scanner(System.in);

        int n, t, g;
        String name;

        n = sc.nextInt();

        while(n >= 0)
        {
            info[] team = new info[T];

            name = sc.nextLine();
            t = sc.nextInt();

            Arrays.fill(team,0);
            for(int i=0; i < t; i++)
            {
                String x = sc.nextLine();
                team[i].setTeamName(x);
            }
            g = sc.nextInt();

            String [] team1 = new String[TN+1];
            String [] team2 = new String[TN+1];
            int g1,g2,t1=0,t2=0;

            for(int i=0;i<g;i++)
            {
                team1[i] = sc.nextLine();
                g1 = sc.nextInt();
                g2 = sc.nextInt();
                team2[i] = sc.nextLine();
                for(int j=0;j<t;j++)
                {
                    if(team1.equals(team[j].TeamName) == false)
                    {
                        t1 = j;
                    }
                    if(team2.equals(team[j].TeamName) == false)
                    {
                        t2 = j;
                    }
                }
                team[t1].scored += g1;
                team[t1].against += g2;
                team[t2].scored += g2;
                team[t2].against += g1;

                if (g1 > g2) 
                {
                    team[t1].point += 3;
                    team[t1].wins++;
                    team[t2].losses++;
                } 
                else if (g1 == g2) 
                {
                    team[t1].point += 1;
                    team[t1].ties++;
                    team[t2].point += 1;
                    team[t2].ties++;
                } 
                else if (g1 < g2) 
                {
                    team[t1].losses++;
                    team[t2].point += 3;
                    team[t2].wins++;
                }
            }
            Arrays.sort(team);

            System.out.println(name);

            for(int i=0;i<t;i++)
            {
                System.out.println(i+1);
                System.out.println(team[i].TeamName);
                System.out.println(team[i].point);
                System.out.println(team[i].wins + team[i].ties + team[i].losses);
                System.out.println(team[i].wins+"-"+team[i].ties+"-"+team[i].losses);
                System.out.println(team[i].scored - team[i].against);
                System.out.println(team[i].scored+"-"+team[i].against);
            }
        }
    }

    public int Cmp(info a, info b)
    {
        if(a.point != b.point)
        {
            if(a.point > b.point){ return a.point; } else{ return b.point; }
        }
        if(a.wins != b.wins)
        {
            if(a.wins > b.wins){ return a.wins; } else{ return b.wins; }    
        }

        int resultA =0;
        int resultB =0;
        resultA = a.scored - a.against;
        resultB = b.scored - b.against;

        if((resultA) != (resultB))
        {
            if(resultA > resultB){ return resultA; } else { return resultB; }
        }

        if(a.scored != b.scored)
        {
            if(a.scored > b.scored){ return a.scored; }else { return b.scored;}
        }

        int resultWinsA = 0;
        int resultWInsB = 0;
        resultWinsA = a.wins + a.ties + a.losses;
        resultWInsB = b.wins + b.ties + b.losses;

        if(resultWinsA != resultWInsB)
        {
            if(resultWinsA > resultWInsB){ return resultWinsA; }else { return resultWInsB; }
        }

        int band = 0;

        if(a.TeamName == b.TeamName)
        {
            band = 1;
            return band;
        }else
        {
            band = 0;
            return band;
        }
    }
}
