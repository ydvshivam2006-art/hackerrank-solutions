// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
// Problem     Java Loops I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-31, 11:08 p.m.
// ──────────────────────────────────────────────────


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        bufferedReader.close();
    }
}
