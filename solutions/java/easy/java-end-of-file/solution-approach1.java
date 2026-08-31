// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
// Problem     Java End-of-file
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-31, 11:18 p.m.
// ──────────────────────────────────────────────────


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        scanner.close();
    }
}
