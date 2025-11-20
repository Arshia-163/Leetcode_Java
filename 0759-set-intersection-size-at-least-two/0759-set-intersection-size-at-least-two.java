class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        
         // Sort by end increasing, and if equal, start decreasing
           Arrays.sort(intervals, (a, b) -> 
            a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]
        );

        int count =0;
        int p1 =-1;
        int p2=-1;

for(int[] i : intervals){
    int strt = i[0];
    int end = i[1];

    boolean p1_in = (p1>= strt && p1<=end);
    boolean p2_in = (p2>= strt && p2<=end);

    if(p1_in && p2_in) continue; // agr dono inside hai toh skip

    if(p1_in || p2_in) {
        count++;
        p2 = p1;
        p1 = end;
    }
else{
    count  += 2;
    p2 = end-1;
    p1=end;
}
}
return count;

    }
}