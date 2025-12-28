// LINK: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/?envType=problem-list-v2&envId=array

public class MoveAllBallstoEachBox {
    public int[] minOperations(String boxes) {
        int[] ans=new int[boxes.length()];

        for(int i=0;i<boxes.length();i++){
            int steps=0;
            for(int j=0;j<boxes.length();j++){
                if(i==j){
                    continue;
                }
                if(boxes.charAt(j)=='1'){
                    steps+=Math.abs(i-j);
                }
            }
            ans[i]=steps;
        }

        return ans;
    }

    public static void main(String[] args) {
        MoveAllBallstoEachBox solution = new MoveAllBallstoEachBox();
        String boxes = "110";
        int[] result = solution.minOperations(boxes);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
