public class ChocolateDistributionProblem {
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        long mindiff=Long.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            mindiff=Math.min(a.get(i+m-1)-a.get(i),mindiff);
        }
        return mindiff;
    }
}
