
// LINK: https://leetcode.com/problems/restore-finishing-order/?envType=problem-list-v2&envId=array
public class RestoreFinishingOrder {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans=new int[friends.length];
        int index=0;

        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(friends[j]==order[i]){
                    ans[index]=order[i];
                    index++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        RestoreFinishingOrder solution = new RestoreFinishingOrder();
        int[] order = {2, 0, 1, 3};
        int[] friends = {0, 1, 3};
        int[] result = solution.recoverOrder(order, friends);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
