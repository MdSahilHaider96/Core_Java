package Feb5th2026.Arrays;

public class MinNumberJumps {
    public static void main(String[] args) {
        int[] arr = {12,13,1,10,4,6,2,1};
        int jumps=0, currEnd=0, farthest=0;
        for(int i=0;i<arr.length-1;i++){
            farthest = Math.max(farthest, i+arr[i]);
            if(i==currEnd){
                jumps++;
                currEnd = farthest;
            }
        }
        System.out.println("Min jumps: "+jumps);
    }
}
