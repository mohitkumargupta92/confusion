package org.confusion;

public class Codility1 {


    public int solution(int[] A) {
        int brushCount = 0;
        int prevHeight = 0;
        for(int i =0;i< A.length;i++){
            if(A[i] > prevHeight){
                brushCount = brushCount+(A[i]-prevHeight);
            }
            prevHeight = A[i];
        }
        return brushCount;
    }
}
