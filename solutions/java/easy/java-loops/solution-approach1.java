// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
// Problem     Java Loops II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-31, 11:13 p.m.
// ──────────────────────────────────────────────────


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int current = a;
            for (int j = 0; j < n; j++) {
                current += (1 << j) * b;
                System.out.print(current + (j == n - 1 ? "" : " "));
            }
            System.out.println();
        }
        in.close();
    }
}
