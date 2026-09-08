// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
// Problem     Java Regex
// Difficulty  Medium
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-08, 07:18 p.m.
// ──────────────────────────────────────────────────


class MyRegex {
    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}
