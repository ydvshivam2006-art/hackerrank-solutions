// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
// Problem     Java String Tokens
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-07, 08:43 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextLine()) {
            System.out.println(0);
            scan.close();
            return;
        }

        String s = scan.nextLine().trim();
        scan.close();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[^A-Za-z]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
