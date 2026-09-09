// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
// Problem     Java BigDecimal
// Difficulty  Medium
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-09, 10:54 p.m.
// ──────────────────────────────────────────────────


Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {
    public int compare(String a1, String a2) {
        BigDecimal b1 = new BigDecimal(a1);
        BigDecimal b2 = new BigDecimal(a2);
        return b1.compareTo(b2);
    }
}));
